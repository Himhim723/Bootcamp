package Thread;

import java.util.LinkedList;
import java.util.List;

public class TestList {
  List<Integer> integers = new LinkedList<>();

  public static void main(String[] args) {
    TestList t = new TestList();
    t.integers.add(3);

    Runnable addInt = ()-> {
      for(int i=0;i<120;i++){
        t.integers.add(i);
      }
    };

    Thread thread1 = new Thread(addInt);
    Thread thread2 = new Thread(addInt);
    thread1.start();
    thread2.start();
    try{
      thread1.join();
      thread2.join();
    } catch ( InterruptedException e){

    }

    System.out.println(t.integers);

    
  }
}
