/*

Question : Given an integer n, return true if n has exactly three positive divisors. 
Otherwise, return false.

An integer m is a divisor of n if there exists an integer k such that n = k * m.

*/
public class JavaQuest21 {
  public static void main(String[] args) {
    JavaQuest21 good = new JavaQuest21();
    System.out.println(good.isThreeDivisors(1)); // false
    System.out.println(good.isThreeDivisors(3)); // false
    System.out.println(good.isThreeDivisors(4)); // true, 4/1, 4/2, 4/4
    System.out.println(good.isThreeDivisors(12));// false
    System.out.println(good.isThreeDivisors(9999));// false
    
  }

  public boolean isThreeDivisors(int n) {
    // finish the code
    int count=0;
    for(int i=1;i<=n;i++){
      if(n%i==0) count++;
      if(count>3) return false;
    }
    if(count==3) return true;
    else return false;
  }
}