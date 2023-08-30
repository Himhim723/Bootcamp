package Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class DemoThread{

  Queue<Integer> arr1 = new LinkedList<>();
  Queue<Integer> arr2 = new LinkedList<>();

  public void push(int x) {
    arr1.add(x);
    System.out.println(arr1);
}

public int pop() {
    while(arr1.size()!=1){
        arr2.add(arr1.poll());
    }
    int pop = arr1.poll();
    while(arr2.size()>0){
        arr1.add(arr2.poll());
    }
    
    return pop;
}

public int top() {
    while(arr1.size()!=1){
        arr2.add(arr1.poll());
        System.out.println(arr1 + "sad");
    }
    int pop = arr1.peek();
    arr2.add(arr1.poll());
    while(arr2.size()>0){
        arr1.add(arr2.poll());
    }
    System.out.println(arr1);
    return pop;
}

public boolean empty() {
    return arr1.isEmpty();
}

  public static void main(String[] args) {
    DemoThread a = new DemoThread();
    a.push(1);
    //System.out.println(a.arr1);
    a.push(2);
    //System.out.println(a.arr1);
    a.push(3);
    //System.out.println(a.arr1);
    a.push(4);
    a.push(2);
    a.top();
    //System.out.println(a.arr1);
    // System.out.println("Starts thread");
    // System.out.print("End Thread");
    // System.out.print("End Thread");

    // Consumer<String> print = str -> System.out.println("Hey yo");
    // Runnable          n = () -> System.out.println(" hello");
    // Predicate<String> check = (s) -> s.charAt(0) == 'a';
    
    // Thread t = new Thread("Dfdf"); // Thread can put string in para

    // Thread thread3 = new Thread( () -> {
    //   for(int i=0;i<100;i++){
    //     System.out.println("Thread "+ i+ ": What is Thread");
    //   }
    // });

    // Thread thread4 = new Thread( () -> {
    //   int k= 4;
    //   for(int i=0;i<100;i++){
    //     System.out.println("aii it so difhfioashfhasdofuhaodfhaihffi ah "+i);
    //   }
    // });
    // // Thread thread5 = new Thread( () -> {
    // //   int k= 4;
    // //   for(int i=0;i<100;i++){
    // //     System.out.println("aEnnd \n");
    // //   }
    // // });

    //   thread3.start();
    //   thread4.start();
    // try{
    //   thread3.join();
    //   thread4.join();
    // } catch (InterruptedException e){

    // }
    

    // System.out.println("Main Thread Ends");


    // StringBuffer sb = new StringBuffer("hello");
    // Thread thread6 = new Thread(()-> {
    //   for(int i=0;i<100;i++){
    //     sb.append("i = " + i);
    //     System.out.println(sb.toString());
    //   }
    // }
    // );

    // Thread thread7 = new Thread(()-> {
    //   for(int i=0;i<100;i++){
    //     sb.append("k = " + i);
    //     System.out.println(sb.toString());
    //   }
    // }
    // );
    

    // thread6.start();
    // thread7.start();

  //  int[] arr = new int[] {2,7,4,1,8,1};
  //  Arrays.sort(arr);
  //  System.out.println(Arrays.toString(arr));
  // //  canJump(arr);

  //  PriorityQueue<Integer> queue = new PriorityQueue<>((c,d)-> d-c); 
  //  for(int i:arr){
  //   queue.add(i);
  //  }
  //  System.out.println("test "+ queue);
  //  System.out.println(queue.poll());
  //  System.out.println(queue.poll());
  //  System.out.println(queue.poll());
  //  System.out.println(queue.poll());
  //  System.out.println(queue.poll());
  //  System.out.println(queue.poll());
  //  while(queue.size()>1){
  //     int num1 = queue.poll();
  //     int num2 = queue.poll();
  //     System.out.println("a = "+ num1 + " " + num2);
  //     if(num1 != num2){
  //       queue.add(Math.abs(num1-num2));
  //     } 
  //     System.out.println(queue);
  //   } 

  //  System.out.println(queue);


  //  int[] arr2 = new int[] {5,9,3,2,1,0,2,3,3,1,0,0};
  //  System.out.println(canJump(arr2));

  //  HashSet<Integer> kk = new HashSet<>();
  //  kk.add(3);
  //  kk.add(13);
  //  kk.add(34);
   
  // HashMap<Integer,Integer> hmap = new HashMap<>();
  // //  hmap.put(3,66);
  // //  System.out.println(hmap.remove(66));
  // StringBuilder sb = new StringBuilder();
  

  //  int[] letters  = new int[97+25];
  //  String po = "bbdbagjseddigjgjjggg";
  //  for(int i=0;i<po.length();i++){
  //   letters[po.charAt(i)]++;
  //  }
  //  PriorityQueue<Character> maxHeap = new PriorityQueue<>((as, b) -> {
  //   if(letters[b] != letters[as])
  //   return letters[b] - letters[as];
  //   return b - as;
  //  });

  //  for(int i=0;i<po.length();i++){
  //   maxHeap.add(po.charAt(i));
  //  }

  //  while(!(maxHeap.isEmpty())){
  //   System.out.println(maxHeap.poll());
  //  }
  String s = "abaccb";
  int[] distance =new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
  for(int i='a';i<='z';i++){
    if(s.contains(""+(char)(i)) && 
    s.lastIndexOf(""+(char)(i))-1-s.indexOf(""+i) != distance[i-'a']){
        System.out.println(distance[i-'a']);
        System.out.println(s.lastIndexOf(""+(char)(i)));
        System.out.println(s.indexOf(""+i));
        
        System.out.println(i);
    }
  }
                                // 4      2    2     7       2       4      14
  //  String[] words = new String[]{"Here","is","an","example","of","text","justification."};
  //  System.out.println(fullJustify(words, 14));

  }
  
  public static List<String> fullJustify(String[] words, int maxWidth) {
    int count = 0;
    int start = 0;
    StringBuilder sb = new StringBuilder();
    List<String> arr = new ArrayList<>();
    for(int i=0;i<words.length;i++){
        count += words[i].length() + 1;
        if(count>maxWidth+1){
          System.out.println("count exceed");
            int numOfWord = i - start;
            int diff = maxWidth - (count - words[i].length() - 1 - numOfWord);
            int idx = start;
            while(diff--!=0){
                words[idx] = words[idx++].concat(" ");
                if(idx > i-2) idx = start;
            }
            for(int k = start;k<i;k++){
                sb.append(words[k]);
            }
            arr.add(sb.toString());
            count= words[i].length() + 1;
            start = i;
            sb.delete(0 ,maxWidth);
        } 
        else if (count == maxWidth + 1){
            for(int k =start ; k<=i;k++)
            sb.append(words[k]+" ");
            if(sb.length()== maxWidth + 1)
            sb.delete(maxWidth ,maxWidth + 1);
            arr.add(sb.toString());
            count=0;
            start =i+1;
            sb.delete(0 ,maxWidth);
        } 
    }
    System.out.println("finish");

    if(start != words.length){
        for(int k =start ; k<words.length;k++)
            sb.append(words[k]+" ");
        while(sb.length()!=maxWidth)
            sb.append(" ");
        arr.add(sb.toString());
    }
    return arr;
}

}

