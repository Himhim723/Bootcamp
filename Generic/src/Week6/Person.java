package Week6;

import java.io.Serializable;

public class Person implements Swimmable{

  @Override
  public void swim() {
    System.out.println("Person is swimming");
  }
  
}
