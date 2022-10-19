package com.destination.adventure.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;

public class Locations {

  // Fields (Match JSON doc = destinations2.json)
  String name;
  String description;
  String[] store;
  Boolean jewel;
  String[] options;


  // Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String[] getStore() {
    return store;
  }

  public void setStore(String[] store) {
    this.store = store;
  }

  public Boolean getJewel() {
    return jewel;
  }

  public void setJewel(Boolean jewel) {
    this.jewel = jewel;
  }

  public String[] getOptions() {
    return options;
  }

  public void setOptions(String[] options) {
    this.options = options;
  }
}
