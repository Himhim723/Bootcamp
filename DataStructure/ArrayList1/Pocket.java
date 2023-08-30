package DataStructure.ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Pocket {
  ArrayList<Ball> balls;
  
  public Pocket(){
    this.balls = new ArrayList<>();
  }

  public void add(Ball ball){
    if(this.balls.size()>=5){
      this.balls.remove(0);
    }
    this.balls.add(ball);
  }

  public void add(Ball ball,int quantity){
    for(int i=0;i<quantity;i++){
      this.balls.add(ball);
    }
  }
  
  public ArrayList<Ball> getBalls(){
    return this.balls;
  }

  public int getScore(){
    int score =0;
    for(int i=0;i<balls.size();i++){
      score+=balls.get(i).getScore();
    }
    return score;
  }

  public boolean isAdult(int age){
    if(age>=18) {
      return true;
    }
    return false;
  }



  public void remove(Ball ball){
    this.balls.remove(ball);
  }
  public void remove(int id){
    // for(int i=0;i<this.balls.size();i++){
    //   if(this.balls.get(i).getID()==id){
    //     this.balls.remove(i);
    //   }
    // }
    for(Ball b:this.balls){
      if(b.getID()==id){
        this.balls.remove(b);
        return;
      }
      
    }
  }
  public int getSize(){
    return this.balls.size();
  }

  public boolean isFull(){
    return this.balls.size()>=5;
  }

  public void removeFirstBall(){
    this.balls.remove(0);
  }

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<balls.size();i++){
      sb.append("Ball "+(i+1)+":"+this.balls.get(i)+"\n");
    }
    return sb.toString();
  }

  public void fillThePocket(){
    Random ran = new Random();
    while(!(this.isFull())){
      this.balls.add(new Ball(ran.nextInt(3)));
    } 
  }


 




}
