import java.util.function.Predicate;

public class CombineDemo {
  public static void main(String[] args) {
    Predicate<String> startsWithE = s1 -> s1.startsWith("E");
    Predicate<String> endsWithE = s1 -> s1.endsWith("E");

    Predicate<String> combined = startsWithE.and(endsWithE);
    System.out.println(combined.test("ExxE"));
    System.out.println(combined.test("exxE"));
    System.out.println(combined.test("hxxE"));
    System.out.println(combined.test("ExxE"));
    
  }
}
