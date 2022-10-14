package com.destination.adventure.model;

import java.util.ArrayList;

//Declaring string variables for locations and options

public class Destination {

  String continent;
  String country;
  String place;
  ArrayList<String> options;

//  Declaring Destination method

  public Destination(String continent, String country, String place,
      ArrayList<String> options) {

    this.continent = continent;
    this.country = country;
    this.place = place;
    this.options = options;
  }

  public String getContinent() {
    return continent;
  }

  public void setContinent(String continent) {
    this.continent = continent;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public ArrayList<String> getOptions() {
    return options;
  }

  public void setOptions(ArrayList<String> options) {
    this.options = options;
  }
}
