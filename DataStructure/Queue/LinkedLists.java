package DataStructure.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


public class LinkedLists {
  public static void main(String[] args) {
    LinkedList<Integer> queueNum = new LinkedList<>();
    queueNum.add(10);
    queueNum.add(9);
    queueNum.add(0);
    queueNum.add(-3);
    queueNum.add(100);
    System.out.println(queueNum.poll());
    System.out.println(queueNum);
    System.out.println(queueNum.size());
    System.out.println(queueNum.get(0));
    System.out.println(queueNum.get(1));
    System.out.println(queueNum.indexOf(100));

    int count =0;
    // Method 1 use For Loop
    // for(int i=0;i<queueNum.size();i++){
    //   if(queueNum.get(i)%2==0){
    //   count++;
    //   if(count==2) queueNum.remove(i);
    //   }
    // }

    // Method 2 use While Loop
    // int idx=0;
    // while(idx<queueNum.size()){
    //   if(queueNum.get(idx)%2==0) {
    //   count++;
    //   if(count==2) queueNum.remove(idx);
    //   }
    //   idx++;
    // }

    //Method 3 use for Loop and didnt use remove method
    // for(int i=0;i<queueNum.size();i++){
    //   Integer temp = queueNum.get(0);
    //   queueNum.poll();
    //   //queueNum.pop();
    //   //queueNum.remove(0);
    //   if(temp%2==0){
    //     if(++count==2) 
    //     continue;
    //   }
    //   queueNum.add(temp);
    // }
    System.out.println(queueNum);

    //For Each Loop
    

    
  }
}
