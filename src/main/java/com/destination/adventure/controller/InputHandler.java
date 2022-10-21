package com.destination.adventure.controller;

import com.destination.adventure.model.Game;
import com.destination.adventure.model.Player;
import com.destination.adventure.model.State;
import com.destination.adventure.model.World;
import com.destination.adventure.view.PlayMusic;
import com.destination.adventure.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputHandler {

  private TextParser input = new TextParser();

  World worldClass = new World();

  public InputHandler() throws IOException {

  }


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
      String[] answer = input.readUserInput();

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
//      List<String> countries = Arrays.asList(View.COUNTRIES);
      while (true) {
        String[] finalCommand = command;
        if (worldClass.locations.stream()
            .noneMatch(x -> x.getName().equalsIgnoreCase(finalCommand[1]))) {
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
    System.out.println(" What would you like to do?");
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
      System.out.println("Location: " + player.getCurrentLocation());
      System.out.println("Wallet $" + player.getWallet());
      System.out.println("Inventory: " + player.getInventory());
    } else if (text[0].equalsIgnoreCase("inventory")) {
      System.out.println(View.INVENTORY);
      System.out.println(player.getInventory());

    } else if (text[0].equalsIgnoreCase("stop") && text[1].equalsIgnoreCase("music")) {
      PlayMusic.clip.stop();
    } else if (text[0].equalsIgnoreCase("play") && text[1].equalsIgnoreCase("music")) {
      PlayMusic.clip.start();
    } else if (text[0].equalsIgnoreCase("decrease") && text[1].equalsIgnoreCase("volume")) {
      PlayMusic.decreaseVolume();
    }
    else if (text[0].equalsIgnoreCase("increase") && text[1].equalsIgnoreCase("volume")) {
      PlayMusic.increaseVolume();
    }
  }
}
