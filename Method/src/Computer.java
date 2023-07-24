public class Computer {
  // Attribute // PRIVATE!!
  private int ram; 
  private int weight;
  private String colour;

  // Constructors
  public Computer() {

  }

  public Computer(String colour) { // 1. No return type/ void ; 2. Constructor name = class' name
    this.colour = colour;
  }

  public Computer(int ram, int weight, String colour) { // 1. No return type/ void ; 2. Constructor name = class' name
    this.ram = ram;
    this.weight = weight;
    this.colour = colour;
  }

  public String getColour() {
    return this.colour;
  }
  public int getRam() {
    return this.ram;
  }

  // Method
  public void setRam(int ram) {
    this.ram = ram;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }
}