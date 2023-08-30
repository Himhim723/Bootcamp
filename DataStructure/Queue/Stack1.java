package DataStructure.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Stack1 {
  public static void main(String[] args) {
    Stack<String> stack1 = new Stack<>();
    // Stack function "add" is the same with "push"
    // Stack && LinkedList && ArrayList 
    // Stack First in Last Out
    stack1.push("1");
    stack1.push("2");
    stack1.push("3");
    stack1.push("4");
    stack1.push("5");
    stack1.push("6");
    stack1.push("7");
    stack1.push("8");
    stack1.push("0");
    stack1.push("9");
    System.out.println(stack1.remove(0));
    System.out.println(stack1.pop());
    System.out.println(stack1.pop());
    while(! stack1.isEmpty()){
      System.out.println(stack1.pop());
    }
    stack1.push("1");
    stack1.add("HelloWorld");
    System.out.println(stack1.pop());
    ArrayList<String> hello = new ArrayList<>();
    hello.add("ef");
    hello.remove(0);
    // ArrayList 
    // .add 
    // .set
    // .remove

    LinkedList<String> n = new LinkedList<>();
    n.add("Num 1");
    n.add("Num 2");
    n.add("Num 3");
    n.add("Num 4");
    n.add("Num 5");
    
    System.out.println(n.poll());
    System.out.println(n.poll());
    System.out.println(n.poll());
    System.out.println(n.poll());
    System.out.println(n.peek());
    System.out.println(n.poll());
    // LinkedList && ArrayDeque
    // .add
    // .addFirst / .addLast
    // .remove(0) / .poll() / .pop() remove first element
    // .removeLast/removeFirst()

    // ArrayList
    // .add(0,"dfdf");

    // Stack
    // .add
    // .remove() ... remove index element 
    // .pop()  ... remove the last element

    // Priority Queue
    // 
  }
}
