package Interface;

public class Student extends Person implements Runnable, Swimable,Move{ //class signature
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
  @Override //implements Swimable
  public void swim(){
    System.out.println("Student is swimming.");
  }

  public static void main(String[] args) {
    Move move = new Student("hello");


    Student Him = new Student("ablo");
    
    
    

    System.out.println();

  }
  

  
}
