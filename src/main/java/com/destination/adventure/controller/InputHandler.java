package com.destination.adventure.controller;

import com.destination.adventure.model.Player;
import com.destination.adventure.model.World;
import com.destination.adventure.view.PlayMusic;
import com.destination.adventure.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputHandler {

  // FIELDS
  private final TextParser input = new TextParser();
  World worldClass = new World();
  List<String> options = new ArrayList<String>(Arrays.asList("quit", "help", "status", "inventory", "stop",
      "play", "decrease", "increase"));

  // CONSTRUCTOR
  public InputHandler() throws IOException {
  }

  // METHODS
  public String setUp() {
    System.out.println(View.PLAYER_NAME);
    String[] command = input.readUserInput();
    System.out.printf(View.WELCOME,
        command[0]);
    return command[0];
  }

  public boolean playOrNot() {
    while (true) {
      System.out.println(View.DECISION);
      String[] answer = input.readUserInput();
      if (answer[0].equalsIgnoreCase("yes")) {
        return true;
      } else if (answer[0].equalsIgnoreCase("no")) {
        return false;
      } else {
        System.out.println(View.DECISION);
      }
    }
  }

  public String bankInputProcessor(Player player) {
    while(true) {
      String[] command = input.readUserInput();
      if (options.contains(command[0])) {
        checkInput(command, player);
      } else if (command[0].equalsIgnoreCase("rob") ||
      command[0].equalsIgnoreCase("check") || command[0].equalsIgnoreCase("no")
          || command[0].equalsIgnoreCase("bypass")){
        return command[0];
      } else {
        System.out.println(View.INPUT_INVALID);
      }
    }
  }

  public String countryInputProcessor(Player player) {
    while(true) {
      String[] command = input.readUserInput();
      if (options.contains(command[0])) {
        checkInput(command, player);
      } else if (command[0].equalsIgnoreCase("go")) {
        String[] finalCommand = command;
        if (worldClass.locations.stream()
            .noneMatch(x -> x.getName().equalsIgnoreCase(finalCommand[1]))) {
          System.out.println(View.INVALID_COUNTRY);
        } else {
          // break loop if valid country name is given
          return command[1];
        }
      } else {
        System.out.println(View.INPUT_INVALID);
      }
    }
  }

  public String[] airportInputProcessor(Player player) {
    while(true) {
      String[] command = input.readUserInput();
      if (options.contains(command[0])) {
        checkInput(command, player);
      } else if (command[0].equalsIgnoreCase("buy") ||
          command[0].equalsIgnoreCase("look")) {
        if (!worldClass.items.stream().noneMatch(x -> x.getName().equalsIgnoreCase(command[1]))) {
          return command;
        } else {
          System.out.println(" Please enter a valid item. No spaces.");
        }
      } else if (command[0].equalsIgnoreCase("no")) {
        return command;
      } else {
        System.out.println(View.INPUT_INVALID);
      }
    }
  }

  public String[] scenarioInputProcessor(String country, Player player) {
    List<String> optionList = Arrays.asList(worldClass.world.get(country).getOptions());

    while(true) {
      String[] command = input.readUserInput();
      if (options.contains(command[0])) {
        checkInput(command, player);
      } else if (command[0].equalsIgnoreCase("go") || command[0].equalsIgnoreCase("explore")){
        if (optionList.get(0).equalsIgnoreCase(command[1]) || optionList.get(1).equalsIgnoreCase(command[1])) {
          return command;
        } else {
          System.out.println(" Please pick a valid explore option.");
        }
      } else {
        System.out.println(View.INPUT_INVALID);
      }
    }
  }

  public void checkInput(String[] text, Player player) {
    if (text[0].equalsIgnoreCase("quit")) {
      System.out.println(" Quitting the game!!");
      System.exit(0);
    } else if (text[0].equalsIgnoreCase("help")) {
      System.out.println(View.HELP);
    } else if (text[0].equalsIgnoreCase("status")) {
      System.out.println("\n " + View.ANSI_GREEN + "Skip:" + View.ANSI_RESET + " Here is your current status:\n");
      System.out.println(" Location: " + player.getCurrentLocation().toUpperCase());
      System.out.println(" Wallet $" + player.getWallet());
      System.out.println(" Inventory: " + player.getInventory());
    } else if (text[0].equalsIgnoreCase("inventory")) {
      System.out.println(View.INVENTORY);
      System.out.println(" " + player.getInventory() + "\n");
    } else if (text[0].equalsIgnoreCase("stop")) {
      PlayMusic.clip.stop();
    } else if (text[0].equalsIgnoreCase("play")) {
      PlayMusic.clip.start();
    } else if (text[0].equalsIgnoreCase("decrease")) {
      PlayMusic.decreaseVolume();
    } else if (text[0].equalsIgnoreCase("increase")) {
      PlayMusic.increaseVolume();
    }
  }
}
