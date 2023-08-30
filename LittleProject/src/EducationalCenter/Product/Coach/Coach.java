package EducationalCenter.Product.Coach;

import java.util.ArrayList;
import java.util.List;

public class Coach {
  private static int count;
  private int id;
  private String name;
  private Gender gender;
  private List<String> portfolio = new ArrayList<>();

  public Coach(){}
  public Coach(String name){
    this.id = ++count;
    this.name = name;
  }
  public Coach(String name,Gender gender){
    this.id = ++count;
    this.name = name;
  }
  public Coach(String name, Gender gender, String... portfolio){
    this.id = ++count;
    this.name = name;
    this.gender = gender;
    for(String detail : portfolio)
    this.portfolio.add(detail);
  }

  public String getName(){
    return this.name;
  }

  public Gender getGender(){
    return this.gender;
  }

  public String getInfo(){
    StringBuilder sb = new StringBuilder();
    for(String detail: portfolio){
      sb.append(detail+"\n");
    }
    return sb.toString();
  }

  public String showInfo(){
    return "Coach: "+this.name+"\nGender: "+this.gender+"\nPast Experience: \n"+getInfo();
           
  }

  
  
}
