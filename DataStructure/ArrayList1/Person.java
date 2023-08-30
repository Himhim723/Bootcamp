package DataStructure.ArrayList1;

import java.util.Arrays;
import java.util.Random;

public class Person {
  private Pocket[] pocket; //L and R

  public Person(){
    this.pocket = new Pocket[2];
    this.pocket[0] = new Pocket();
    this.pocket[1] = new Pocket();
  }
  public Pocket getLPocket(){
    return this.pocket[0];
  }
  public Pocket getRPocket(){
    return this.pocket[1];
  }
  
  public int getTotalScore(){
    int score=0;
    for(int i=0;i<pocket.length;i++){
        score+=pocket[i].getScore();
    }
    return score;
  }
  

  public static void main(String[] args) {
    Person person = new Person();
    // person.fillThePocket(person.getLPocket());
    // person.fillThePocket(person.getRPocket());
    Person person2 = new Person();
    // person2.fillThePocket(person2.getLPocket());
    // person2.fillThePocket(person2.getRPocket());
    person.getLPocket().fillThePocket();
    person.getRPocket().fillThePocket();
    person2.getLPocket().fillThePocket();
    person2.getRPocket().fillThePocket();

    person.getLPocket().remove(2);
    System.out.println("Person 1 LeftPocket:\n"+person.getLPocket());
    System.out.println("Person 1 RightPocket:\n"+person.getRPocket());
    System.out.println("Person 2 LeftPocket:\n"+person2.getLPocket());
    System.out.println("Person 2 RightPocket:\n"+person2.getRPocket());
    

    // System.out.println(person.getTotalScore());
    // System.out.println(person2.getTotalScore());


    // String[] words = new String[]{"GD","SDAF"};
    // String[] newarr = words;                     //Arrays.copyOf(words,words.length);
    // newarr[0] = "ABC";
    // System.out.println(Arrays.toString(newarr));
    // System.out.println(Arrays.toString(words));

    //Runner A 12.33
    //Runner B 11.55
    //Runner C 14.17

    //Runner B 11.55
    //Runner A 12.33
    //Runner C 14.17

    
    
    

    



  }
  //player 
  //player 2 pocket [LPocket , RPocket]
  //Rules 1 : each pocket can only contains balls not more than 5.
  //Rules 2 : Red Ball 100  Blue Ball 200  Yellow Ball 500 (Enum)
  //When game start, each player fillin all balls randomly
  //Calculate the total score of the balls in their pockets[L && R]
  
  
  
}
