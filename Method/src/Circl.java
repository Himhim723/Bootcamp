public class Circl {
  private int id=0; //non static or instance variable
  private double radius;
  private final static double pi=3.1415;  //final 不可被改變
  //Static not inside the ball
  private static int counter; //how many obeject reference
  //static variable only one no memory
  
  public Circl(){
    counter++;
    this.id=counter;
  }

  public static void AddCounter(){
    counter++;
  }

  public int getId(){
    return this.id;
  }

  public double area(){
    return Math.pow(this.radius,2)*pi;
  }

  public double perimeter(){
    return this.radius*2*pi;
  }

  public void setRadius(double r){
    this.radius=r;
  }

  public double getRadius(){
    return this.radius;
  }

  public static void main(String[] args){
    Circl c = new Circl();
    c.setRadius(2.30);
    c.area();
    c.perimeter();
    Circl c2 = new Circl();
    c2.setRadius(12.30);
    c2.area();
    c2.perimeter();
    String str ="df";
    char[] chars = str.toCharArray();
    System.out.println(c2.getId());

  }
}
