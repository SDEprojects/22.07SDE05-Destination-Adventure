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
  private List<Locations> locations;
  private List<Items> items;
  HashMap<String, Locations> world;

  public World() throws IOException {
    Gson gson = new Gson();
    locations = load("destinations2.json", gson, new TypeToken<ArrayList<Locations>>(){}.getType());

    world = (HashMap<String, Locations>) locations.stream().collect(Collectors.toMap(Locations::getName, location -> location));
//    System.out.println(world.get("italy").getDescription());
  }

//  public static void main(String[] args) throws IOException {
//    World world = new World();
//
//    System.out.println(world.world.get("italy").getDescription());
//
//  }

  // GSON Loader
  private <T> T load(String resourceFile, Gson gson, Type type) throws IOException {
    try(Reader reader = new InputStreamReader(getClass().getClassLoader().getResourceAsStream(resourceFile))) {
      return gson.fromJson(reader, type);
    }
  }
}
