package com.destination.adventure.controller;

import com.destination.adventure.model.Player;
import com.destination.adventure.view.View;

public class InputHandler {

  private TextParser input = new TextParser();
  private View view = new View();

  public String[] setUp() {
    System.out.println("\nHmm, you look new around here...\n"
        + "What is your name?");
    String[] command = input.readUserInput();
    System.out.printf("\nWelcome to Destination Adventure, %S! I am your tour guide, Skip!%n",
        command[0]);
    return command;
  }

  public boolean playOrNot() {
    while (true) {
      System.out.println("\nWould you like to play? Type yes or no.");
      String[] answer = nextInput();

      if (answer[0].equals("yes")) {
        return true;
      } else if (answer[0].equals("no")) {
        return false;
      } else {
        System.out.println("Please enter either yes or no.");
      }
    }
  }

  public String[] processInput(Player player) {
    String[] command = input.readUserInput();
    checkInput(command, player);
    return command;
  }


  public String[] nextInput () {
    // TODO: Edit to take in player's current location
    System.out.println("What would you like to do?");
    return input.readUserInput();
  };

  // put at top of while loop so user input is constantly checking against these commands
  public void checkInput(String[] text, Player player) {
    if (text[0].equalsIgnoreCase("quit")) {
      System.out.println("Quitting the game!!");
      System.exit(0);
    }
    else if (text[0].equalsIgnoreCase("help")) {
      System.out.println(view.getHELP());
    }
    else if (text[0].equalsIgnoreCase("status")) {
      System.out.println("Here is your current status:\n");
      System.out.println("Location: " + player.getCurrentLocation().getCountry());
      System.out.println("Wallet $" + player.getWallet());
      System.out.println("Inventory: " + player.getInventory());
    }
  }

}
