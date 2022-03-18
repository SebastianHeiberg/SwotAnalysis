package com.company;

import java.util.ArrayList;

public class Main {

  public ArrayList<SWOT> strengths = new ArrayList<>();
  public ArrayList<SWOT> weaknesses = new ArrayList<>();
  public ArrayList<SWOT> opportunities = new ArrayList<>();
  public ArrayList<SWOT> threats = new ArrayList<>();
  Userinterface userinterface = new Userinterface();

  private void addItems() {
    //Strengths
    strengths.add(new Strength("Have decent understanding of the basics", 4));
    strengths.add(new Strength("Want to learn new codeing skills", 5));


    //weaknesses
    weaknesses.add(new Weaknesses("Team works best at different times of day", 5));
    weaknesses.add(new Weaknesses("A third teammember that is maybe not apart of the team", 3));
    weaknesses.add(new Weaknesses("Not good at sharing a screen", 3));
    weaknesses.add(new Weaknesses("Sickness can reduce workcapacity of the group by a lot",5));

    //opportunities
    opportunities.add(new Opportunities("Codelab is open", 4));
    opportunities.add(new Opportunities("Stackoverflow always has answers",5));

    //threats
    threats.add(new Threats("Corona",2));
    threats.add(new Threats("Public transport can hinder half the group to attend",4));
  }

  public void printAll (){
    addItems();
    userinterface.printListSWOT(strengths,"green","Strengths");
    userinterface.printListSWOT(weaknesses,"red","Weaknesses");
    userinterface.printListSWOT(opportunities,"yellow","Oppotunities");
    userinterface.printListSWOT(threats,"blue","Threats");
  }



  public static void main(String[] args) {
    new Main().printAll();


  }
}
