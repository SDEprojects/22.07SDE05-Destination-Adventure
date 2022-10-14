package com.destination.adventure.model;

import com.destination.adventure.view.View;

public class Game {

  private State state;
  private TextParser input = new TextParser();
  private Player player = new Player();
  private View view = new View();

  public Game(State state) {
    this.state = state;
  }

  public void startGame() {
    System.out.println(view.getTITLE());
    playerSetUp();
    objective();
  }

  // grab player name to create player instance in main class
  public void playerSetUp() {
    // Prompt user for name
    System.out.println("\nHmm, you look new around here...\n"
        + "What is your name?");
    String[] command = input.readUserInput();
    System.out.printf("\nWelcome to Destination Adventure, %s! I am your tour guide, Skip!%n",
        command[0]);
    player.setName(command[0]);
  }

  public void objective() {
    // Game Description
    System.out.println(view.getOBJECTIVE());
  }


  // use .equals() to compare strings for equality
  public boolean playOrNot() {
    while (true) {
      System.out.println("\nWould you like to play? Type yes or no.");
      String[] answer = input.readUserInput();
      checkInput(answer);
      if (answer[0].equals("yes")) {
        return true;
      } else if (answer[0].equals("no")) {
        return false;
      } else {
        System.out.println("Please enter either yes or no.");
      }
    }
  }

  public String[] nextInput () {
    // TODO: Edit to take in player's current location
    System.out.printf("You are in %s, what would you like to do next? --- Type help at any time.", player.getCurrentLocation());
    return input.readUserInput();
  };

  // put at top of while loop so user input is constantly checking against these commands
  public void checkInput(String[] text) {
    if (text[0].equalsIgnoreCase("quit")) {
      System.out.println("Quitting the game!!");
      System.exit(0);
    }
    else if (text[0].equalsIgnoreCase("help")) {
      System.out.println(view.getHELP());
    }
    else if (text[0].equalsIgnoreCase("status")) {
      System.out.println("Here is your current status:\n");
      System.out.println(player.getCurrentLocation());
      System.out.println("$" + player.getWallet());
      System.out.println(player.getInventory());
    }
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}

