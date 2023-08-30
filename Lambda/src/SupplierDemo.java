import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) throws Exception{
    Supplier<LocalDate> now = () -> { return LocalDate.now();};
    test(now,LocalDate.now());

    //Random Password Producer
    Supplier<String> randomPw  = () -> {
      StringBuilder sb = new StringBuilder();
      Random ran = new Random();
      for(int i=0;i<ran.nextInt(3)+5;i++)
      sb.append((char)(ran.nextInt(26)+'a'));
      return sb.toString();
    };
    System.out.println(randomPw.get());
    System.out.println(randomPw.get());
    System.out.println(randomPw.get());

    Supplier<Integer> randomNum = () -> {   return new Random().nextInt(5)+3;   };
    System.out.println(randomNum.get());

  }

  public static <T> void test(Supplier<T> testcase, T result) throws Exception{
    if(testcase.get() == result)
    //return;
    throw new Exception();
  }

 
}
