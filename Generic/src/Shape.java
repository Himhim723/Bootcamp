import java.math.BigDecimal;
import java.util.List;

public abstract class Shape {
  abstract double area();

  public static double area(List<? extends Shape> shapes){
    // double total=0;
    // for(int i=0;i<shapes.size();i++){
    //   total+=shapes.get(i).area();
    // }
    // return total;

    BigDecimal total = BigDecimal.ZERO;
    for(Shape shape : shapes){
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }
}
