package Interface;

public class Dog implements Move{
  //作用: 
  private String name;
  
  public Dog(){

  }

  // @Override
  // public void jump(){
  //   System.out.println("Jump");
  //   super.addScore(3);
  // }

  // @Override
  // public void up(){
  //   System.out.println("Dog Moving up");
  //   super.addScore(2);
  //   System.out.println(super.getScore());

  // }
  // @Override
  // public void down(){
    
  // }
  // @Override
  // public void right(){
    
  // }
  
  public void left(){
    
  }

  public static void main(String[] args) {
    Dog dog = new Dog();
    // dog.concat("dfs","sdfas");
    //Move.concat("sdf","SDfs");
    dog.print();
  }

  @Override
  public void jump() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'jump'");
  }
}
