package ObjectCLass.Shape;

import java.util.Arrays;
import java.util.Objects;

public class Ball {
  
  private String color;
  private double radius;
  private int num;


  public Ball(){

  }
  public Ball(String color){
    this.color = color;
  }

  @Override
  public int hashCode(){
  //hashCode is not unique representation of object reference
    return Objects.hash(this.color);
  }
  //hashCode is a method in Object Class 
  //the aim of using it is to 


  @Override
  public String toString(){
    return "Color: "+this.color;
  }
  
  
  public boolean equals(Object o){
    // if(this == o) return true;
    // if(!(o instanceof Ball)){
    //   return false;
    // } 
    Ball b1 = (Ball) o;
    if(
       this.color.equals(b1.color)
    && this.radius==b1.radius
    && this.num   ==b1.num
       ){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Ball b1 = new Ball("Red");
    Ball b2 = new Ball("RED");
    System.out.println(b1.equals(b2));
    int[] arr = new int[3];
    Arrays.toString(arr);
    System.out.println(b2.hashCode());
    System.out.println(b2);
    System.out.println(b1);
    

  }

}
