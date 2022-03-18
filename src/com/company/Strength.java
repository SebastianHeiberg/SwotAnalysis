package com.company;

public class Strength {

  private String name;
  private int levelOfSignificance;

  public Strength(String name, int levelOfSignificance) {
    this.name = name;
    this.levelOfSignificance = levelOfSignificance;
  }

  public String getName() {
    return name;
  }

  public int getLevelOfSignificance() {
    return levelOfSignificance;
  }
}
