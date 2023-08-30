package DataStructure.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArrayDeque1 {
  public static void main(String[] args) {
    ArrayDeque<String> word = new ArrayDeque<>();
    LinkedList<String> words = new LinkedList<>();
    word.add("ABC1");
    word.add("ABC0");
    word.add("ABC3");
    word.add("ABC4");
    System.out.println(word);
    word.pop(); //remove 1st element
    System.out.println(word);
    System.out.println(word.size());
    word.add("ABC3");
    System.out.println(word);
    //LinkedList
    words.addLast("ABC");
    words.get(0);

  }
}
