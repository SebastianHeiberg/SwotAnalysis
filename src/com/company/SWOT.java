package com.company;

public class SWOT {

  private String name;
  private int levelOfSignificance;

  public SWOT(String name, int levelOfSignificance) {
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


