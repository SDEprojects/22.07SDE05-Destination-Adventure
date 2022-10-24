package com.destination.adventure.controller;

import com.destination.adventure.model.Game;
import com.destination.adventure.model.Player;
import com.destination.adventure.model.State;
import java.io.IOException;
import org.json.simple.parser.ParseException;

public class Main {

  public static void main(String[] args) throws IOException, ParseException {

    Game game = new Game(State.GAME_ACTIVE);
    InputHandler handler = new InputHandler();
    game.intro();

    if (!handler.playOrNot()) {
      System.exit(0);
    }

    game.startGame();
    game.playerSetUp();
    game.objective();

    while (!game.getState().gameOver()) {
      if (!game.playGame()) {
        game.setState(State.GAME_OVER);
      } else {
        game.setState(State.GAME_OVER);
      }
    }
  }
}
