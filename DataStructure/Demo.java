package DataStructure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Demo {
  public static void main(String[] args) {
    // Deque<String> arrDeque = new ArrayDeque<>(); //Array Based
    // arrDeque.addFirst("a");
    // arrDeque.addLast("b");
    // arrDeque.pollFirst();
    // arrDeque.pollLast();

    // Deque<String> linkedList = new LinkedList<>(); //Linked Node Based
    // linkedList.addFirst("a");
    // linkedList.addLast("b");
    // linkedList.pollFirst();
    // linkedList.pollLast();
    
    // Queue<String> linkedList2 = new LinkedList<>(); //Linked Node Based
    // linkedList2.add("a");
    // linkedList2.poll();

    // Queue<String> arrDeque2 = new ArrayDeque<>(); //Linked Node Based
    // arrDeque2.add("a");
    // arrDeque2.poll();

    // Queue<String> pQueue = new PriorityQueue<>(); // Array based
    // pQueue.add("a");
    // pQueue.poll();

    // List<Integer> arrayList = new ArrayList<>();
    // arrayList.add(3);
    // arrayList.remove(3);

    // List<Integer> linkedList3 = new LinkedList<>(); //AddFirst AddLast Poll belongs to Deque
    // linkedList3.add(3);
    // linkedList3.get(0);

    // Vector<Integer> stack1 = new Stack<>();
    // stack1.add(3);
    // stack1.get(0);

    // Stack<Integer> stack2 = new Stack<>();
    // stack2.push(33);
    // stack2.pop();

    String pattern = "abba";
    String s = "dog cat cat fish";
     HashMap<Character,String> map = new HashMap<>();

        String[] words = s.split(" ");
        for(int i=0;i<pattern.length();i++){
            System.out.println(map.get(s.charAt(i)));
            if(map.get(s.charAt(i))==null) {
                map.put(s.charAt(i),words[i]);
                System.out.println(map.get(s.charAt(i)));
            }
            if(!(map.get(s.charAt(i)).equals(words[i]))) System.out.println("It is wrong");
        }
        for(Character a : map.keySet()){
          System.out.println("test "+map.get(a));
        }
    
    
  }
  @Override
    public boolean equals(Object o){
        if( o == this) return true;
        if(!(o instanceof Character)) return false;
        Character c = (Character) o;
        return c==this;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this);
    }
}
