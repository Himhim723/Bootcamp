package Crash;

public class X extends Y {
  private String name;

  public X(){

  }
  public X (String name){
    super("John");   // name for Y
    this.name = name; //name for X
  }
  public String getName(){
    return this.name;
  }
  public String getParentName(){
    return super.getName();
  }

  public static void staticMethod(){
    System.out.println("I am X>>>");
  }

  public static void main(String[] args) {
    X x = new X("Peter");
    System.out.println(x.getName());
    System.out.println(x.getParentName());
    
    // Hiding
    Y y = new X("Tommy");
    y.staticMethod(); // Y 既 Method
    //頭先 Machine machine = new Laptop();
    //machine.method() 係只可用返 Machine 既 Method
    System.out.println(y.getName());
    int[] arr = new int[] {1,3,5,2,3};
  }
}
