package com.destination.adventure.controller;

import com.destination.adventure.model.Game;
import com.destination.adventure.model.Player;
import com.destination.adventure.model.State;
import java.io.IOException;
import org.json.simple.parser.ParseException;

public class Main {

  public static void main(String[] args) throws IOException, ParseException {

    // Game instance created
    Game game = new Game(State.GAME_ACTIVE);
    // Input handler instance created
    InputHandler handler = new InputHandler();

    // Show game introduction to the user
    game.intro();

    // Ask the User if they would like to play the game
    if (!handler.playOrNot()) {
      game.setState(State.GAME_OVER);
    }

    // Show game title & play music
    game.startGame();
    // set-up player in the game
    game.playerSetUp();
    // Show game objective to the user (refresher)
    game.objective();

    // play the game
    while (!game.getState().gameOver()) {
      if (!game.playGame()) {
        game.setState(State.GAME_OVER);
      } else {
        game.setState(State.GAME_OVER);
      }

    }

  }
}
