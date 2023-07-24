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
    Number num = new Number();
    Circle circle = new Circle();
    Computer computer = new Computer();
    Person Him = new Person();
    Car HimCar = new Car(); //empty Constructor (with defaulted value)
    Car HimCar1 = new Car(8, 16, "RED");   //all argument Constructor (with settled value)
    
    System.out.println(HimCar1.getWheel());

    System.out.println(HimCar1.getColor());
  }
}
