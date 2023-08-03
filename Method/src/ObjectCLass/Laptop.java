package ObjectCLass;

import java.util.Objects;

//week4 day1 (Inheritance) 
// extends
// super
// @Override
public class Laptop extends Machine{
  //extends Machine 
  //Machine 所有的 Attributes/Methods 可被 Laptop 繼承
  //e.g. Machine weight / Machine start() / Machine stop()
  private Keyboard keyboard;
  private Monitor monitor;
  private int sound;
  private int maxSound=10;
  private int minSound=0;
  //double weight; //which has been declared in Machine Class

  public Laptop(){
    //implicitly call superClass empty Constructor
    
  }

  public Laptop (Keyboard keyboard,Monitor monitor){
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop (String buttonType, int noOfButton,double length,double width){
    this.keyboard = new Keyboard(buttonType,noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop (double weight, Keyboard keyboard,Monitor monitor){
    super();
    this.keyboard = keyboard;
    this.monitor = monitor;
  }



  @Override // Overriding (如果佢extends既Class有呢個 Method 就唔 Run 佢個 Method Run 以下呢個 Method)
  //if 佢冇呢個 method 佢會紅線你  // for people to know you have a same method name in the class
  public void start(){
    System.out.println("Laptop Start...");
  }
  @Override
  public void stop(){;
    System.out.println("Laptop Stop...");
  }

  public void mute(){
    this.sound = 0;
  }

  public void volumeUp(){
    if(sound<maxSound) sound++;
  }

  public void volumeDown(){
    if(sound>minSound) sound--;
  }

  // @Override
  // public static String staticMethod(String x,String y){
  //   return "Xx";
  // }
  //  Cannot Override because another class method is final


  public boolean equals(Object o){
    if(this==o) return true;
    if(!(o instanceof Laptop)) return false;
    Laptop l1 = (Laptop) o;
    if(Objects.equals(this.keyboard,l1.keyboard)&&
       Objects.equals(this.monitor,l1.monitor)) return true;
    return false;
  }


  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.setWeight(1.33d);
    System.out.println(laptop.getWeight());
    laptop.start();
    laptop.stop();

    Machine machine = new Machine();
    machine.setWeight(3.33d);
    System.out.println(machine.getWeight());
    machine.start();
    machine.stop();
    

    Monitor mon = new Monitor(1.22d, 2.33d);
    Keyboard key = new Keyboard("KEYBOARD ALL", 122);
    System.out.println(key);
    Laptop l2 = new Laptop(10,key,mon);
    System.out.println(l2.getLength());

    Laptop l3 = new Laptop();
    System.out.println(l3.getWeight());
    //l3.staticMethod("null", "wwww");//慢 但可以 call到  not recommend
    System.out.println(l3.staticMethod("nguyll", "www")); //As staticMethod() is a static method 
    //it will be faster if we directly use it from the original class
    System.out.println(Machine.staticMethod("nyfgul", "www"));


  }
}
