package Thread.Lock;

public class TestSynchronizedLock {
  int x;
  Object lock1 = new Object();
  Object lock2= new Object();

  public int calculate(int amount){
    int total = amount;
    synchronized(lock1){
      this.x++;
    }
    //this.increment();
    return this.x;
  }
 
  // public synchronized void increment(){
  //   this.x++;
  // }

  public static void main(String[] args) {
    TestSynchronizedLock a = new TestSynchronizedLock();
    
    Thread thread = new Thread(()->{
      for(int i=0;i<1000000;i++){
        a.x++;
        System.out.println(a.x);
      }
    });

    Thread thread2 = new Thread(()->{
      for(int i=0;i<1000000;i++){
        //System.out.println(a.calculate(i));
        a.x++;
        System.out.println(a.x);
      }
    });

    thread.start();
    thread2.start();


  }
}
