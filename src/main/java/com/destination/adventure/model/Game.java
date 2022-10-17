package com.destination.adventure.model;

import com.destination.adventure.view.View;
import java.util.ArrayList;
import java.util.List;

public class Game {

  private State state;
  private List<Destination> destinations;
  private TextParser input = new TextParser();
  private Player player = new Player();
  private View view = new View();

  public Game(State state) {
    populateDestination();
    this.state = state;
  }

  //Display title
  public void startGame() {
    System.out.println(view.getTITLE());
  }

  // Prompt user for name and Welcome message.
  public Player playerSetUp() {
    System.out.println("\nHmm, you look new around here...\n"
        + "What is your name?");
    String[] command = TextParser.readUserInput();
    System.out.printf("\nWelcome to Destination Adventure, %S! I am your tour guide, Skip!%n",
        command[0]);
    player.setName(command[0]);
    return player;
  }

  //  Display game objective
  public void objective() {
    System.out.println(view.getOBJECTIVE());
  }


  // use .equals() to compare strings for equality
  public boolean playOrNot() {
    while (true) {
      System.out.println("\nWould you like to play? Type yes or no.");
      String[] answer = processInput();

      if (answer[0].equals("yes")) {
        return true;
      } else if (answer[0].equals("no")) {
        return false;
      } else {
        System.out.println("Please enter either yes or no.");
      }
    }
  }


  //  Player begin the game and the current location is Seattle.
  public void playGame() {
    System.out.println(
        "\nYou are currently in Seattle. --- Type help at any time.\n");
    // player gets the opportunity to visit the bank before embarking on first destination
    goToBank(player);

//  Gives player different destination they can go.
    while (true) {
      System.out.println("Where would you like to go? Here are the list of destination: ");
      for (Destination d : destinations) {
        System.out.println(d.getCountry());
      }
      String[] input = processInput();

// Cheking if the user inputs verb and noun to navigate to different location
      if (input.length < 2) {
        System.out.println(
            "Input Invalid. Type verb and noun. For example if you want to go to Nepal, type 'go Nepal' ");
        continue;
      }
//  Setting variables
      String countryName = input[1];
      boolean validCountry = false;
      Destination destination = null;

//      Checking if the country is valid for each destination
      for (Destination d : destinations) {
        if (d.getCountry().equalsIgnoreCase(countryName)) {
          validCountry = true;
          destination = d;
        }
      }

//  If the user inputs invalid country
      if (!validCountry) {
        System.out.println("Country Name Invalid. Please try again");
        continue;
      }
      System.out.println("Great!! We are going to " + countryName);
      player.setCurrentLocation(destination);
      break;
    }

    while (true) {
      System.out.printf("Welcome to %s. ", player.getCurrentLocation().getCountry());
      System.out.printf("The jewel is in %s. ", player.getCurrentLocation().getPlace());
      System.out.println(
          "What do you want to do next? In the airport store, you have the following options.");

      for (String option : player.getCurrentLocation().getOptions()) {
        System.out.println(option);
      }
      System.out.println("Type 'buy' followed by the item you want to buy. ");
      String[] input = processInput();
      if (input.length < 2) {
        System.out.println("Input Invalid! Type 'buy' followed by the item you want to buy.");
        continue;
      }
      String option = input[1];
      boolean validOption = false;

      for (String o : player.getCurrentLocation().getOptions()) {
        if (option.equalsIgnoreCase(o)) {
          validOption = true;
          break;
        }
      }

      if (!validOption) {
        System.out.println(
            "Input Invalid. Selected option is not available in this store. Type 'buy' followed by the item you want to buy.");
        continue;
      }
      System.out.printf("Great, you are in %s and you have %s in your possession",
          player.getCurrentLocation().getPlace(), option);
      break;
    }

  }

  //processInput method to check the users input.
  private String[] processInput() {
    String[] input = TextParser.readUserInput();
    checkInput(input);
    return input;
  }


