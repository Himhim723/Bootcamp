package Interface;

public class Cat extends GameMember implements Move {

  String name;

  @Override
  public void jump(){
    System.out.println("Jump");
    super.addScore(4);
  }
  @Override
  public void up(){
    System.out.println("Cat is Moving up");
    super.addScore(1);
    System.out.println(super.getScore());
  }
  @Override
  public void down(){
    
  }
  @Override
  public void left(){
    
  }
  @Override
  public void right(){
    
  }
  
}
