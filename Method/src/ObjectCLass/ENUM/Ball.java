package ObjectCLass.ENUM;

import java.util.Objects;

public class Ball {
  //attribute
  Color color;
  double radius;

  public Ball(Color color,double radius){
    this.color = color;
    this.radius=radius;
  }

  public Color getColor(){
    return this.color;
  }

  public String getColorS(){
    return this.color.toString();
  }

  @Override
  public boolean equals(Object o){
    if(o==this) return true;
    if(! (o instanceof Ball)) return false;
    Ball ball = (Ball) o;
    if(this.color == ball.color && this.radius == ball.radius) return true;
    return false;
  }

  public static void main(String[] args) {
    Ball ball = new Ball(Color.RED,1.5d);
    Ball ball2 = new Ball(Color.RED,1.5d);
    String red = "RED";
    System.out.println(red.equals(Color.RED.getColorCode()));
    System.out.println(Color.RED);
    System.out.println(ball.equals(ball2));
    
  }
}
