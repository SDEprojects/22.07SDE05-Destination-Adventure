package com.destination.adventure.view;

/**
 * The view class contains the text and ascii that the user sees throughout the game play. These are
 * stored in fields.
 */

public class View {

  public static final String TITLE = View.ANSI_YELLOW + "\n"
      + "  ██████╗░███████╗░██████╗████████╗██╗███╗░░██╗░█████╗░████████╗██╗░█████╗░███╗░░██╗\n"
      + "  ██╔══██╗██╔════╝██╔════╝╚══██╔══╝██║████╗░██║██╔══██╗╚══██╔══╝██║██╔══██╗████╗░██║\n"
      + "  ██║░░██║█████╗░░╚█████╗░░░░██║░░░██║██╔██╗██║███████║░░░██║░░░██║██║░░██║██╔██╗██║\n"
      + "  ██║░░██║██╔══╝░░░╚═══██╗░░░██║░░░██║██║╚████║██╔══██║░░░██║░░░██║██║░░██║██║╚████║\n"
      + "  ██████╔╝███████╗██████╔╝░░░██║░░░██║██║░╚███║██║░░██║░░░██║░░░██║╚█████╔╝██║░╚███║\n"
      + "  ╚═════╝░╚══════╝╚═════╝░░░░╚═╝░░░╚═╝╚═╝░░╚══╝╚═╝░░╚═╝░░░╚═╝░░░╚═╝░╚════╝░╚═╝░░╚══╝\n"
      + "\n"
      + "  ░█████╗░██████╗░██╗░░░██╗███████╗███╗░░██╗████████╗██╗░░░██╗██████╗░███████╗\n"
      + "  ██╔══██╗██╔══██╗██║░░░██║██╔════╝████╗░██║╚══██╔══╝██║░░░██║██╔══██╗██╔════╝\n"
      + "  ███████║██║░░██║╚██╗░██╔╝█████╗░░██╔██╗██║░░░██║░░░██║░░░██║██████╔╝█████╗░░\n"
      + "  ██╔══██║██║░░██║░╚████╔╝░██╔══╝░░██║╚████║░░░██║░░░██║░░░██║██╔══██╗██╔══╝░░\n"
      + "  ██║░░██║██████╔╝░░╚██╔╝░░███████╗██║░╚███║░░░██║░░░╚██████╔╝██║░░██║███████╗\n"
      + "  ╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚══╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝"
      + View.ANSI_RESET;
  public static final String PLAYER_NAME =
      "\n Hmm, You look new around here...\n" + " What is your name?";
  public static final String WELCOME = "\n Welcome to Destination Adventure, %S! I am your tour guide. Skip!%n";
  public static final String WIN = View.ANSI_GREEN + "\n"
      + "  █▄█ █▀█ █░█   █░█░█ █ █▄░█\n"
      + "  ░█░ █▄█ █▄█   ▀▄▀▄▀ █ █░▀█" + View.ANSI_RESET;
  public static final String WIN_SCENARIO = View.ANSI_YELLOW
      + " The ground begins to shake around you. You are surrounded by a blinding light\n"
      + " as you feel your body fall beneath you. You are teleported to the treasure!\n"
      + " The riches are beyond what you ever imagined. Congratulations! You have won the game!"
      + View.ANSI_RESET;
  public static final String LOSE = View.ANSI_RED + "\n"
      + "  █▄█ █▀█ █░█   █░░ █▀█ █▀ █▀▀\n"
      + "  ░█░ █▄█ █▄█   █▄▄ █▄█ ▄█ ██▄" + View.ANSI_RESET;
  public static final String BUSTED = View.ANSI_RED + "\n"
      + "  ██████╗░██╗░░░██╗░██████╗████████╗███████╗██████╗░\n"
      + "  ██╔══██╗██║░░░██║██╔════╝╚══██╔══╝██╔════╝██╔══██╗\n"
      + "  ██████╦╝██║░░░██║╚█████╗░░░░██║░░░█████╗░░██║░░██║\n"
      + "  ██╔══██╗██║░░░██║░╚═══██╗░░░██║░░░██╔══╝░░██║░░██║\n"
      + "  ██████╦╝╚██████╔╝██████╔╝░░░██║░░░███████╗██████╔╝\n"
      + "  ╚═════╝░░╚═════╝░╚═════╝░░░░╚═╝░░░╚══════╝╚═════╝░" + View.ANSI_RESET;
  public static final String LOAD =
      " \n Loading....DESTINATION ADVENTURE....\n";
  public static final String OBJECTIVE =
      "\n There is a treasure to be found in this world, one that will take away all your worries.\n"
          + " You will travel the world, facing challenges and unforgettable memories to find it.";
  public static final String WELCOME_OBJECTIVE = View.ANSI_GREEN +
      "\n YOUR OBJECTIVE:\n" + View.ANSI_RESET
      + " In order to find the treasure, you must travel to various destinations around the world to find the jewels that will lead you there.\n"
      + " There are 6 jewels hidden around the world, and 7 different destinations to explore to try and find them!\n"
      + " Find at least 4 jewels, and you will find the treasure.";
  public static final String HELP = View.ANSI_GREEN + "\n Skip:" + View.ANSI_RESET
      + " No worries! Let's review our objectives!\n\n"
      + "  Objective: you must travel to various destinations around the world to find the jewels that will lead you there.\n"
      + "  There are 7 locations, and 6 jewels hidden around the world. Find at least 4 jewels, and you will find the treasure to win the game.\n\n"
      + View.ANSI_GREEN + " Commands: \n" + View.ANSI_RESET
      + "  Music Commands: stop (stops music), play (plays music), decrease (volume down), increase (volume up)\n"
      + "  status: shows your current location, inventory, and wallet amount.\n"
      + "  quit: end the game at any time.\n"
      + "  inventory: view your current inventory\n"
      + "  go {destination name}: go to a new destination (cannot be performed once you begin a destination adventure.)\n"
      + "  look [item name]: review an item's description at the store. (must be at store to see item descriptions.)\n";
  public static final String START_ADVENTURE =
      View.ANSI_GREEN + " Skip: " + View.ANSI_RESET
          + "Before you embark on your journey %S, would you like to visit the bank to increase your funds? \n"
          + " You currently have $0 in your wallet.\n";
  public static final String BANK_OPTIONS = View.ANSI_GREEN + "\n Skip:" + View.ANSI_RESET
      + " You have some options on how you can interact with the bank.\n"
      + " Robbing it is risky, but it's one of em! Type your command: \n"
      + " (a) [rob the bank]\n"
      + " (b) [check bank account]\n"
      + " (c) [no bank] - skip the bank!";
  public static final String ROB_OPTION =
      View.ANSI_GREEN + "\n Skip:" + View.ANSI_RESET + " You successfully rob the bank!\n"
          + " You hand the teller a note demanding money with no funny business.\n"
          + " Your wallet increases by $10,000. Nicely done!";
  public static final String CHECK_BANK_ACCOUNT =
      View.ANSI_GREEN + "\n Skip:" + View.ANSI_RESET
          + " You ask the teller to check your bank account. You have $2000.\n"
          + " You choose to withdraw all of your money. You hope you have enough to pay for your adventures!";
  public static final String NO_BANK = View.ANSI_GREEN + "\n Skip:" + View.ANSI_RESET
      + " You decide not to go to the bank. Let's go to the first destination!\n";
  public static final String INPUT_INVALID = " Invalid input. Please try again.\n";
  public static final String STARTING_LOCATION =
      "\n You washed up on the shores of Seattle. It is time to begin your adventure.\n"
          + " --- Type help at any time to see a list of command options.\n";
  public static final String DECISION = "\n Would you like to play? Type yes or no. ";
  public static final String DESTINATION = View.ANSI_GREEN + "\n Skip:" + View.ANSI_RESET
      + " Where would you like to go? Type go {country name}.\n"
      + " Here are the list of destination: " + View.ANSI_YELLOW
      + "Italy, Ecuador, Australia, Zambia, Hawaii, "
      + "Nepal, and Antarctica!" + View.ANSI_RESET;
  public static final String INVALID_COUNTRY = " Country Name Invalid. Please try again";
  public static final String AIRPORT = View.ANSI_GREEN + "\n Skip:" + View.ANSI_RESET
      + " You have the option to buy something from the airport store. Here is the store inventory: ";
  public static final String AIRPORT_OPTIONS =
      View.ANSI_GREEN + " Skip:" + View.ANSI_RESET + " Welcome to the airport store! You can:\n"
          + " type buy [item] to buy an item from the store.\n"
          + " type look [item] to see a description of the item.\n"
          + " type 'no store' to skip shopping...";
  public static final String INVENTORY = " The following is the list of items you have in your possession:";

  // Colors for text
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
}



