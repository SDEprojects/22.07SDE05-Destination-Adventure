package com.destination.adventure.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

  private String name;
  private List<String> inventory = new ArrayList<>();
  private int wallet = 0;

  private String currentLocation = "Seattle";


  public Player(String name) {
    setName(name);
  }

  public Player() {
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

  public String getCurrentLocation() {
    return currentLocation;
  }

  public void setCurrentLocation(String currentLocation) {
    this.currentLocation = currentLocation;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}