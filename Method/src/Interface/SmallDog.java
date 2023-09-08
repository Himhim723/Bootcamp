package Interface;

import java.util.ArrayList;
import java.util.List;

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
    // sd.jump();
    // Dog d1 = new Dog();
    // d1.jump();
    // System.out.println(sd.getScore());
    // System.out.println(d1.getScore());
    // sd.up();
    // sd.up();
    List<Integer> arr = new ArrayList<>();
    List<Integer>[] f = new List[3];
    StringBuilder sb = new StringBuilder();
    int ans = (int) Math.sqrt(8);
    System.out.println(ans);
    
  }
}
