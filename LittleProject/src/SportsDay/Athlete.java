package SportsDay;

import java.util.HashMap;

public class Athlete {
  private int AthID;
  private static int counter=1;
  private String name;
  private int age;
  private char gender;
  private int yearOfBirth;
  private char grade;
  private HashMap<Event,Double> hmap;
  public static void main(String[] args) {
    Athlete Him = new Athlete("Him", 23, 'M', 1998);
    Him.
  }

  public enum Event{
  R100,
  R200,
  R400,
  R800,
  R1500,
  R5000,
  R10k;
  }

  public Athlete(String name, int age, char gender, int yearOfBirth) {
    this.AthID =counter++;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.yearOfBirth = yearOfBirth;
    this.hmap = new HashMap<>();

    if (this.yearOfBirth >= 1998)
      this.grade = 'A';
    else if (this.yearOfBirth < 1998 && this.yearOfBirth > 1994)
      this.grade = 'B';
    else
      this.grade = 'C';
  }

  @Override
  public String toString() { // At Override
    return this.name;
  }

  public static String toString(Athlete[] athletes){
    return "YEAh";
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int getGender() {
    return this.gender;
  }

  public int getyearOfBirth() {
    return this.yearOfBirth;
  }

  public char getGrade() {
    return this.grade;
  }


  public int getAthID(){
    return this.AthID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public void setyearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public void setGrade(char grade) {
    this.grade = grade;
  }

  public void setResult (Event event, double time){
    this.hmap.put(event, time);
  }
  public double getResult (Event event){
    return this.hmap.get(event);
  }
}
