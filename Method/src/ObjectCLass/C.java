package ObjectCLass;

import java.util.Arrays;

public class C extends B{

  public void print(int[] arr){
    System.out.println(Arrays.toString(arr));
  }

  // @Override
  // public void print(String aa){
  //   System.out.println(aa);
  // }
  

  public static void main(String[] args) {
    C c = new C();
    c.setNum(12);
    c.setString("J");
    c.print(22);
    c.print("ddddddd");   //Class B 既 print if Class C no method with print(String aa)
    c.print(new int[]{1,2,3,4,5,6,7,8,9,10});

  }
}
