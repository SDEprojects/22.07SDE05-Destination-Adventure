package com.destination.adventure.view;

/**
 * The view class contains the text and ascii that the user sees throughout the game play.
 * These are stored in fields.
 */

public class View {

  public static final String TITLE = "\n"
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
      + "  ╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚══╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝";
  public static final String PLAYER_NAME =
      "\n Hmm, You look new around here...\n" + " What is your name?";
  public static final String WELCOME = "\n Welcome to Destination Adventure, %S! I am your tour guide. Skip!%n";
  public static final String WIN = "\n"
      + "  █▄█ █▀█ █░█   █░█░█ █ █▄░█\n"
      + "  ░█░ █▄█ █▄█   ▀▄▀▄▀ █ █░▀█";
  public static final String WIN_SCENARIO = " The ground begins to shake around you. You are surrounded by a blinding light\n"
      + " as you feel your body fall beneath you. You are teleorted to the treasure!\n"
      + " The riches are beyond what you ever imagined. Congratulations! You have won the game!";
  public static final String LOSE = "\n"
      + "  █▄█ █▀█ █░█   █░░ █▀█ █▀ █▀▀\n"
      + "  ░█░ █▄█ █▄█   █▄▄ █▄█ ▄█ ██▄";
  public static final String BUSTED = "\n"
      + "  ██████╗░██╗░░░██╗░██████╗████████╗███████╗██████╗░\n"
      + "  ██╔══██╗██║░░░██║██╔════╝╚══██╔══╝██╔════╝██╔══██╗\n"
      + "  ██████╦╝██║░░░██║╚█████╗░░░░██║░░░█████╗░░██║░░██║\n"
      + "  ██╔══██╗██║░░░██║░╚═══██╗░░░██║░░░██╔══╝░░██║░░██║\n"
      + "  ██████╦╝╚██████╔╝██████╔╝░░░██║░░░███████╗██████╔╝\n"
      + "  ╚═════╝░░╚═════╝░╚═════╝░░░░╚═╝░░░╚══════╝╚═════╝░";
  public static final String LOAD =
      " \nLoading....DESTINATION ADVENTURE....\n";
  public static final String OBJECTIVE = "\n There is a treasure to be found in this world, one that will take away all your worries.\n"
          + " You will travel the world, facing challenges and unforgettable memories to find it.";
  public static final String WELCOME_OBJECTIVE =
      "\n YOUR OBJECTIVE:\n"
          + " In order to find the treasure, you must travel to various destinations around the world to find the jewels that will lead you there.\n"
          + " There are 6 jewels hidden around the world, and 7 different destinations to explore to try and find them!\n"
          + " Find at least 4 jewels, and you will find the treasure.";
  public static final String HELP = "\n Skip: No worries! Let's review our objectives!\n"
      + "   Objective: you must travel to various destinations around the world to find the jewels that will lead you there.\n"
      + "   There are 7 locations, and 6 jewels hidden around the world. Find at least 4 jewels, and you will find the treasure to win the game.\n"
      + " Commands: \n"
      + "   Music Commands: stop (stops music), play (plays music), decrease (volume down), increase (volume up)\n"
      + "   status: shows your current location, inventory, and wallet amount.\n"
      + "   quit: end the game at any time.\n"
      + "   inventory: view your current inventory\n"
      + "   go {destination name}: go to a new destination (cannot be performed once you begin a destination adventure.)\n"
      + "   look [item name]: review an item's description at the store. (must be at store to see item descriptions.)\n";
  public static final String START_ADVENTURE =
      " Skip: Before you embark on your journey %S, would you like to visit the bank to increase your funds? \n"
          + " You currently have $0 in your wallet.\n";
  public static final String BANK_OPTIONS = "\n Skip: You have some options on how you can interact with the bank.\n"
      + " Robbing it is risky, but it's one of em! Type your command: \n"
      + " (a) [rob the bank]\n"
      + " (b) [check bank account]\n"
      + " (c) [no bank] - skip the bank!";
  public static final String ROB_OPTION = "\n Skip: You successfully rob the bank!\n"
      + " You hand the teller a note demanding money with no funny business.\n"
      + " Your wallet increases by $10,000. Nicely done!";
  public static final String CHECK_BANK_ACCOUNT =
      "\n Skip: You ask the teller to check your bank account. You have $2000.\n"
          + " You choose to withdraw all of your money. You hope you have enough to pay for your adventures!";
  public static final String NO_BANK = "\n Skip: You decide not to go to the bank. Let's go to the first destination!\n";
  public static final String INPUT_INVALID = " Invalid input. Please try again.\n";
  public static final String STARTING_LOCATION = "\n You washed up on the shores of Seattle. It is time to begin your adventure.\n"
  + " --- Type help at any time to see a list of command options.\n";
  public static final String DECISION = "\n Would you like to play? Type yes or no. ";
  public static final String DESTINATION = " Skip: Where would you like to go? Here are the list of destination: Italy, Ecuador, Australia, Zambia, Hawaii, "
      + "Nepal, and Antarctica!";
  public static final String INVALID_COUNTRY = " Country Name Invalid. Please try again";
  public static final String AIRPORT = " Skip: You have the option to buy something from the airport store. Here is the store inventory: ";
  public static final String AIRPORT_OPTIONS = " Skip: Welcome to the airport store! You can:\n"
      + " type buy [item] to buy an item from the store.\n"
      + " type look [item] to see a description of the item.\n"
      + " type 'no store' to skip shopping...";
  public static final String INVENTORY = " The following is the list of items you have in your possession:";
}



