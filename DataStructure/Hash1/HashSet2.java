package DataStructure.Hash1;

import java.util.HashSet;

public class HashSet2 {
  public static void main(String[] args) {
    HashSet<Byte> bytes = new HashSet<>();
    bytes.add(bytes(4));
    boolean added10 = bytes.add(bytes(10));
    boolean isAdded4 = bytes.add(bytes(4));
    bytes.addAll(bytes);
    System.out.println(bytes);
    // HashSet入面冇次序可言 所以我地不可像 ArrayList 一樣用.get(0) 去找東西
    // 最多用 for each Loop

    

    
  }


  public static Byte bytes(int num){
    return Byte.valueOf((byte)num);
  }
}
