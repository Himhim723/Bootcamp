import java.util.Arrays;
import java.util.Scanner;

public class Person {
  //Class is the template of the world to produce Person ???? Huh
  //How can we describe the person
  String name;
  int age;          
  char gender;
  String[] teamMember;
  //These data are attributes to 形容 a person

  public void SelfIntroduction(String name, int age){
    System.out.println("Hi, I am "+name+". I am "+age+" years old.");
  }

  public void personalInfo(String Name,int MainAge, char Gender){
     this.name=Name;
     this.age=MainAge;  
     this.gender=Gender;
     //當係Main Created a Person 後
     //this 就係 Created Person/Object
     // main 中 call setAge Method 
     //將setAge()括號內既 age set入個 Created Person
  }

  public static void main(String[] args) {
    //main is just a program to run something
    // but it is not belongs to Class Person
    Game hi = new Game();
    hi.開口中();
    Game.開口中();


    Scanner input = new Scanner(System.in);
    Person Team1 = new Person();

    System.out.println("How many members do you have in your team?");
    int numOfMem = input.nextInt();
    Team1.teamMember = new String[numOfMem];

    for(int i = 1;i<=numOfMem;i++){
      System.out.println("Please enter the name of your member.");
      String name = input.next();
      Team1.teamMember[i-1]=name;
    }


    

    
    Person Patrick = new Person(); // Produce Object Patrick, with default value
    Person Connie = new Person(); // Produce Object Connie, with default value
    Person Sunny = new Person();
    Person HimJai = new Person();
    Game Him = new Game();

    //Save in Heap as Memory

    Patrick.personalInfo("Patrick", 63, 'M');
    Connie.personalInfo("Connie", 18, 'F');
    Sunny.personalInfo("Sunny",48,'M');
    HimJai.personalInfo("HimJai",25,'M');
    Patrick.SelfIntroduction(Patrick.name,Patrick.age);
    Connie.SelfIntroduction(Connie.name, Connie.age);
    Sunny.SelfIntroduction(Sunny.name, Sunny.age);
    HimJai.SelfIntroduction(HimJai.name, HimJai.age);

    System.out.println(Arrays.toString(Team1.teamMember));
  
  // import java.util.Scanner;     
  // The items on the top is also a class 
  // Seems like

  // public class Scanner { ...... }
  // Scanner res = new Scanner(System.in);
  // create object res 地址


  // int[] GGG = new int[]
  // create GGG 


  }

}
