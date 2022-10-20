package com.destination.adventure.controller;

import java.util.Locale;
import java.util.Scanner;

public class TextParser {

  public String[] readUserInput() {
    String[] command;
    Scanner input = new Scanner(System.in);
    System.out.print(" >> ");
    String userCommand = input.nextLine().toLowerCase();
    // TODO:  implement capitalization of first letter only
    // takes whitespace and special characters out of user command if exists,turns string into string array to return
    command = userCommand.replaceAll("[^\\w\\s]", "").split("\\s+");
    return command;
  }
}