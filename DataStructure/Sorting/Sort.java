package DataStructure.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
  public static void main(String[] args) {
    int[] arr= new int[]{1,2,5,23,1513,6,6,1345,5,34,5,15,324,214,4635};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

    char[] cha = new char[]{'a','e','w','G','W','A','4',' '};
    Arrays.sort(cha);
    System.out.println(Arrays.toString(cha));


    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(11);
    arrayList.add(12);
    arrayList.add(41);
    arrayList.add(11);
    arrayList.add(231);
    arrayList.add(15);
    arrayList.add(541);
    arrayList.add(81);
    Collections.sort(arrayList);   //nlogn speed ascending sort
    System.out.println(arrayList);


    




  }
}
