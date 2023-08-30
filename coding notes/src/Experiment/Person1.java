import java.util.Arrays;

public class Person1 {
  private String name;
  private Pocket[] pockets;

  public Person1(String name){
    this.name=name;
    this.pockets = new Pocket[2];
    this.pockets[0] = new Pocket();
    this.pockets[1] = new Pocket();
  }

  public Pocket getLPocket(){
    return this.pockets[0];
  }
  public Pocket getRPocket(){
    return this.pockets[1];
  }
  public int getTotalScore(){
    int score = 0;
    for(int i=0;i<pockets.length;i++){
      score+=pockets[i].getScore();
    }
    return score;
  }

  

  public static void main(String[] args) {
    Person1 Him = new Person1("Him Lee");
    Him.getLPocket().FillThePocket();
    Him.getRPocket().FillThePocket();
    System.out.println("Left Pocket\n"+ Him.getLPocket());
    System.out.println("Right Pocket\n"+Him.getRPocket());
    System.out.println(Him.getTotalScore());
    Person1 Patrick = new Person1("Patrick");
    Patrick.getLPocket().FillThePocket();
    Patrick.getRPocket().FillThePocket();
    System.out.println("Patrick Left Pocket\n"+ Patrick.getLPocket());
    System.out.println("Patrick Right Pocket\n"+Patrick.getRPocket());
    System.out.println(Patrick.getTotalScore());



  }
  


}
