package ObjectCLass;

public abstract class Person {
  // abstract 係唔可以 new
  // final 唔可以 extend
  //未 contain 一個 instance method with implementation
  private int age;
  private double height;

  public Person(){

  }
  public Person(int age, double height){
    this.age = age;
    this.height = height;
  }
  public void run(){
    System.out.println("I am a Person I am running.");
  }
  
  public int getAge(){
    return this.age;
  }

  public double getHeight(){
    return this.height;
  }

  public abstract void sleep();
  //the difference between public class and public abstract class
  // may appear abstract method (without implementation) 
  // 唔講佢呢個 method 做咩
  
}
