package Thread;

public class B {
  public static void main(String[] args) {
    
    Aread thread1 = new Aread(() -> {
      for(int i=0;i<13;i++){
        System.out.println("Hello world");
      }
    });
    
    Aread thread2 = new Aread( ()-> {
      for(int i=0;i<13;i++){
        System.out.println("SADFASDFASDFASDFASDFASDFASFA");
      }
    });

    thread1.go();
    thread2.go();
    
  }
}
