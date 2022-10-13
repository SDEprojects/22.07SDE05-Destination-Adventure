package com.destination.adventure;

import java.util.ArrayList;

public class Game {

  private State state;
  private TextParser input = new TextParser();

  private Player player = new Player();

  public Game(State state) {
    this.state = state;
  }

  public void startGame() {
    System.out.println("\n"
        + "██████╗░███████╗░██████╗████████╗██╗███╗░░██╗░█████╗░████████╗██╗░█████╗░███╗░░██╗\n"
        + "██╔══██╗██╔════╝██╔════╝╚══██╔══╝██║████╗░██║██╔══██╗╚══██╔══╝██║██╔══██╗████╗░██║\n"
        + "██║░░██║█████╗░░╚█████╗░░░░██║░░░██║██╔██╗██║███████║░░░██║░░░██║██║░░██║██╔██╗██║\n"
        + "██║░░██║██╔══╝░░░╚═══██╗░░░██║░░░██║██║╚████║██╔══██║░░░██║░░░██║██║░░██║██║╚████║\n"
        + "██████╔╝███████╗██████╔╝░░░██║░░░██║██║░╚███║██║░░██║░░░██║░░░██║╚█████╔╝██║░╚███║\n"
        + "╚═════╝░╚══════╝╚═════╝░░░░╚═╝░░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░╚════╝░╚═╝░░╚══╝\n"
        + "\n"
        + "░█████╗░██████╗░██╗░░░██╗███████╗███╗░░██╗████████╗██╗░░░██╗██████╗░███████╗\n"
        + "██╔══██╗██╔══██╗██║░░░██║██╔════╝████╗░██║╚══██╔══╝██║░░░██║██╔══██╗██╔════╝\n"
        + "███████║██║░░██║╚██╗░██╔╝█████╗░░██╔██╗██║░░░██║░░░██║░░░██║██████╔╝█████╗░░\n"
        + "██╔══██║██║░░██║░╚████╔╝░██╔══╝░░██║╚████║░░░██║░░░██║░░░██║██╔══██╗██╔══╝░░\n"
        + "██║░░██║██████╔╝░░╚██╔╝░░███████╗██║░╚███║░░░██║░░░╚██████╔╝██║░░██║███████╗\n"
        + "╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚══╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝");
  }

  // grab player name to create player instance in main class
  public Player playerSetUp() {
    // Prompt user for name
    System.out.println("\nHmm, you look new around here...\n"
        + "What is your name?");
    String[] command = input.readUserInput();
    System.out.printf("\nWelcome to Destination Adventure, %s! I am your tour guide, Skip!%n",
        command[0]);
    player.setName(command[0]);
    // return player object
    return player;
  }

  public void objective() {
    // Game Description
    System.out.println(
        "\nThere is a treasure to be found in this world, one that will take away all your worries.\n"
            + "In order to find it, you must travel to various destinations around the world to find the jewels that will lead you there.\n"
            + "There are 6 jewels hidden around the world. Find at least 4, and you will find the treasure.");
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
    System.out.println("You have landed in Seattle, what would you like to do next? --- Type help at any time.");
    return input.readUserInput();
  };

  // put at top of while loop so user input is constantly checking against these commands
  public void checkInput(String[] text) {
    if (text[0].equalsIgnoreCase("quit")) {
      System.out.println("Quitting the game!!");
      System.exit(0);
    }
    // TODO: User can type help to see a list of commands
    else if (text[0].equalsIgnoreCase("help")) {
      System.out.println("Skip: No worries! Let's review our objectives!");
      // TODO: Add more thorough help instructions
      //  user objective - 4+ jewels unlocks teleport option for user to treasure
      //  user move/command options (before travel, during travel, quit game)
      //  user inventory (what do you currently have)
    }
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }
}

