package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Integer1 {
  AtomicInteger number = new AtomicInteger(0);
  public static void main(String[] args) {
    Integer1 n = new Integer1();
    Runnable increment =()->{
      for(int x=0;x<10;x++){
        n.number.incrementAndGet();
      }
    };
    //n.number++; // Non-Automic Operation
    //System.out.println(n.number); //

   Thread abc = new Thread(()->{
      for(int i=0;i<10;i++){
        System.out.println("Thread A abc" + n);
      }
   });

  Thread bcd = new Thread(()->{
    for(int i=0;i<100000;i++){
      System.out.println("Thread B bcd" + n);
    }
  });

  Thread m = new Thread(increment);
  m.start();
  abc.start();
  // bcd.start();

  Thread name = new Thread("Hello workd");
  //name.start();

    
  }
  public String toString(){
    return ""+number;
  }
}
