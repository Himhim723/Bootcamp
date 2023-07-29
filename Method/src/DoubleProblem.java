import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class DoubleProblem {
  private String hi;
  public DoubleProblem(String a){
    this.hi = a;
  }
  public static void main(String[] args) {
    DoubleProblem a = new DoubleProblem("hi");
    DoubleProblem b = new DoubleProblem("hi");
    System.out.println(a==b);
    double result = 0.1 + 0.2;
    System.out.println(result); // 0.30000000004

    if (result == 0.3)
      System.out.println("yes");
    else
      System.out.println("no it is not exactly 0.3");

    System.out.println(result / 0.3);
    System.out.println(result * 1.2);
    System.out.println(1.2 / 0.2);
    System.out.println(0.5 * 0.9);

    System.out.println(0.5 + 0.2);
    System.out.println(0.2 + 0.3);
    System.out.println(0.1 + 0.2);
    System.out.println(0.4 + 0.3);

    // BugDecimal
    BigDecimal bd = new BigDecimal(5);
    BigDecimal b2 = BigDecimal.valueOf(4);
    bd = bd.multiply(bd); // 25
    System.out.println(bd);
    // BugDecimal 基礎功能
    // 普通加減乘除 .add() .subtract() .multiply() .divide()
    // 括號內 must be BUG Decimal

    // BigDecimal cannot use [ > / < / >= / <= ] Operators
    System.out.println(bd.compareTo(b2)); // 前後比較

    System.out.println(bd.divide(b2));
    BigDecimal bd2 = new BigDecimal(3.235d);
    System.out.println(bd2.setScale(2, RoundingMode.UP)); // Round up
    System.out.println(bd2.setScale(2, RoundingMode.DOWN)); // Round DOWN

    System.out.println(b2 == (bd));
    System.out.println(bd);

    int[] arr = new int[] { 2, 6, 1, 3 };     //preset data
    int[] arr2 = new int[] { 1, 2, 3, 4 };
    System.out.println("Arr1 : " + arr);
    System.out.println("Arr2 : " + arr2);
    System.out.println("Arra1:"+Arrays.toString(arr));
    System.out.println("Arra2:"+Arrays.toString(arr2));
    System.out.println();
    arr=arr2;
    arr2[0]=100;
    System.out.println("Arr1 : " + arr);
    System.out.println("Arr2 : " + arr2);
    System.out.println("Arra1:"+Arrays.toString(arr));
    System.out.println("Arra2:"+Arrays.toString(arr2));

    System.out.println();

    System.out.println("Arr1 : " + arr);
    System.out.println("Array1:"+Arrays.toString(arr));

    for (int i = 0; i < arr2.length; ++i) {
      arr2[i] = 10;
    }
    //arr2[0] = 9;
    System.out.println("Arr : " + arr);
    System.out.println(Arrays.toString(arr));

    // System.out.println(Arrays.toString(arr));
    // System.out.println(Arrays.toString(arr2));
    // System.out.println();
    // arr2[0] = 1;
    // System.out.println(Arrays.toString(arr));
    // System.out.println(Arrays.toString(arr2));
    // String a = "abc";
    // String b = new String("abc");
    // System.out.println(a==b);
    // String c = new String();
    // c="abc";
    // System.out.println(b==c);
  }
}
