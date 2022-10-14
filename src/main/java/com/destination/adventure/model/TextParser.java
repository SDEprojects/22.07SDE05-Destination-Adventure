package com.destination.adventure.model;

import java.util.Locale;
import java.util.Scanner;

public class TextParser {

  public String[] readUserInput() {
    String[] command;
    Scanner input = new Scanner(System.in);
    System.out.print(">> ");
    String userCommand = input.nextLine().toLowerCase();
    // TODO:  implement capitalization of first letter only
    // takes whitespace and special characters out of user command if exists,turns string into string array to return
    command = userCommand.replaceAll("[^\\w\\s]", "").split("\\s+");
    return command;
  }
//  Testing parser function
//  public static void main(String[] args) {
//    TextParser test = new TextParser();
//    String[] other = test.readUserInput();
//    for (String word:other) {
//      System.out.println(word);
//    }
//    System.out.println(other[0]);
//  }
}
