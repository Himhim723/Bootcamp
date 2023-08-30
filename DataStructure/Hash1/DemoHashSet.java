package DataStructure.Hash1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    //HashSet 會自動幫你 Check 以前有冇出現過這個 data
    HashSet<String> strings = new HashSet<>();
    strings.add("abc");
    strings.add("abc");
    boolean result = strings.add("abc");
    // 2 function 
    // 1. Check whether data existed before
    //    if existed before return false (Cannot import into Hash Set)
    // 2. Add data into the Hash Set if not existed before
    strings.add("BDD");
    System.out.println(strings.size());
    System.out.println(strings);
    System.out.println(result);

    if(strings.add("Hello")){
      System.out.println("Hello does not exist before. Insert Successfully.");
    } else {
      System.out.println("Hello has existed before. The data will not be added again");
    }


    //Example 2
    //HashSet is actually depends on equals and hashcode
    HashSet<Coordinates> coordinate = new HashSet<>();
    Coordinates A = new Coordinates(3,-1);
    Coordinates B = new Coordinates(2,-1);
    coordinate.add(A);
    coordinate.add(B);
    System.out.println(coordinate.size());

    Coordinates C = new Coordinates(2, 1);
    coordinate.add(C);
    System.out.println(coordinate.size());

    Linear l1 = new Linear(new Coordinates[]{A,B});
    System.out.println(l1.getEquation());
    Linear l2 = new Linear(new Coordinates[]{B,C});





    



  }
}
