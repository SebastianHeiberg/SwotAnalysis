package com.company;

import java.util.ArrayList;

public class Main {

  public ArrayList<Strength> strengths = new ArrayList<>();
  public ArrayList<Weaknesses> weaknesses = new ArrayList<>();
  public ArrayList<Opportunities> opportunities = new ArrayList<>();
  public ArrayList<Threats> threats = new ArrayList<>();
  Userinterface userinterface = new Userinterface();

  public void addItems() {
    //Strengths
    Strength strength1 = new Strength("Have decent understanding of the basics", 4);
    Strength strength2 = new Strength("Want to learn new codeing skills", 5);
    strengths.add(strength1);
    strengths.add(strength2);

    //weaknesses
    Weaknesses weaknesses1 = new Weaknesses("Team works best at different times of day", 5);
    Weaknesses weaknesses2 = new Weaknesses("A third teammember that is maybe not apart of the team", 3);
    Weaknesses weaknesses3 = new Weaknesses("Not good at sharing a screen", 3);
    Weaknesses weaknesses4 = new Weaknesses("Sickness can reduce workcapacity of the group by a lot",5);
    weaknesses.add(weaknesses1);
    weaknesses.add(weaknesses2);
    weaknesses.add(weaknesses3);
    weaknesses.add(weaknesses4);

    //opportunities
    Opportunities opportunities1 = new Opportunities("Codelab is open", 4);
    Opportunities opportunities2 = new Opportunities("Stackoverflow always has answers",5);
    opportunities.add(opportunities1);
    opportunities.add(opportunities2);

    //threats
    Threats threats1 = new Threats("Corona",2);
    Threats threats2 = new Threats("Public transport can hinder half the group to attend",4);
    threats.add(threats1);
    threats.add(threats2);
  }

  public void printAll (){
    addItems();
    userinterface.printListStrength(strengths,"red","Strengths");
    userinterface.printListWeaknesses(weaknesses,"yellow","Weaknesses");
    userinterface.printListOppotunities(opportunities,"green","Oppotunities");
    userinterface.printListThreats(threats,"blue","Threats");
  }



  public static void main(String[] args) {
    // write your code here
    new Main().printAll();


  }
}
