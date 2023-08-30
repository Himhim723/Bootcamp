package DemoHashTable;

import java.util.Hashtable;
import java.util.Map;

import Thread.DemoThread;

public class DemoHashTable {
  Map<String, Integer> table = new Hashtable<>();

  //Thread  --> 
  public static void main(String[] args) {
    DemoHashTable ht = new DemoHashTable();
    Runnable putRecord = ()-> {
      for(int i=0;i<100000;i++)
      ht.table.compute("abc", (key,old) -> old == null? 1: old + 1);
    };
    Thread thread1 = new Thread(putRecord);
    Thread thread2 = new Thread(putRecord);
    thread1.start();
    thread2.start();
    
    try{
      thread1.join();
      thread2.join();
    } catch ( InterruptedException e){

    }
    System.out.println(ht.table.get("abc"));

  }
}
