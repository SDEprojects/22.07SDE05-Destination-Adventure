package com.destination.adventure;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Game set-up, Greeting & Objective
    Game game = new Game(State.GAME_ACTIVE);

    if (game.getState() == State.GAME_ACTIVE) {
      game.startGame();
      Player player = game.playerSetUp();
      game.objective();
      if (!game.playOrNot()) {
        game.setState(State.GAME_OVER);
      }
    }

    while (!game.getState().gameOver()) {
      System.out.println("I like turts");
      break;
    }

  }


}
