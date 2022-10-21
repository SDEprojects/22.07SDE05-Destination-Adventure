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

  public static final String LOSE = "\n"
      + "  ██╗░░░██╗░█████╗░██╗░░░██╗  ██╗░░░░░░█████╗░░██████╗███████╗██╗\n"
      + "  ╚██╗░██╔╝██╔══██╗██║░░░██║  ██║░░░░░██╔══██╗██╔════╝██╔════╝██║\n"
      + "  ░╚████╔╝░██║░░██║██║░░░██║  ██║░░░░░██║░░██║╚█████╗░█████╗░░██║\n"
      + "  ░░╚██╔╝░░██║░░██║██║░░░██║  ██║░░░░░██║░░██║░╚═══██╗██╔══╝░░╚═╝\n"
      + "  ░░░██║░░░╚█████╔╝╚██████╔╝  ███████╗╚█████╔╝██████╔╝███████╗██╗\n"
      + "  ░░░╚═╝░░░░╚════╝░░╚═════╝░  ╚══════╝░╚════╝░╚═════╝░╚══════╝╚═╝";
  public static final String OBJECTIVE =
      "\n There is a treasure to be found in this world, one that will take away all your worries.\n"
          + " In order to find it, you must travel to various destinations around the world to find the jewels that will lead you there.\n"
          + " There are 6 jewels hidden around the world. Find at least 4, and you will find the treasure.";

  public static final String HELP = "Skip: No worries! Let's review our objectives!\n"
      + "Objective: you must travel to various destinations around the world to find the jewels that will lead you there.\n"
      + "There are 6 jewels hidden around the world. Find at least 4, and you will find the treasure.\n"
      + "Commands: \n"
      + "status: shows your current location, inventory, and wallet amount.\n"
      + "quit: end the game\n"
      + "teleport: once you have 4 or more jewels in your inventory, type teleport at anytime to go to the secret location\n"
      + "go {destination name}: go to a new destination\n"
      + "visit store: available when you first arrive at a destination. Use this command to visit the airport store.\n"
      + "     look [item name]: review an item's description at the store.\n"
      + "begin: begin the adventure at your current destination to find the jewel!\n";

  public static final String START_ADVENTURE =
      " Before you embark on your journey %S, would you like to visit the bank to increase"
          + " your funds? You currently have $0 in your wallet.\n";

  public static final String BANK_OPTIONS = "\n Would you like to: \n"
      + " (a) rob the bank [type: rob bank]\n"
      + " (b) check your bank account [type: check account]\n"
      + " (c) bypass bank and go to initial adventure [type: no bank]";

  public static final String ROB_OPTION = "\n You have decided to rob the bank!\n"
      + " You hand the teller a note demanding money with no funny business.\n"
      + " Your wallet increases by $10000.\n";

  public static final String CHECK_BANK_ACCOUNT =
      "\n You ask the teller to check your bank account. You have $600.\n"
          + " You choose to withdraw all of your money. You hope you have enough to pay for your adventures!\n";

  public static final String NO_BANK = "\n You decide not to go to the bank. Let's go to the first destination!\n";

  public static final String INPUT_INVALID = " Invalid input. Please try again.\n";

  public static final String STARTING_LOCATION = "\n You washed up on the shores of Seattle. It is time to begin your adventure.\n"
  + " --- Type help at any time to see a list of command options.\n";

  public static final String DECISION = "\n Would you like to play? Type yes or no. ";

  // hard code for sprint 2, refactor in sprint 3
  public static final String DESTINATION = " Where would you like to go? Here are the list of destination: Italy, Ecuador, Australia, Zambia, Hawaii, "
      + "Nepal, and Antarctica!";

  public static final String INVALID = " Input Invalid. Type verb and noun. For example if you want to go to Nepal, type 'go Nepal' ";

  public static final String INVALID_COUNTRY = " Country Name Invalid. Please try again";

  public static final String VALID_COUNTRY = " Great!! We are going to ";

  public static final String AIRPORT = " You have the option to buy something from the airport store. Here is the store inventory: ";
  public static final String AIRPORT_OPTIONS = " You can:\n"
      + " type buy [item] to buy an item from the store.\n"
      + " type look [item] to see a description of the item.\n"
      + " type 'no store' to skip shopping...";

  public static final String BUY = " Type 'buy' followed by the item you want to buy. Do not include spaces!";

  public static final String INVALID_BUY = " Input Invalid! Type 'buy' followed by the item you want to buy.";

  public static final String INVALID_SELECTION = " Input Invalid. Selected option is not available in this store. Type 'buy' followed by the item you want to buy.";

  public static final String VALID_SELECTION = " Great, you are in %s and you have %s in your possession. What would you like to do next?";

  public static final String INVENTORY = " The following is the list of items you have in your possession. ";

}



