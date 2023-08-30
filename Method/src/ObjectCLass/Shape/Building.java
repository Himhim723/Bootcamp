package ObjectCLass.Shape;

public class Building {
  private double height;

  public void print(){}
  public void print2(){
    System.out.println("I am building");
  }

  public void print2(String name){
    System.out.println(name+" hi !!");
  }

  

  public static void main(String[] args) {
    //Dynamic Polymorphism (Run-Time)
    Building building = new House();
    // building.getCapacity();
    // Building is an Object of Building so it is not allowed to use method in House
    building.print();
    //building.print2();
    House house = new House();
    house.print2();
    house.print2("Him");
    
    
    // Compile Stage: can call print method both class have pritn method
    // Run time Staga: Oh building is actually a House Class I use House method
    // Print out: I am House;

    //Polymorphism(Run Which Method Block/Coding Block)) 多態多型
    
    //Static Polymorphism (Run Which Method Block/Coding Block)
    //Overloading
    //Method Signature (Same Method Name (different parameter))
    //Constructor Signature
    house.print2();
    house.print2("Him");

  }
}
