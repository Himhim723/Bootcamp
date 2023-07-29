import java.util.Arrays;

public class Integer3 {
  public static void main(String[] args) {
    //Cache
    Integer num1 = 100;
    Integer num2 = 100;
    System.out.println(num1==num2);

    num1 = 128;
    num2 = 128;
    System.out.println(num1==num2);
    // == check if location is the same // .equals check if the value is the same
    if(num1.equals(num2))  //value same
    System.out.println("hi");
    if(num1==num2)        //value over 127 so two object were created with different locations
    System.out.println("hellllo");
    //Short Long Int Byte Boolean Character 全都有Cache
    //Short Long Int Byte -128 to 127
    //Boolean Only true / false
    //Character Only ASCII 0 to 127  所有數字同英文字母都已包括在內

    Double num3 = 126.0;
    Double num4 = 126.0;
    System.out.println(num3==num4);
    //Double/ Float 小數 係冇 Cache
    
    String name = "Him";
    String name2 = new String("Him");
    String xx = name;
    System.out.println(xx==name);

    Integer an = Integer.valueOf(128);
    Integer am = 128;
    System.out.println(an==am);

  }
}
