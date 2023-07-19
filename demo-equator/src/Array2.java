import java.util.Arrays;

public class Array2 {
  public static void main(String[] args) {
    System.out.println(swap("Hello", 2, 4));
    
  }

  public static String swap(String str, int idx1, int idx2){
    char[] arr = str.toCharArray();
    char temp = arr[idx1];
    arr[idx1]=arr[idx2];
    arr[idx2]= temp;
    return String.valueOf(arr);
  }
}
