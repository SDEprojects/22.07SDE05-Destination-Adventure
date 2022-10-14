package com.destination.adventure.view;

/**
 * The view class contains the text and ascii that the user sees throughout the game play.
 * These are stored in fields.
 */

public class View {

  private final String TITLE = "\n"
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

  private final String OBJECTIVE = "\nThere is a treasure to be found in this world, one that will take away all your worries.\n"
      + "In order to find it, you must travel to various destinations around the world to find the jewels that will lead you there.\n"
      + "There are 6 jewels hidden around the world. Find at least 4, and you will find the treasure.";

  private final String HELP = "Skip: No worries! Let's review our objectives!\n"
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