  public String[] nextInput () {
    // TODO: Edit to take in player's current location
    System.out.printf("What would you like to do?");
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
      System.out.println("Location: " + player.getCurrentLocation().getCountry());
      System.out.println("Wallet $" + player.getWallet());
      System.out.println("Inventory: " + player.getInventory());
    }
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }


  private void populateDestination() {
    destinations = new ArrayList<>();

//    Array for different options in different locations
    ArrayList<String> nepalOptions = new ArrayList<>() {
      {
        add("Airplane");
        add("Snowmobile");
      }
    };
    ArrayList<String> hawaiiOptions = new ArrayList<>() {
      {
        add("HikingKits");
        add("FakeArmyUniform");
      }
    };
    ArrayList<String> antracticaOptions = new ArrayList<>() {
      {
        add("OfferMoney");
        add("scream");
      }
    };
    ArrayList<String> romeOptions = new ArrayList<>() {
      {
        add("Catnip");
        add("CatToy");
      }
    };
    ArrayList<String> australiaOptions = new ArrayList<>() {
      {
        add("KangarooTreats");
        add("ScubaGear");
      }
    };
    ArrayList<String> africaOptions = new ArrayList<>() {
      {
        add("SafePads");
        add("StrawHat");
      }
    };
    ArrayList<String> ecuadorOptions = new ArrayList<>() {
      {
        add("RepelGear");
        add("BookAboutCoy");
      }
    };

// Respective destination, locations and its options
    Destination nepal = new Destination("Asia", "Nepal", "Mt. Everest", nepalOptions);
    Destination america = new Destination("North America", "USA", "Hawaii", hawaiiOptions);
    Destination antarctica = new Destination("Antarctica", "Antarctica", "other than Antarctica",
        antracticaOptions);
    Destination europe = new Destination("Europe", "Italy", "Rome", romeOptions);
    Destination australia = new Destination("Australia", "Australia", "Sydney", australiaOptions);
    Destination africa = new Destination("Africa", "Zambia", "Victoria Falls", africaOptions);
    Destination ecuador = new Destination("South America", "Ecuador", "Cotopaxi", ecuadorOptions);

//    Calling different destinations
    destinations.add(nepal);
    destinations.add(america);
    destinations.add(antarctica);
    destinations.add(europe);
    destinations.add(australia);
    destinations.add(africa);
    destinations.add(ecuador);

  }

  // SEATTLE HARD CODING

  // bank method
  public void goToBank(Player player) {
    // prompt the user if they would like to visit the bank
    System.out.printf("Before you embark on your journey %S, would you like to visit the bank to increase"
        + " your funds? You currently have $0 in your wallet.\n", player.getName());
    // while loop
    while (true) {
      // give the user two options: rob the bank or check bank account
      System.out.println("Would you like to: \n"
          + "(a) rob the bank [type: rob bank]\n"
          + "(b) check your bank account [type: check account]\n"
          + "(c) bypass bank and go to initial adventure [type: no bank]\n");
      String[] response = nextInput();
      // if user input is rob bank, rob the bank
      if (response[0].equalsIgnoreCase("rob")) {
        System.out.println("You have decided to rob the bank!\n"
            + "You hand the teller a note demanding money with no funny business.\n"
            + "Your wallet increases by $10000.\n");
        // adjust wallet to include $10000
        player.setWallet(10000);
        break;
        // else if user input is check bank account
      } else if (response[0].equalsIgnoreCase("check")) {
        System.out.println("You ask the teller to check your bank account. You have $5000.\n"
            + "You choose to withdraw all of your money. You hope you have enough to pay for your adventures!\n");
        // give the user $600
        player.setWallet(600);
        break;
      } else if (response[0].equalsIgnoreCase("no")) {
        System.out.println("You decide not to go to the bank.\n");
        break;
      } else {
        // else invalid input, try again
        System.out.println("Invalid input. Please try again.\n");
      }
    }
  }
}