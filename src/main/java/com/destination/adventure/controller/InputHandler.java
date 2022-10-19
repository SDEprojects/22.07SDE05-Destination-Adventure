package com.destination.adventure.controller;

import com.destination.adventure.model.Game;
import com.destination.adventure.model.Player;
import com.destination.adventure.model.State;
import com.destination.adventure.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputHandler {

  private TextParser input = new TextParser();
  private static View view = new View();


  public String[] setUp() {
    System.out.println(View.PLAYER_NAME);
    String[] command = input.readUserInput();
    System.out.printf(View.WELCOME,
        command[0]);
    return command;
  }

  public boolean playOrNot() {
    while (true) {
      System.out.println(View.DECISION);
      String[] answer = nextInput();

      if (answer[0].equals("yes")) {
        return true;
      } else if (answer[0].equals("no")) {
        return false;
      } else {
        System.out.println(View.DECISION);
      }
    }
  }

  public String[] processInput(Player player) {
    String[] command = input.readUserInput();
    if (command[0].equalsIgnoreCase("go")) {
      List<String> countries = Arrays.asList(View.COUNTRIES);
      while (true) {
        if (!countries.contains(command[1])) {
          System.out.println(View.INVALID_COUNTRY);
          command = processInput(player);
        } else {
          // break loop if valid country name is given
          break;
        }
      }
    } else {
      checkInput(command, player);
    }
    return command;
  }


  public String[] nextInput() {
    // TODO: Edit to take in player's current location
    System.out.println("What would you like to do?");
    return input.readUserInput();
  }

  ;

  // put at top of while loop so user input is constantly checking against these commands
  public void checkInput(String[] text, Player player) {
    if (text[0].equalsIgnoreCase("quit")) {
      System.out.println("Quitting the game!!");
      System.exit(0);
    } else if (text[0].equalsIgnoreCase("help")) {
      System.out.println(View.HELP);
    } else if (text[0].equalsIgnoreCase("status")) {
      System.out.println("Here is your current status:\n");
      System.out.println("Location: " + player.getCurrentLocation().getCountry());
      System.out.println("Wallet $" + player.getWallet());
      System.out.println("Inventory: " + player.getInventory());
    } else if (text[0].equalsIgnoreCase("inventory")) {
      System.out.println(View.INVENTORY);
      System.out.println(player.getInventory());
    }
//    else if (text[0].equalsIgnoreCase("go")) {
//        List<String> countries = Arrays.asList(View.COUNTRIES);
//        while(true) {
//          if (countries.contains(text[1])) {
//            System.out.printf("Taking you to: %s!", text[1]);
//            break;
//          } else {
//            System.out.println(View.INVALID_COUNTRY);
//            processInput(player);
//          }
//        }
//
//    }
  }

}
