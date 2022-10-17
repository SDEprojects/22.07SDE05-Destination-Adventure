package com.destination.adventure.view;

/**
 * The view class contains the text and ascii that the user sees throughout the game play.
 * These are stored in fields.
 */

public class View {

  private static final String TITLE = "\n"
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
      + "╚═╝░░╚═╝╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░╚══╝░░░╚═╝░░░░╚═════╝░╚═╝░░╚═╝╚══════╝";

  private static final String OBJECTIVE = "\nThere is a treasure to be found in this world, one that will take away all your worries.\n"
      + "In order to find it, you must travel to various destinations around the world to find the jewels that will lead you there.\n"
      + "There are 6 jewels hidden around the world. Find at least 4, and you will find the treasure.";

  private static final String HELP = "Skip: No worries! Let's review our objectives!\n"
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

  public static final String BANK_OPTIONS = "Would you like to: \n"
      + "(a) rob the bank [type: rob bank]\n"
      + "(b) check your bank account [type: check account]\n"
      + "(c) bypass bank and go to initial adventure [type: no bank]\n";

  public static final String ROB_OPTION = "You have decided to rob the bank!\n"
      + "You hand the teller a note demanding money with no funny business.\n"
      + "Your wallet increases by $10000.\n";

  public static final String CHECK_BANK_ACCOUNT = "You ask the teller to check your bank account. You have $5000.\n"
      + "You choose to withdraw all of your money. You hope you have enough to pay for your adventures!\n";

  public String getTITLE() {
    return TITLE;
  }

  public String getOBJECTIVE() {
    return OBJECTIVE;
  }

  public String getHELP() {
    return HELP;
  }

}

