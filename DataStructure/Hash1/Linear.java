package DataStructure.Hash1;

import java.math.BigDecimal;
import java.util.Arrays;

public class Linear {
  private Coordinates[] points;

  public Linear (Coordinates[] points){
    this.points = Arrays.copyOf(points, points.length);
  }

  public Coordinates[] getPoints(){
    return this.points;
  }

  public Coordinates getPoints(int i){
    return this.points[i];
  }
  public double getSlope(){
   double m = (this.points[0].getY()-this.points[1].getY());
   double k = (this.points[0].getX()-this.points[1].getX());
   return m/k;
  }
  public double getYintercept(){
    return this.points[0].getY()-getSlope()*this.points[0].getX();
  }

  public String getEquation(){
    return ("y = "+getSlope()+"x + "+getYintercept());
  }


  
}
