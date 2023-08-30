package Interface;

import java.util.function.Consumer;

public class Student extends Person implements Runnable,Move{ //class signature
  //Why implements ??  (Interface <--> Implements)
  //differences between Extends and implements 
  //implement can implements many interface

  private String name;

  public Student(String name){
    this.name=name;
  }


  @Override
  public void jump(){

  }
  
  @Override
  public void breath(){
    System.out.println("Student is breathing");
  }
  @Override //implements Runnable
  public void run(){
    System.out.println("Student is running.");
  }
  // @Override //implements Swimable
  // public void swim(){
  //   System.out.println("Student is swimming.");
  // }

  public static void main(String[] args) {
    


    

  }

  @Override
  public String toString(){
    return this.name;
  }
  

  
}
