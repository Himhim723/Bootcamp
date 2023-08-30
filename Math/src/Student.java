import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Subject.Subjects;


public class Student{
  private String FirstName;
  private String LastName;
  private int age;
  private char gender;
  private Map<Subjects,Integer> TestResults;
  private ArrayList<Subjects> electives;
  
  public Student(String FName,String LName,int Age, char Gender){
    this.FirstName = FName;
    this.LastName = LName;
    this.age = Age;
    this.gender =Gender;
    this.TestResults = new HashMap<>();
    this.electives = new ArrayList<>();
  }

  public boolean isAdult(){
    // if(this.age>=18) return true;
    // return false;
    //return this.age >= 18? true : false;
    return this.age >= 18;
  }

  public String FullName(){
    return this.FirstName.concat(" ").concat(this.LastName);
  }

  public String getFirstName(){
    return this.FirstName;
  }

  public String getLastName(){
    return this.LastName;
  }

  public int getAge(){
    return this.age;
  }
  
  public char getGender(){
    return this.gender;
  }

  public void setName(String FName, String LName){
    this.FirstName = FName;
    this.LastName =LName;
  }

  public void importScore(Subjects subjects, int score){
    this.TestResults.put(subjects, score);
  }

  public String getResult(Subjects subject){
    return String.valueOf(subject.getName()+" : \t"+this.TestResults.get(subject));
  }

  public static void main(String[] args) {
    Student Him = new Student("Cheuk Him","LEE",17,'M');
    Him.importScore(Subjects.CHI, 28);
    Him.importScore(Subjects.ENG, 65);
    Him.importScore(Subjects.MATH, 78);
    Him.importScore(Subjects.LS, 81);
    System.out.println(Him.getResult(Subjects.ENG));
  }

}
