package com.destination.adventure;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    // Game set-up, Greeting & Objective
    Game game = new Game();
    game.startGame();
    String name = game.playerSetUp();
    Player player1 = new Player(name);
    game.objective();


  }


}
