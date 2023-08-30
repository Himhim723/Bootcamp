import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class UnaryDemo {
  public static void main(String[] args) {
  UnaryOperator<String> str = str1 -> str1.toUpperCase(); 
  System.out.println(str.apply("noo"));

  BinaryOperator<String> concat = (str1 ,str2) -> str1.concat(str2);
  System.out.println(concat.apply("hello", " World"));

  BinaryOperator<Integer> add = (n1,n2) -> n1+n2;
  add.apply(5,1);
  System.out.println(add.apply(9, 999));

  UnaryOperator<String> toUpperCase = s1 -> s1.toUpperCase();
  String a = "him";
    System.out.println(toUpperCase.apply(a));
    System.out.println(a);

  UnaryOperator<String> Tmethod = mon -> mon.toLowerCase(); //return same type method
  BinaryOperator<String> Method = (s1,s2) -> s1.concat(s2); // return same type method but two parameter
  Supplier<Character> randomProducer = ()-> (char)(new Random().nextInt(26)+65);
  
  }
}
