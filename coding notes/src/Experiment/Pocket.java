import java.util.ArrayList;
import java.util.Random;


public class Pocket {
  private ArrayList<Ball1> balls;

  public Pocket(){
    this.balls = new ArrayList<Ball1>();
  }

  public void addBall(Ball1 ball){
    if(this.balls.size()==5){
      this.balls.remove(0);
    }
    this.balls.add(ball);
  }

  public void FillThePocket(){
    Random ran = new Random();
    for(int i=balls.size();i<5;i++){
      this.balls.add(new Ball1(ran.nextInt(3)));
    }
  }

  public int getScore(){
    int score=0;
    for(int i=0;i<balls.size();i++){
      score += balls.get(i).getScore();
    }
    return score;
  }
  
  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<balls.size();i++){
      sb.append(this.balls.get(i)+"\n");
    }
    return sb.toString();  //StringBuilder --> String
  }

}
