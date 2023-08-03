package ObjectCLass;

public class Machine {
  //First Define what machine is
  private double weight;
  private double length;
  
  //child class must call super class constructor
  public Machine(){

  }

  // public Machine (double weight){
  //   this.weight = weight;
  //   if(weight>3) length=100.0d;
  // }

  public double getLength(){
    return this.length;
  }

  public double getWeight(){
    return this.weight;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }

  public void start(){
    System.out.println("Machine Start");
  }
  public void stop(){
    System.out.println("Machine Stop");
  }

  public static final String staticMethod(String x, String y){
    String word = x+y;
    return word;
  }

  public static Machine produce(int code){
    switch(code){
      case 1: return new Machine();
      case 2: return new Laptop();
    }
    return new Machine();
  }
  
  public static void stop (int code){
    Machine machine = Machine.produce(code);
    machine.stop();
  }

  public static void main(String[] args) {
    Machine machine1 = Machine.produce(1); //Machine
    Machine machine2 = Machine.produce(2); //Laptop
    Machine machine3 = Machine.produce(2);
    Machine.stop(2);
    Machine.stop(1);
    Machine machine4 = new Laptop();
    machine4.volumeDown();


  }
}
