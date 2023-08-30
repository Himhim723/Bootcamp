package DataStructure.ArrayList1;

import java.util.Objects;

public class Ball {
  int id;
  Color color;
  private static int count;

  public Ball(Color color){
    this.id=++count;
    this.color=color;
  }

  public Ball(int num){
    Color temp = null;
    switch(num){
      case 0: temp=Color.RED;
              break;
      case 1: temp=Color.BLUE;
              break;
      case 2: temp=Color.YELLOW;
    }
    this.id=++count;
    this.color=temp;
  }

  public int getID(){
    return this.id;
  }
  public Color getColor(){
    return this.color;
  }
  public int getScore(){
    return this.color.getScore();
  }


  @Override
  public boolean equals(Object o){
    if(o == this) return true;
    if(!(o instanceof Ball)) return false;
    Ball ball = (Ball) o;
    if(Objects.equals(ball.id,this.id) &&
       Objects.equals(ball.color, this.color)) return true;
    return false;
  }
  @Override
  public String toString(){
    return new String("I am Ball id: "+this.id+" Color: "+this.color);
  }
  @Override 
  public int hashCode(){
    return Objects.hash(this.id,this.color);
  }
}
