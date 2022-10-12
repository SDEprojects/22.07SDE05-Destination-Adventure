package com.destination.adventure;

import java.util.Scanner;

public class Game {

  private State state;

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
  public String playerSetUp() {
    Scanner input = new Scanner(System.in);
    // Prompt user for name
    System.out.println("\nHmm, you look new around here...\n"
        + "What is your name?");
    String name = input.nextLine().trim();
    System.out.printf("\nWelcome to Destination Adventure, %s! I am your tour guide, Skip!%n",
        name);
    // return player name
    return name;
  }

  public void objective() {
    // Game Description
    System.out.println(
        "\nThere is a treasure to be found in this world, one that will take away all your worries.\n"
            + "In order to find it, you must travel to various destinations around the world to find the jewels that will lead you there.\n"
            + "There are 6 jewels hidden around the world. Find at least 4, and you will find the treasure.\n");
  }


  // use .equals() to compare strings for equality
  public String playOrNot() {
    Scanner input = new Scanner(System.in);
    // ask user if they want to play or not

    while (true) {
      System.out.println("\n Would you like to play? Type yes or no.");
      String answer = input.nextLine().trim();
      if (answer.equals("yes")) {
        return "yes";
      } else if (answer.equals("no")) {
        return "no";
      } else {
        System.out.println("Please enter either yes or no.");
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

