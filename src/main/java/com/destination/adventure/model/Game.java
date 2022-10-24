package com.destination.adventure.model;

import com.destination.adventure.controller.InputHandler;
import com.destination.adventure.view.PlayMusic;
import com.destination.adventure.view.View;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Game {

  // FIELDS
  private State state;
  // Player Instance within Game
  private Player player = new Player();
  private InputHandler handler = new InputHandler();
  private World worldClass = new World();

  // CONSTRUCTOR
  public Game(State state) throws IOException {
    this.state = state;
  }

  // METHODS
  //Display title and begin game music
  public void startGame() {
//    PlayMusic.RunMusic("music.wav");
    System.out.println(View.TITLE);
  }

  // No longer returns Player. We will not use the Player instance in the Main class
  public void playerSetUp() {
    String playerName = handler.setUp();
    player.setName(playerName);
  }

  //  Display game information to user
  public void intro() {
    System.out.println(View.OBJECTIVE);
  }

  public void objective() {
    System.out.println(View.WELCOME_OBJECTIVE);
  }

  public Boolean playGame() {
    System.out.println(View.STARTING_LOCATION);
    Boolean robOrFail = goToBank(player);
    // end game if player fails to rob the bank
    if (!robOrFail) {
      return false;
    }

    while (true) {
      // check player inventory before each destination round to determine if win game:
      Boolean jewel = player.checkJewels();
      if (jewel) {
        // added win scenario
        System.out.println(View.WIN_SCENARIO);
        System.out.println(View.WIN);
        return true;
      }
      // give user destination options
      System.out.println(View.DESTINATION);
      // grab user input
      String countryName = handler.countryInputProcessor(player);
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
    // give the user two options: rob the bank or check bank account
    System.out.println(View.BANK_OPTIONS);
    String response = handler.bankInputProcessor(player);
    // if user input is rob bank, rob the bank
    if (response.equalsIgnoreCase("rob")) {
      if (getRandomNum(1, 100) > 50) {
        System.out.println(View.ROB_OPTION);
        // adjust wallet to include $10000
        player.setWallet(10000);
        return true;
      } else {
        System.out.println("\n You took your chances and were arrested!");
        System.out.println(View.BUSTED);
        System.out.println(View.LOSE);
        return false;
      }
      // else if user input is check bank account
    } else if (response.equalsIgnoreCase("check")) {
      System.out.println(View.CHECK_BANK_ACCOUNT);
      // give the user $2000
      player.setWallet(2000);
      return true;
    } else if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("bypass")) {
      System.out.println(View.NO_BANK);
      return true;
    }
    return null;
  }

  public void goToAirport(String location) {
    System.out.println(View.AIRPORT);
    System.out.println(" " + Arrays.toString(worldClass.world.get(location).getStore()) + "\n");
    System.out.println(View.AIRPORT_OPTIONS);

    while(true){
      String[] response = handler.airportInputProcessor(player);
      if (response[0].equalsIgnoreCase("buy")) {
        if (player.getWallet() < worldClass.itemsAirport.get(response[1]).getPrice()
            || player.getWallet() - worldClass.itemsAirport.get(response[1]).getPrice() < 0) {
          System.out.println(" You do not have enough money for this item.");
        } else {
          player.getInventory().add(response[1]);
          player.setWallet(player.getWallet() - worldClass.itemsAirport.get(response[1]).getPrice());
          break;
        }
      } else if (response[0].equalsIgnoreCase("look")) {
        System.out.println(" $" + worldClass.itemsAirport.get(response[1]).getPrice() + ", "
            + worldClass.itemsAirport.get(response[1]).getDescription());
      } else if (response[0].equalsIgnoreCase("no") || response[0].equalsIgnoreCase("bypass")) {
        System.out.println(" You have chosen not to buy anything from the store");
        break;
      }
    }
  }


  public Boolean beginScenario(String country, Player player) {

      String[] input = handler.scenarioInputProcessor(country, player);
      List<String> optionList = Arrays.asList(worldClass.world.get(country).getOptions());
      List<String> storeList = Arrays.asList(worldClass.world.get(country).getStore());

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
        System.out.println(" " + worldClass.guidePrompts.get(country).getLose());
        System.out.println(View.LOSE);
        return false;
      }
    return null;
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