package DataStructure.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ball implements Comparable<Ball> {
  String name;
  int id;
  Color color;

  public Ball(int id,Color color){
    this.id=id;
    this.color=color;
  }

  public Color getColor(){
    return this.color;
  }

   @Override 
  public String toString(){
    return String.valueOf(this.id);
  }

  @Override
  public int compareTo(Ball o) {
    if(o.color==Color.YELLOW) return 1;
    else return this.id-o.id;
  }


  public static void main(String[] args) {
    Ball ball13 = new Ball(13,Color.GREEN);
    Ball ball10 = new Ball(10,Color.YELLOW);
    Ball ball3 = new Ball(3, Color.GREEN);
    Ball ball36 = new Ball(36, Color.RED);

    ArrayList<Ball> ballList = new ArrayList<>();
    ballList.add(ball13); //green
    ballList.add(ball10); //yellow
    ballList.add(ball36); //red
    ballList.add(ball3);  //green

    Collections.sort(ballList);
    System.out.println(ballList);
    
  
    
  }
}
