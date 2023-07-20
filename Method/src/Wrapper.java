import java.util.Arrays;

public class Wrapper {
  public static void main(String[] args) {
    // Wrapper Class 
    boolean isMale = true;     //it is not an Object
    Boolean isFemale = true;   //It is FUCKING OBJECT (Wrapper Class)

    isMale = true;
    if (isMale){

    }

    if(isFemale){
      System.out.println("hello, Fucking Object");
    }
    
    int num = 2;
    Integer num2 = 4;
    //Integer.valueOf("090");
    num+=num2.valueOf("90");

    System.out.println(num);

    //autoboxing       int => Integer
    Integer b =     (int)12;
    //un-boxing        Integer => int
        int a = (Integer)11;
    //但係其實佢地係一樣既都可以混合使用
    Integer c = a+b;
    





    //即係 Wrapper Class 就係一個 Declare 既 data type
    //但係佢可以用更多既 method 幫我地處理更多問題
    // Wrapper Class 最主要就係 將 Primitive Data type 轉為大階全寫
    // e.g.
    // char    =>   Character
    // byte    =>   Byte
    // short   =>   Integer
    // int     =>   Short 
    // long    =>   Long           總之 long 就放 L
    // float   =>   Float          總之 float 就放 f
    // double  =>   Double         總之 double 就放 d
    // boolean =>   Boolean
    // Wrapper Class 最好既地方就係可以比我地更容易地使用 內置 Method  


    // 常見共通既 Method 有
    // .toString()
    // .valueOf()

    Integer x = 9;
    // Integer.compareTo(數字)    result:    
    System.out.println(x.compareTo(100)); //-1     x 較細
    System.out.println(x.compareTo(1)); //1        x 較大
    System.out.println(x.compareTo(9)); //0        x 一樣
    
    
    
    


  }
}
