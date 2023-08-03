package Crash;

import java.util.Arrays;
import java.util.Objects;

public class ObjectDemo {
    String name;
    int age;


    public void setName(String name){
      this.name=name;
    }

    public void setAge(int age){
      this.age=age;
    }


    //Rule 1: All class extends Object Implicitly
    @Override
    public String toString(){
      return this.name;
    }

    public static String toString(int[] arr){
      String a="";
      for(int i=0;i<arr.length;i++){
        a+=arr[i]+", ";
      }
      return a;
    }




    public static void main(String[] args) {
      //Example1 : ObjectDemo extends Object
      ObjectDemo objectDemo = new ObjectDemo();
      System.out.println(objectDemo);
      int[] arr=new int[]{1,2,3,4};
      System.out.println(   ObjectDemo.toString(arr)   );
      System.out.println(       Arrays.toString(arr)   );


      ObjectDemo objectDemo1 = new ObjectDemo();
      System.out.println(objectDemo1);
      String ab = "a";
      ab+=" ";
      String ac = "a";
      ac+=" ";
      System.out.println(objectDemo.toString());
      System.out.println(ab.hashCode());

      //HashCode is a number/ integer  (31進制 * ASCII CODE)
      //another presentation of object reference 32bit 64bit 
      //But not the same as Memory Address
      //As Range of HashCode is so small, it is not enought to store all memory address
      
      //equals  (null cannot .equals)
      String s1 = "abc";
      String s2 = "abc";
      System.out.println(s1.equals(s2));

      ObjectDemo o1 = new ObjectDemo();
      ObjectDemo o2 = new ObjectDemo();
      ObjectDemo o3 = new ObjectDemo();
      ObjectDemo o4 = new ObjectDemo();
      o1.setName("o1's Name");
      o1.setAge(3);
      o2.setName("o1's Name");
      o2.setAge(3);

      System.out.println(o1.equals(o2)); //although o1 and o2 is with same value, equals address is or not the same  
      

    }
}
