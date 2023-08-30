package DataStructure.Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class PQ {
  public static void main(String[] args) {
    //natural order by default
    Queue<String> queue = new PriorityQueue<>(new SortByDescending());
    queue.add("abc");
    queue.add("cd");
    queue.add("Def");
    System.out.println(queue.poll());
    //Collections.sort(queue, new SortByDescending());
    // sort by ASCII code order ABCDE    abcdefg
    // Collections.sort(queue, 用咩標準黎排 )

    // ArrayList<Integer> arr = new ArrayList<>();
    // arr.add(3);
    // arr.add(31);
    // arr.add(34);
    // arr.add(35);
    // arr.add(31);
    // System.out.println(arr);
    // ArrayList<Integer> arr2 = new ArrayList<>(arr);
    // arr2.add(7777);
    // System.out.println(arr2);
    // ArrayList<Integer> arr3 = arr;
    // arr3.add(2);
    // System.out.println(arr);
    // System.out.println(arr3);
    // System.out.println(arr2);
    Stack<Integer> s =new Stack<>();
    s.push(3);

    System.out.println(s.pop());

    

  }
}
