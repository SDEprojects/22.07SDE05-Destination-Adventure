package com.destination.adventure.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

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

  public Destination() {
  }

  public void getDescription(String destination)
      throws IOException, ParseException {
    JSONParser parser = new JSONParser();
    JSONObject jsonObj = (JSONObject) parser.parse(new InputStreamReader(Destination.class.getClassLoader().getResourceAsStream("destinations.json")));

    Map descList = (Map) jsonObj.get(destination);
    Iterator<Entry> itr = descList.entrySet().iterator();

    while (itr.hasNext()) {
      Entry pair = itr.next();
      String key = pair.getKey().toString();
      String value = pair.getValue().toString();
      if (key.equals("description")) {
        System.out.println(value);
      }
    }
  }

  public static void getStoreItems(String destination) throws IOException, ParseException {
    JSONParser parser = new JSONParser();
    JSONObject jsonObj = (JSONObject) parser.parse(new InputStreamReader(Destination.class.getClassLoader().getResourceAsStream("destinations.json")));

    Map descList = (Map) jsonObj.get(destination);
    Iterator<Entry> itr = descList.entrySet().iterator();

    while (itr.hasNext()) {
      Entry pair = itr.next();
      String key = pair.getKey().toString();
      String value = pair.getValue().toString();
      if (key.equals("store")) {
        System.out.println("Airport Store: " + value);
      }
    }
  }

  public static void main(String[] args) throws IOException, ParseException {
    getStoreItems("ecuador");
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
