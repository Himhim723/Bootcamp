package Interface;

public class SmallDog extends Dog {
  
  public SmallDog(){
    super();
  }

  @Override
  public void jump(){
    super.addScore(5);
    System.out.println("I have no leg i cant run");
  }


  public static void main(String[] args) {
    SmallDog sd = new SmallDog();
    sd.jump();
    Dog d1 = new Dog();
    d1.jump();
    System.out.println(sd.getScore());
    System.out.println(d1.getScore());
    sd.up();
    sd.up();
    
    
  }
}
