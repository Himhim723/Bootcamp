/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int ans=1;
    int after=1;
    int before=0;
    for (int i=1;i<=15;i++){
      System.out.print(ans+"  ");
      ans=before+after;
      before=after;
      after=ans;
    }
    System.out.println();
  }
}