package com.destination.adventure.model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class World {

  // Fields
  public List<Locations> locations;
   List<Items> items;
  private List<Guide> guide;
  HashMap<String, Locations> world;
  HashMap<String, Guide> guidePrompts;
  HashMap<String, Items> itemsAirport;

  public World() throws IOException {
    Gson gson = new Gson();
    locations = load("destinations2.json", gson, new TypeToken<ArrayList<Locations>>() {
    }.getType());
    guide = load("dialogue.json", gson, new TypeToken<ArrayList<Guide>>() {
    }.getType());
    items = load("items.json", gson, new TypeToken<ArrayList<Items>>() {
    }.getType());

    world = (HashMap<String, Locations>) locations.stream()
        .collect(Collectors.toMap(Locations::getName, location -> location));
    guidePrompts = (HashMap<String, Guide>) guide.stream()
        .collect(Collectors.toMap(Guide::getCountry, prompt -> prompt));
    itemsAirport = (HashMap<String, Items>) items.stream()
        .collect(Collectors.toMap(Items::getName, item -> item));
  }

//  public static void main(String[] args) throws IOException {
//    World world = new World();
//    System.out.println(world);
//
//    System.out.println(world.world.get("italy").getDescription());
//    System.out.println(world.guidePrompts.get("italy").getInstructions());
//    System.out.println(world.itemsAirport.get("catnip").getDescription());
//}

  // GSON Loader
  private <T> T load(String resourceFile, Gson gson, Type type) throws IOException {
    try(Reader reader = new InputStreamReader(getClass().getClassLoader().getResourceAsStream(resourceFile))) {
      return gson.fromJson(reader, type);
    }
  }
}
