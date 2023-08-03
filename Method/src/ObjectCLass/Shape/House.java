package ObjectCLass.Shape;

public class House extends Building {
  private double capacity;

  public House(){

  }

  public House(double capacity){
    this.capacity=capacity;
  }

  
  public void setCapacity(double capacity){
    this.capacity=capacity;
  }
  public double getCapacity(){
    return this.capacity;
  }
  public void print(){
    System.out.println("I am House");
  }
  
  public void kk(){
    System.out.println("Yeah i am using house method");
  }
}
