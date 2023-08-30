package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Recursion {

  public static int sum1(int k){
    int sum=0;
    for(int i=k;i>=0;i--){
      sum+=i;
    }
    return sum;
  }

  public static int sum(int k){
    if(k<1) return k;
    return k+sum(k-1);
  }

  public static int sum2(int k){
    if(k <= 1) return k;
    return sum2(k-1)+sum2(k-2);
  }

  //return 1. End the method
  //return 2. Return data
  //54432112345
  public static void print(int k){
    if(k<=0) return;
    System.out.println(k);
    print(k-1);
    //
    System.out.println(k);    
  }

  //Recursion Exercise
  //count how many 7 in the int data "7717171717"
  public int count7(int n) {
    if(n == 0) return 0;
    int count=0;
    if(n%10==7) count=1;
    return count+=count7(n/=10);
  }

  //Recursion Exercise 2
  //count how many X in the String data "lxlssxxlxx"
  public int countX(String str) {
    if(str.length()-1<0) return 0;
    int count=0;
    if(str.charAt(str.length()-1)=='x') 
    count=1;
    return count+countX(str.substring(0, str.length()-1));
  }

  public static int countHi(String str) {
    if(str.length()-2<0) return 0;
    int count=0;
    System.out.println(str.substring(str.length()-2,str.length()));
    if(str.substring(str.length()-2,str.length()).contains("hi")) count=1;
    System.out.println(count);
    return count+ countHi(str.substring(0,str.length()-1));
  }  

  public static void AllInBitCoin(){
    System.out.println("S");
  }

  public static void main(String[] args) {
    // System.out.println(Recursion.sum2(6));
    // System.out.println(Recursion.sum2(5));
    // print(5);
    // System.out.println();
    // // System.out.println(count7(793477));
    // // System.out.println(countX("xllxlxxxx"));
    // System.out.println(countHi("hih"));
    // String a ="hihx";
    // a.replace('h', 'x');
    // System.out.println(a.replace('h', 'x'));
    // StringBuilder sb = new StringBuilder();
    
    ArrayList<Integer> num = new ArrayList<>();
    num.add(1);
    num.add(34);
    num.add(13);
    num.add(73);
    num.add(114);
    Collections.sort(num);
    System.out.println(num);

    ArrayList<String> string = new ArrayList<>();
    string.add("ZLLDF");
    string.add("aSEF");
    string.add("GSDF");
    string.add("Cuyrt");
    string.add("WRB");
    Collections.sort(string);
    System.out.println(string);

    ArrayList<Character> charr = new ArrayList<>();
    charr.add('b');
    charr.add('Z');
    charr.add('A');
    charr.add('z');
    charr.add('a');
    Collections.sort(charr);
    System.out.println(charr);

  }
}
