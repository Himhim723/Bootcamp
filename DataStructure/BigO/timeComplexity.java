package DataStructure.BigO;

import java.util.ArrayList;

public class timeComplexity {
  // big O Notation
  // Speed of how fast the program can run
  public static void main(String[] args) {
    //Time Complexity    --> Speed 
    //Space COmplexity   --> Memory
    //2 for loop means n
    ArrayList<Integer> a1 = new ArrayList<>();
    ArrayList<Integer> a2 = new ArrayList<>();
    System.out.println(a1);
    System.out.println(a2);
    a1=a2;
    a1.add(2);
    a2.add(55);
    a1.add(1);
    System.out.println(a1);
    

  }
}
