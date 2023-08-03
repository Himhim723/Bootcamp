import java.util.Arrays;
import java.util.Scanner;

public class Person {
  //Class is the template of the world to produce Person ???? Huh
  //How can we describe the person
  private String name="hi";
  private int age=0;          
  private char gender=' ';

  public Person(){

  }

  public Person(String name){
    this.name = name;
  }
  
  //These data are attributes to 形容 a person
  public Person(String name,int age,char gender){
     this.name=name;
     this.age=age;  
     this.gender=gender;
  }

  // public void setname(String name){
  //   this.name=name;
  //}
  public static void SelfIntroduction(String name, int age){
    System.out.println("Hi, I am "+name+". I am "+age+" years old.");
  }

  public void personalInfo(String Name,int age,char gender){
     this.name=Name;
     this.age=age;
     this.gender=gender;
     //當係Main Created a Person 後
     //this 就係 Created Person/Object
     // main 中 call personalInfo Method 
     //將setAge()括號內既 age set入個 Created Person
  }


  public String getName(){
    return this.name;
  }

  public static void main(String[] args) {
    //main is just a program to run something
    // but it is not belongs to Class Person

    
    Person Patrick = new Person(); // Produce Object Patrick, with default value
    Person Connie = new Person(); // Produce Object Connie, with default value
    Person Sunny = new Person();
    Person HimJai = new Person();

    //Save in Heap as Memory

    Patrick.personalInfo("Patrick", 63, 'M');
    Connie.personalInfo("Connie", 18, 'F');
    Sunny.personalInfo("Sunny",48,'M');
    HimJai.personalInfo("HimJai",25,'M');
    Patrick.SelfIntroduction(Patrick.name,Patrick.age);
    Connie.SelfIntroduction(Connie.name, Connie.age);
    Sunny.SelfIntroduction(Sunny.name, Sunny.age);
    HimJai.SelfIntroduction(HimJai.name, HimJai.age);
  
  // import java.util.Scanner;     
  // The items on the top is also a class 
  // Seems like
  // public class Scanner { ...... }
  // Scanner res = new Scanner(System.in);
  // create object res 地址


  // int[] GGG = new int[]
  // create GGG 


  }

  public void setName(String string) {
  }

}
