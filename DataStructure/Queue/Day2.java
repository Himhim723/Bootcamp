package DataStructure.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Day2 {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    Deque<String> deque = new LinkedList<>();

    run1(new LinkedList<>());
    run1(new ArrayDeque<>());

    run2(new LinkedList<>());
    run2(new ArrayDeque<>());
    run2(new PriorityQueue<>());

    
  }
  public static void run1(Deque<String> deque){
    deque.add("aa");
    deque.add("aa");
  }

  public static void run2(Queue<String> queue){
    queue.add("bb");
    queue.add("bb");
  }
}
