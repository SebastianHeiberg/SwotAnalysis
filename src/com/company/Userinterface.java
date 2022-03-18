package com.company;

import java.util.ArrayList;

public class Userinterface {
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLUE = "\u001B[34m";

  public Userinterface() {
  }

  public void printListSWOT(ArrayList<SWOT> listen, String color, String listName) {
    String textcolor = "";

    switch (color) {
    case "red" -> textcolor = ANSI_RED;
    case "yellow" -> textcolor = ANSI_YELLOW;
    case "green" -> textcolor = ANSI_GREEN;
    case "blue" -> textcolor = ANSI_BLUE;
    }

    System.out.println(textcolor + listName + ANSI_RESET);
    for (int i = 0; i < listen.size(); i++) {
      System.out.println(textcolor + (i+1) + " " + listen.get(i).getName()+ " (" + listen.get(i).getLevelOfSignificance()+ ")" + ANSI_RESET);
    }

    System.out.println();
  }

}
