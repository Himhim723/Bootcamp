package Interface;

public abstract class GameMember {
  private int score;


  public void setScore(int score){
    this.score = score;
  }

  public void addScore(int score){
    this.score+=score;
  }
  public abstract void up();
  public abstract void down();
  public abstract void left();
  public abstract void right();


  public int getScore(){
    return this.score;
  }

  public static void upOnce(GameMember... members){
    for(GameMember member: members){
      member.up();
    }
  }

  public static void moveOnce(Move[] members){
    for(Move member: members){
      member.jump();
    }
  }

  

  public static void main(String[] args) {
    Dog dog1 = new Dog();
    Cat cat1 = new Cat();
    GameMember.upOnce(dog1,cat1);

    Move[] moves = new Move[]{dog1,cat1};
    GameMember.moveOnce(moves);
    System.out.println(dog1.getScore());
    System.out.println(cat1.getScore());
    //default method in interface
    cat1.print();
    dog1.print();
    
    Move.concat("sdf","ASDf");

    Cow cow = new Cow();
    cow.print();
  }
}
