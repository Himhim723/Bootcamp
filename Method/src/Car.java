import Crash.ObjectDemo;

public class Car {
  int numOfWheel;
  int capacity;
  String color;

  public Car(){ //empty constructor
    /* this.numOfWheel=0;
    this.capacity=0;
    this.color = ""; */
  }

  //all argument Constructor
  public Car(int wheel, int capacity, String color){   
    this.numOfWheel = wheel;
    this.capacity = capacity;
    this.color = color;
  }

  public void setWheel(int wheel){
    this.numOfWheel = wheel;
  }
  public void setCapacity(int capacity){
    this.capacity = capacity;
  }
  public void setColor(String color){
    this.color = color;
  }
  public int getWheel(){
    return this.numOfWheel;
  }
  public int getCapacity(){
    return this.capacity;
  }
  public String getColor(){
    return this.color;
  }

  public static void main(String[] args) {
   
  }
  
}
