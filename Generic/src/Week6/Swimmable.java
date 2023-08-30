package Week6;

import java.util.List;

public interface Swimmable {
  void swim();

  public static <T extends Swimmable> void start(List<T> humans){
    for(Swimmable human: humans){
      human.swim();
    }
  }
  
}
