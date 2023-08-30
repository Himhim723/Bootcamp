package ObjectCLass.ENUM;

import java.util.Scanner;

public enum DirectionEnumM {  //enum 可以用 interface
    //1. public class extends enum(enum class extend enum extends Object)
    // cannot extend another class
    //2. enum is final class (cannot be new)
    

    //enum since java 1.5  (no main inside)
    //Finite number of numbers
    //全局為一   
    //Example 1: Direction [Up,Down,Left,Right]
    //Up,Down,Left,Right,
    //Example 2: Day [Monday,Tuesday,Wednesday]
    //public enum Day
    //Monday('M'),Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday,
    //Example 3: Double Entry [Credit, Debit]
    //Credit('C'),Debit('D'),
    //Example 4: Season [Summer,Autumn,Winter,Spring]
    //Summer('s'),Autumn('a'),Winter('w'),Spring('k'),
    //public enum Direction
    EAST("EAST.dfd",123),
    WEST("WEST",234),
    NORTH("NORTH",452),
    SOUTH("SOUTH",145);


    //enum can use interface
    //enum can setup static and non-static method
    //can setup 
    private String direction;
    private int degree;

    private DirectionEnumM(String direction,int degree){
      this.direction = direction;
      this.degree = degree;
    }

    public String getDirection(){
      return this.direction;
    }

    public int getDegree(){
      return this.degree;
    }

    //enum cannot be new in main 
    //enum cannot be implemented or extended
    //enum should never use setMethod


    public static String print(){
      System.out.println("Hello");
      return "Df";
    }

    public boolean isOpposite(DirectionEnumM direction){
      return Math.abs(this.degree-direction.degree)==180;
    }
    

    public static void main(String[] args) {
      // System.out.println(DirectionEnumM.EAST);

      // DirectionEnumM east = DirectionEnumM.EAST;
      // System.out.println(east == DirectionEnumM.EAST);  //true enum use ==
      // System.out.println(east == DirectionEnumM.SOUTH);  //false enum use ==
      // // == is checking the object reference

      // //values() --> for us to do looping
      // for(DirectionEnumM direction: DirectionEnumM.values()){
      // //DirectionEnumM.values() is a static Method in Object
      // //DirectionEnumM.SOUTH.
      //   System.out.println(direction);
      // }

      // System.out.println(DirectionEnumM.EAST.ordinal());  
      // //.ordinal() check佢係 enum 既第幾個 Object
      // // enum 當 set 好  已在 Heap setup 好一個 Object
      // // 所以 好似 Literal Pool 一樣 

      // System.out.println(DirectionEnumM.print());
      // System.out.println(DirectionEnumM.EAST == DirectionEnumM.NORTH);









    }

  
}
