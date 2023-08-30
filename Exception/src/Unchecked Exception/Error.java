import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Error {

  //  try  ...  catch  如果觸及一 D Limit which will cause accident 就即 Stop running 執行 catch
  //  throw  set Limit 避免 program runtime error

  //  We can also Construct an Exception ourself

  //  Extends Exception 
  //  By constructing a class for the Exception you created
  //  Step 2 : extends exception
  //  Throw the Exception while you need it in your class method

  //  if method throw the exception they must do try catch to prevent mistakes
  //  if the problem may not be fixed,
  //  When the exception extends runtime exception
  //  you can avoid doing try and catch

  //  Avoid writing System.out in main Method
  
  public static void main(String[] args) {
    int i=14;
    int s=34;
    
    try{
      s = 1/i;
    } catch(ArithmeticException e){
      System.out.println("Cannot divided by 0");
    } finally{
      System.out.println("Yeah");
    }

  }


  
}
