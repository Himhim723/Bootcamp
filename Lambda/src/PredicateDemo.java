import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo{
  
  public static void main(String[] args) throws Exception{
    Predicate<Character> isMale = c -> c=='M';
    System.out.println("df");
    test(isMale, 'M', true);
    Predicate<String> isUpperCase = str -> {
      for(int i=0;i<str.length();i++){
        if(!(str.charAt(i)>=65 && str.charAt(i)<=90)) return false;
      }
      return true;
    };
    test(isUpperCase,"AABD",true);

    BiPredicate<String,String> equals = (s1,s2)-> { 
      return s1.toUpperCase().equals(s2); };
    test(equals, "abbA", "ABBA", true);

  }

  public static <T> void test (Predicate<T> testcase , T data, boolean expected) throws Exception{
    if(testcase.test(data)!= expected)
    throw new Exception();
  }

  public static <T,U> void test (BiPredicate<T,U> testcase , T data, U data2, boolean expected) throws Exception{
    if(testcase.test(data,data2)!= expected)
    throw new Exception();
  }
}
