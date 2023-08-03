package Experiment;

import java.util.Arrays;
import java.util.Scanner;

public class UStudent extends University {
  private String name;
  private int age;
  private int yearOfBirth;
  private String gender;
  private int ID;
  private Bachelor bachelor;
  private Club club;
  
  public UStudent(){
    super();
    SignIn();
  }

  public void SignIn(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the following information:");
    System.out.print("Name: ");
    String name = input.next();
    System.out.print("Age: ");
    int age = input.nextInt();
    System.out.print("Gender(M/F): ");
    String gender = input.next();
    System.out.print("Year Of Birth: ");
    int year = input.nextInt();
    System.out.println("\nPlease confirm your information is correct.");
    System.out.println("Name: "+name+"\nAge: "+age+"\nGender: "+gender+"\nYear of Birth: "+year);
    System.out.println("\nPlease enter [confirm] if you have confirmed the information is correct.");
    if(input.next().toLowerCase().equals("confirm")){
      this.name = name;
      this.age = age;
      this.gender = gender;
      this.yearOfBirth = year;
    } 
  }

  public String getName(){
    return this.name;
  }
  
  public String study(String name){
    return (name+" am studying");
  }
  
  
  public void setStudentID(){
    this.ID=super.getID();
  }

  public int getStudentID(){
    return this.ID;
  }

  public String toString(){
    return this.name;
  }


  public static void main(String[] args) {
    UStudent Him = new UStudent();
    Him.setStudentID();
    System.out.println(Him.getID());
    UStudent Him2 = new UStudent();
    Him2.setStudentID();
    System.out.println(Him2.getID());

  }
  
}
