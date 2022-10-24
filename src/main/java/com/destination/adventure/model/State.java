package com.destination.adventure.model;

public enum State {
  GAME_ACTIVE,
  GAME_OVER {
    @Override
    public boolean gameOver() {
      return true;
    }
  };

  public boolean gameOver() {
    return false;
  }

}
