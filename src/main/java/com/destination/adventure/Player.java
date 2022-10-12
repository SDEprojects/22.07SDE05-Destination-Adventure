package com.destination.adventure;

import java.util.ArrayList;
import java.util.List;

public class Player {

  private String name;
  private List<String> inventory = new ArrayList<>();
  private int wallet = 0;


  public Player(String name) {
    setName(name);
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
}
