package DataStructure.Hash1;

import java.util.Objects;

public class Coordinates {
  int x;
  int y;

  public Coordinates(int x, int y){
    this.x=x;
    this.y=y;
  }
  public int getY(){
    return this.y;
  }
  public int getX(){
    return this.x;
  }

  @Override
  public boolean equals(Object o){
    if(o == this) return true;
    if(!(o instanceof Coordinates)) return false;
    Coordinates point = (Coordinates) o;
    if(Objects.equals(point.x,this.x)&&
       Objects.equals(point.y,this.y)) 
    return true;
    return false;
  }
  @Override
  public int hashCode(){
    return Objects.hash(this.x,this.y);
  }



  @Override
  public String toString(){
    return new String("[x = "+this.x+", y = "+this.y+"]");
  }


}
