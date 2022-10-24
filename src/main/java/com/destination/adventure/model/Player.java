package com.destination.adventure.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {

  // FIELDS
  private String name;
  private List<String> inventory = new ArrayList<>();
  private int wallet = 0;
  private String currentLocation = "seattle";

  // CONSTRUCTORS
  public Player() {
  }

  // METHODS
  public Boolean checkJewels() {
    int jewelCount = 0;

    for (String item : inventory) {
      if (Objects.equals(item, "jewel")) {
        jewelCount++;
      }
    }

    if (jewelCount < 4) {
      System.out.printf("\n You have %d jewels in your inventory.\n", jewelCount);
      return false;
    } else {
      System.out.println(" You have 4 jewels! You are now being teleported to the treasure!");
      return true;
    }
  }

  // GETTERS AND SETTERS
  public String getCurrentLocation() {
    return currentLocation;
  }
  public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public List<String> getInventory() {
    return inventory;
  }
  public void setInventory(List<String> inventory) {
    this.inventory = inventory;
  }
  public int getWallet() {
    return wallet;
  }
  public void setWallet(int wallet) {
    this.wallet = wallet;
  }


  @Override
  public String toString() {

    return "Player Name: ${name}\n"
        + "Player Inventory: ${inventory}\n"
        + "Player Wallet: $${wallet}";
  }
}
