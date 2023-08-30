package Thread;

public class DemoSynchranized {
  //Block Method
  int a; 
  
  public synchronized void increment(){ //synchronized method 
    // Seems like atomic method
    this.a++;  //non atomic operation
  }
  public static void main(String[] args) {
    DemoSynchranized t = new DemoSynchranized();
    Runnable add =()-> {
      for(int i=0;i<1000;i++){
        t.increment();
        System.out.println(t.a);
      };
    };

    Thread a1 = new Thread(()-> {
      for(int i=0;i<1000;i++){
        t.increment();
        System.out.println("Thread 1: "+ t.a);
      };
    });
    Thread a2 = new Thread(()-> {
      for(int i=0;i<1000;i++){
        t.increment();
        System.out.println("Thread 2: "+ t.a + "  This is a2");
      };
    });
    
    a1.start();
    a2.start();
    try{
      a1.join();
      a2.join();
    } catch ( InterruptedException e){

    }
    System.out.println(t.a);
    
  }
}
