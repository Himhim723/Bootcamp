import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {
  public static void main(String[] args) {  
    var n = 3;

    List<String> strings = Arrays.asList("ABD","eee");
    for(String s: strings) System.out.println(s);
    strings.forEach(d -> System.out.println(d));

    Map<String,Integer> d = new HashMap<>();
    for(var ssss: d.entrySet()) System.out.println(ssss.getKey());

    

    
  }

}
