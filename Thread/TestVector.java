package Thread;

import java.util.Vector;

public class TestVector {
  Vector<Integer> a = new Vector<>();



  public static void main(String[] args) {
    TestVector t = new TestVector();

    Runnable add =()-> {
      for(int i=0;i<100;i++){
        t.a.add(i);
      };
    };

    Thread a1 = new Thread(()-> {
      for(int i=0;i<100;i++){
        t.a.add(i);
        System.out.println("AAA");
      };
    });
    Thread a2 = new Thread(()-> {
      for(int i=0;i<100;i++){
        t.a.add(i);
        System.out.println("BBBBBBBBBBBBBBBBBBBBB");
      };
    });
    
    a1.start();
    a2.start();
    try{
      a1.join();
      a2.join();
    } catch ( InterruptedException e){

    }
    //System.out.println(t.a);
  }  
}
