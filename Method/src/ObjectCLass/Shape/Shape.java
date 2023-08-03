package ObjectCLass.Shape;

import java.math.BigDecimal;

public abstract class Shape {
  
  public abstract double area();
  public static double area(Shape[] shapes){
    double total=0;
    BigDecimal b = BigDecimal.valueOf(total);
    for(Shape s:shapes){
      b = b.add(BigDecimal.valueOf(s.area()));
    }
    return b.doubleValue();
  }


  public static void main(String[] args) {
    Circle circle = new Circle(1.5d);
    Square square = new Square(2.6d);
    Shape[] shapes = new Shape[]{circle,square};
    System.out.println(Shape.area(shapes));

  }
}
