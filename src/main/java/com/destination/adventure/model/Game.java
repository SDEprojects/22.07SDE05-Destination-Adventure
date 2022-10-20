package com.destination.adventure.model;

import com.destination.adventure.controller.InputHandler;
import com.destination.adventure.controller.TextParser;
import com.destination.adventure.view.View;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Game {

  private State state;
//  private TextParser input = new TextParser();
  private Player player = new Player();
  private View view = new View();
  private InputHandler handler = new InputHandler();
  private World worldClass = new World();



  public Game(State state) throws IOException {
//    populateDestination();
    this.state = state;
  }

  //Display title
  public void startGame() {
    System.out.println(View.TITLE);
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
    goToBank(player);

    while (true) {
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
      System.out.println(worldClass.world.get(countryName).getDescription());
      goTOAirport(countryName);

      // Provide player with tips to get the jewel at that location
      System.out.println(worldClass.guidePrompts.get(countryName).getInstructions());
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
  public void goToBank(Player player) {

    // prompt the user if they would like to visit the bank
    System.out.printf(View.START_ADVENTURE, player.getName());

    // while loop
    while (true) {
      // give the user two options: rob the bank or check bank account
      System.out.println(View.BANK_OPTIONS);
      String[] response = handler.processInput(player);

      // if user input is rob bank, rob the bank
      if (response[0].equalsIgnoreCase("rob")) {
        System.out.println(View.ROB_OPTION);

        // adjust wallet to include $10000
        player.setWallet(10000);
        break;
        // else if user input is check bank account
      } else if (response[0].equalsIgnoreCase("check")) {
        System.out.println(View.CHECK_BANK_ACCOUNT);
        // give the user $600
        player.setWallet(600);
        break;
      } else if (response[0].equalsIgnoreCase("no")) {
        System.out.println(View.NO_BANK);
        break;
      } else {
        // else invalid input, try again
        System.out.println(View.INPUT_INVALID);
      }
    }
  }

  public void goTOAirport(String location) {
    System.out.println(View.AIRPORT);
    System.out.println(Arrays.toString(worldClass.world.get(location).getStore()));

    while (true) {
      String[] response = handler.processInput(player);
      if (response[0].equalsIgnoreCase("buy")) {
        if (worldClass.items.stream().anyMatch(x -> x.getName().equalsIgnoreCase(response[1]))) {
          player.getInventory().add(response[1]);
          player.setWallet(player.getWallet() - 500);
          break;
        }
      } else if (response[0].equalsIgnoreCase("look")) {
        if (worldClass.items.stream().anyMatch(x -> x.getName().equalsIgnoreCase(response[1]))) {
          System.out.println(worldClass.itemsAirport.get(response[1]).getDescription());
        } else {
          System.out.println(View.INPUT_INVALID);
        }
      } else if (response[0].equalsIgnoreCase("no")) {
        System.out.println("You have chosen not to buy anything from the store");
        break;
      } else {
        System.out.println(View.INPUT_INVALID);
      }
    }
  }


  public Boolean beginScenario(String country, Player player) {

    while(true) {
      String[] input = handler.nextInput();
      List<String> list = Arrays.asList(worldClass.world.get(country).getOptions());
      if (input.length < 2) {
        handler.checkInput(input, player);
      }
      else if (list.get(0).equalsIgnoreCase(input[1])) {
        System.out.println(worldClass.guidePrompts.get(country).getJewel());
        return true;
      } else if (list.get(1).equalsIgnoreCase(input[1])) {
        System.out.println(worldClass.guidePrompts.get(country).getLose());
        System.out.println(View.LOSE);
        return false;
      }
    }
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}