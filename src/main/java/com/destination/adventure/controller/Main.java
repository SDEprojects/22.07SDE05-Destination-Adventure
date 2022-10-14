package com.destination.adventure.controller;

import com.destination.adventure.model.Game;
import com.destination.adventure.model.Player;
import com.destination.adventure.model.State;

public class Main {

  public static void main(String[] args) {

    // Game set-up, Greeting & Objective
    Game game = new Game(State.GAME_ACTIVE);

    game.startGame();

    if (!game.playOrNot()) {
      game.setState(State.GAME_OVER);
    }

    while (!game.getState().gameOver()) {
      String[] answer = game.nextInput();
      game.checkInput(answer);
    }

  }
}
