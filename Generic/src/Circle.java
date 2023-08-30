public class Circle extends Shape {
  int radius;

  @Override
  double area() {
    return Math.pow(radius,2)*Math.PI;
  }
}
