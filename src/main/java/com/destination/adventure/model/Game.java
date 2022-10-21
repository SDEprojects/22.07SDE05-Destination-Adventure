package com.destination.adventure.model;

import com.destination.adventure.controller.InputHandler;
import com.destination.adventure.controller.TextParser;
import com.destination.adventure.view.PlayMusic;
import com.destination.adventure.view.View;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Game {

  private State state;
  //  private TextParser input = new TextParser();
  private Player player = new Player();
  //  private View view = new View();
  private InputHandler handler = new InputHandler();
  private World worldClass = new World();


  public Game(State state) throws IOException {
//    populateDestination();
    this.state = state;
  }

  //Display title
  public void startGame() {
    System.out.println(View.TITLE);
//    PlayMusic.RunMusic("music.wav");
  }


  // Prompt user for name and Welcome message.
  public Player playerSetUp() {
    String[] command = handler.setUp();
    player.setName(command[0]);
    return player;
  }

  //  Display game objective
  public void objective() {
    System.out.println(View.OBJECTIVE);
  }

  public Boolean playGame() {
    System.out.println(View.STARTING_LOCATION);
    Boolean robOrFail = goToBank(player);

    if (!robOrFail) {
      return false;
    }

    while (true) {
      // check player inventory before each destination round to determine if win game:
      Boolean jewel = player.checkJewels();
      if (jewel) {
        System.out.println(View.WIN);
        return true;
      }

      // give user destination options
      System.out.println(View.DESTINATION);
      // grab user input
      String[] input = handler.processInput(player);

      // validate input
      if (input.length < 2) {
        System.out.println(View.INVALID);
        continue;
      }

      String countryName = input[1];
      player.setCurrentLocation(countryName);
      // Introduce player to location
      System.out.println("\n " + worldClass.world.get(countryName).getDescription());
      goToAirport(countryName);

      // Provide player with tips to get the jewel at that location
      System.out.println("\n " + worldClass.guidePrompts.get(countryName).getInstructions());
      // begin scenario

      Boolean result = beginScenario(countryName, player);
      if (result) {
        player.getInventory().add("jewel");
      } else {
        break;
      }
    }
    return false;
  }


  // SEATTLE HARD CODING
  // bank method
  public Boolean goToBank(Player player) {

    // prompt the user if they would like to visit the bank
    System.out.printf(View.START_ADVENTURE, player.getName());

    // while loop
    while (true) {
      // give the user two options: rob the bank or check bank account
      System.out.println(View.BANK_OPTIONS);
      String[] response = handler.processInput(player);

      // if user input is rob bank, rob the bank
      if (response[0].equalsIgnoreCase("rob")) {
        if (getRandomNum(1,100) > 50) {
          System.out.println(View.ROB_OPTION);
          // adjust wallet to include $10000
          player.setWallet(10000);
          return true;
        } else {
          System.out.println(" You took your chances and were arrested!");
          System.out.println(View.BUSTED);
          System.out.println(View.LOSE);
          return false;
        }

        // else if user input is check bank account
      } else if (response[0].equalsIgnoreCase("check")) {
        System.out.println(View.CHECK_BANK_ACCOUNT);
        // give the user $2000
        player.setWallet(2000);
        return true;
      } else if (response[0].equalsIgnoreCase("no")) {
        System.out.println(View.NO_BANK);
        return true;
      } else {
        // else invalid input, try again
        System.out.println(View.INPUT_INVALID);
      }
    }
  }

  public void goToAirport(String location) {
    System.out.println(View.AIRPORT);
    System.out.println(" " + Arrays.toString(worldClass.world.get(location).getStore()) + "\n");
    System.out.println(View.AIRPORT_OPTIONS);

    while (true) {
      String[] response = handler.processInput(player);
      if (response[0].equalsIgnoreCase("buy")) {
        if (worldClass.items.stream().anyMatch(x -> x.getName().equalsIgnoreCase(response[1]))) {
          if (player.getWallet() < worldClass.itemsAirport.get(response[1]).getPrice()
              || player.getWallet() - worldClass.itemsAirport.get(response[1]).getPrice() < 0) {
            System.out.println(" You do not have enough money for this item.");
          } else {
            player.getInventory().add(response[1]);
            player.setWallet(
                player.getWallet() - worldClass.itemsAirport.get(response[1]).getPrice());
            break;
          }
        }
      } else if (response[0].equalsIgnoreCase("look")) {
        if (worldClass.items.stream().anyMatch(x -> x.getName().equalsIgnoreCase(response[1]))) {
          System.out.println(" $" + worldClass.itemsAirport.get(response[1]).getPrice() +", " + worldClass.itemsAirport.get(response[1]).getDescription());
        } else {
          System.out.println(View.INPUT_INVALID);
        }
      } else if (response[0].equalsIgnoreCase("no")) {
        System.out.println(" You have chosen not to buy anything from the store");
        break;
      } else {
        System.out.println(View.INPUT_INVALID);
      }
    }
  }


  public Boolean beginScenario(String country, Player player) {

    while (true) {
      String[] input = handler.nextInput();
      List<String> optionList = Arrays.asList(worldClass.world.get(country).getOptions());
      List<String> storeList = Arrays.asList(worldClass.world.get(country).getStore());

      if (input.length < 2) {
        handler.checkInput(input, player);
        continue;
      }

      if (optionList.get(0).equalsIgnoreCase(input[1])) {
        if (player.getInventory().contains(storeList.get(0).toLowerCase())) {
          System.out.println(" " + worldClass.guidePrompts.get(country).getJewel());
          return true;
        } else {
          System.out.println(" You chose the wrong item for this adventure");
          System.out.println(View.LOSE);
          return false;
        }
      } else if (optionList.get(1).equalsIgnoreCase(input[1])) {
        System.out.println(worldClass.guidePrompts.get(country).getLose());
        System.out.println(View.LOSE);
        return false;
      }
    }
  }

  public int getRandomNum(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}