public class ArthmeticalException {
  public static void main(String[] args) {
    int i=0;
    int n=100;
    //int result = n/i;   //由於 Numbers cannot be divided by 0
    int result =0;
    try{
      result = n/i;
    } catch(ArithmeticException e) {
      result =0;
    }
    System.out.println("Result = "+ result);

    
  }
}
