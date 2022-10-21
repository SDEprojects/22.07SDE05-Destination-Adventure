package com.destination.adventure.controller;

import com.destination.adventure.model.Game;
import com.destination.adventure.model.Player;
import com.destination.adventure.model.State;
import java.io.IOException;
import org.json.simple.parser.ParseException;

public class Main {

  public static void main(String[] args) throws IOException, ParseException {

    // Game set-up, Greeting & Objective
    Game game = new Game(State.GAME_ACTIVE);
    InputHandler handler = new InputHandler();

    game.startGame();

    Player player = game.playerSetUp();
    game.objective();



    if (!handler.playOrNot()) {
      game.setState(State.GAME_OVER);
    }

    while (!game.getState().gameOver()) {
      if (!game.playGame()) {
        game.setState(State.GAME_OVER);
      } else {
        game.setState(State.GAME_OVER);
      }

    }

  }
}
