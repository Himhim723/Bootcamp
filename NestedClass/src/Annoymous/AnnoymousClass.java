package Annoymous;

public class AnnoymousClass {
  static int x =10;
  
  public static void main(String[] args) {
    AnnoymousClass cla = new AnnoymousClass();

    RunInterface a = ()-> {
      x++;
      System.err.println("Hello" + x);
    };

    a.eat();

    RunInterface b = new RunInterface(){
      @Override
      public void eat(){
        x++;
        System.err.println("Hello" + x);
      }
    }; 
    
    b.eat();

  }
}
