package com.destination.adventure.model;

public enum State {
  GAME_ACTIVE,

  GAME_OVER{
    @Override
    public boolean gameOver() {
      return true;
    }
  };

  // TODO: Add state for destination (currently at a destination), flying (pending next destination),
  //  treasure available (when the user has all four jewels, they should be prompted after travel (destination)
  //  that they can teleport to the secret location).

  public boolean gameOver(){
    return false;
  }

}
