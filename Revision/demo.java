package Revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
    // Stream support List, Map, Arrays.stream()
    List<String> arrlist = new ArrayList<>();
    arrlist.stream();

    HashSet<String> hset  =new HashSet<>();
    hset.stream();
    Arrays.stream(new String[3]);


    Map<String, Integer> hmap = new HashMap<>();
    hmap.keySet().stream();
    hmap.values().stream();
    hmap.entrySet().stream();

    // Stream function
    // .stream()
    // .map correct data
    // .filter only exist data with condition
    // .sorted
    // .collect
    // Optional  need to learn
    // .get .OrElse                                                                                            

    
  
  }
}
