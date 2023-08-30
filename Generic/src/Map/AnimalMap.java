package Map;

import java.util.HashMap;
import java.util.Map;

public class AnimalMap<T>{
  Map<T, String> map;

  public AnimalMap(){
    this.map = new HashMap<>();
  }
  public void put(T key, String name){
    map.put(key,  name);
  }

  public String get(T key){
    return map.get(key);
  }
  public static void main(String[] args){
    AnimalMap<String> map = new AnimalMap();
    AnimalMap<Integer> map2 = new AnimalMap();
    map2.put(3,"Hello");
    System.out.println(map2.get(3));

  }
}
