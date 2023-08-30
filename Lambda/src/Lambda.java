import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Lambda {

  public static void main(String[] args) {
    Fun length = str -> str.length();
    System.out.println(length.apply("vdddva"));
    Map<String, String> map = new HashMap<>();
    map.put("abc","mary");
    //Fun<String,String>  formula = s -> "default"; 
    System.out.println(map);



    String result = map.computeIfAbsent("bcd" , s -> "Default");
    BiFunction<Integer, Integer, BigDecimal> additional =  (x,y) ->
    BigDecimal.valueOf(x+y);



    //System.out.println(result);
    System.out.println(map);
    
    System.out.println(additional.apply(3, 6).doubleValue());

    
    System.out.println(map.compute("dbc", (s1,s2)-> "egg"));
    System.out.println(map);
    System.out.println(map.put("bc", "df"));
    System.out.println(map.compute("bfc", (s1,s2)-> "hello"));
    
    System.out.println(map);

    HashMap<String, Integer> stack = new HashMap<>();
    stack.put("clothes", 180);
    stack.compute("clothes",(item, oldPrice) -> (int)(oldPrice - oldPrice * 0.1));
    System.out.println(stack.get("clothes"));

    stack.compute("clothes", (item, oldPrice)-> null);
    stack.compute("clothes", (item, oldPrice)-> 0);
    System.out.println(stack.get("clothe"));
    stack.put("clothes", stack.get("clothes")+1);
    System.out.println(stack);

    BiFunction<String,Integer,Character> charAt = (s1, n) -> {
      return s1.charAt(n);
    };

    // static final(constant) 
    // instance variavle 
    // static variable 
    // constructors
    // public instance method main logic 
    // static metohod tasks private method

    //Lamda Switch method
    int score = 99;
    

    
  }
} 
