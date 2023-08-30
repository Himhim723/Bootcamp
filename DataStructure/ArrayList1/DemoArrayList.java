package DataStructure.ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;


public class DemoArrayList{
  //fixed length
  //for both primitive and class
  public static void main(String[] args) {
  int[] arr = new int[3];
    //Array has a fixed length
  Integer[] arr2 = new Integer[4];

  ArrayList<Integer> numbers= new ArrayList<>();
  //variable length
  numbers.add(165);
  numbers.add(3);
  numbers.add(5);
  numbers.add(9);
  numbers.add(11);
  numbers.add(100);
  numbers.remove(3);
  System.out.println(numbers);

  //ArrayList toArray()
  //Integer[] arr2 = new Integer[numbers.size()];
  arr2 = numbers.toArray(arr2);
  
  Arrays.sort(arr2);
  System.out.println(Arrays.toString(arr2));
  //Define Output Array type for toArray()perform constructor
  // numbers.toArray(change to what)
  System.out.println(numbers); 

  for(int i=0;i<numbers.size();i++){
    System.out.println(numbers.get(i));
  }

  int original = numbers.set(0,1);
  System.out.println(original);


  System.out.println(numbers.isEmpty());
  System.out.println(numbers.size()==0);

  ArrayList<Integer> numbers2 = new ArrayList<>();
  numbers2.add(24);
  numbers2.add(224);
  numbers2.add(214);

  System.out.println(numbers2.contains(9));


  numbers2.remove(1);
  
  numbers.addAll(numbers2);
  System.out.println(numbers);



  numbers.clear();

  ArrayList<String> strs = new ArrayList<>();
  strs.add("Hello1");
  strs.add("Hello2");
  strs.add("Hello3");
  strs.add("Hello4");
  strs.add("Hello5");
  strs.add("Hello6");
  strs.add("Hello7");
  
  // String[] obj = new String[3];
  // obj = strs.toArray(obj);
  // System.out.println(Arrays.toString(obj));


  //Array --> ArrayList
  String[] str2 = new String[]{"hi","I","Am","Him"};
  //List<String> arstr2 = new ArrayList<>();

  //Read ONLY  --> BIG BUG
  //List<String> arstr2 = Arrays.asList(str2);

  // ArrayList<String> str2a = new ArrayList<>(strs);
  // System.out.println(str2a);
  // str2a.add("nulldd");
  // System.out.println(str2a);

  //Correct formation
  List<String> str2a = new ArrayList<>(Arrays.asList(str2));
  str2a.add("ERRor");
  System.out.println(str2a);






  }
}
