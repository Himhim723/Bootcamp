
public class NumberFormatExceptionDemo {
  public static void main(String[] args) {
    try{
      Integer.valueOf("agg");
    } catch(NumberFormatException e){
      System.out.println("NumberForamtException found");
    }
  }

}
