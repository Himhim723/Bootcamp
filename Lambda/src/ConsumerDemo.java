import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> customer = str -> System.out.println(str);
    customer.accept("Request accepted");

    BiConsumer<String, Integer> bi = (s1, price) -> System.out.println("Item: "+s1+" \tPrice "+price);
    bi.accept("Nike Shoes", 699);

    List<String> strings = new ArrayList<>();
    strings.add("Product A");
    strings.add("Product B");
    strings.add("Product C");
    strings.add("Product D");
    strings.forEach( item -> {
      int i=0;
      while(i<5)
      System.out.println("Item "+(++i)+" : "+item);
    });

    Map<String, Integer> map = new HashMap<>();
    map.put("Orange", 3);
    map.put("Apple", 5);
    map.put("Fish", 7);
    map.put("Jelly", 9);
    map.forEach((key,value)-> {
      System.out.println("Product "+key+"Quantity "+value);
      if(key.equals("Fish")) System.out.println(key + "is found the remaining quantity is "+value);
    }
    );

    int[] nums = new int[]{1,3,2,2,5,2,3,7};
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));

    Predicate<Integer> isAdult = age -> {
      if(age>=18) return true;
      return false;
    };

    System.out.println(test(isAdult,18));
    System.out.println(isAdult.test(15));

    System.out.println(ConsumerDemo.isEvenNumber(96));

    Predicate<Integer> isEvenNum = n -> {return (n%2==0);};
    System.out.println(isEvenNum.test(3));
    Consumer<Integer> CapitalTransfered = n -> {
      System.out.println("You have transfered $"+n+" dollars");
    };
    Consumer<Integer> printSomething = str -> System.out.println(str+" d ");
    CapitalTransfered.accept(10000);

    
  }

  public static <T> boolean test(Predicate<T> check, T data){
    return check.test(data);
  }

  public static boolean isEvenNumber(int num){
    return (num%2==0);
  }
}
