package DataStructure.Queue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Queue1 {
  //Linked List
  //Priority Q
  //Queue: Linked List / Priority Queue / Stack

  public static int count=0;
  private PriorityQueue<String> order;
  private int id;

  private Queue1(){
    this.id=++count;
    order.add("A"+this.id);
  }

  public static void Press(){
    new Queue1();
    System.out.println();
  }

  public static void Poll(){

  }



  public static void main(String[] args) {
    PriorityQueue<String> name = new PriorityQueue<>();  
    // First in  First out
    // according to the priority 
    // First Second
    // While Hashset and ArrayList does not arrange according to the 
    name.add("1001");
    name.add("1002");
    name.add("1003");
    name.add("1004");
    System.out.println(name.size()); //Check how many items in waiting list
    System.out.println(name.peek()); //下一張單是 1001
    System.out.println(name.poll()); //1001 進入了
    System.out.println(name.poll());
    System.out.println(name.poll());
    System.out.println(name.poll());
    System.out.println(name.poll());
    System.out.println(name.poll());
    System.out.println(name.size());
    name.add("1005");
    name.add("1006");
    name.add("1008");
    name.add("1009");
    name.add("0010");
    
    name.add("1011");
    System.out.println(name.remove("1005"));
    System.out.println("a"+name.peek());
    System.out.println(name.offer("1009a"));
    System.out.println(name.peek());
    System.out.println(name.poll());
    System.out.println(name.poll());
    System.out.println(name.poll());
    System.out.println(name.poll());
    System.out.println(name.poll());    
    System.out.println(name.poll());
    

    String[] arr = new String[]{"12312","1231231"};
    String[] happy = Arrays.copyOf(arr,arr.length);
    happy[0]="Happy";
    System.out.println(Arrays.toString(happy));
    System.out.println(Arrays.toString(arr));
    PriorityQueue<String> h1 = new PriorityQueue<>();
    PriorityQueue<String> h2 = h1;
    
    happy[0]="Happy";
    
    
    
  }

  
}
