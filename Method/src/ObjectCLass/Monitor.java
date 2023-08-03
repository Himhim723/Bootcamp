package ObjectCLass;

import java.util.Objects;

public class Monitor extends Laptop{
  private double length;
  private double width;

  public Monitor (double length,double width){
    this.length=length;
    this.width=width;
  }
  public void setLength(double length){
    this.length=length;
  }
  public void setWidth(double width){
    this.width=width;
  }
  public double getLength(){
    return this.length;
  }
  public double getWidth(){
    return this.width;
  }

  @Override 
  public boolean equals(Object o){
    if(o==this) return true;
    if(!(o instanceof Monitor)) return false;
    Monitor mon = (Monitor) o ;
    return Objects.equals(mon.length,this.length)&&
           Objects.equals(mon.width, this.width);
  }
}
