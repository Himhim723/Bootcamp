package Sale;

import java.time.LocalDate;
import java.util.Arrays;

public class BoatParty {
  private String name;
  private int age;


  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public void setAge(int age){
    this.age=age;
  }
  public int getAge(){
    return this.age;
  }
  //BoatParty b1 =new BoatParty();   //name: abc  age:2
  //BoatParty b2 =new BoatParty();   //name: bcd  age:2
  //main    b1.equals(b2)
  
  @Override
  public boolean equals(Object k){
    BoatParty b2 = (BoatParty) k;
    if(this.name.equals(b2.name)&&this.age==b2.age) 
      return true;
    return false;
  }
  @Override
  public String toString(){
    return this.name;
  }



  public static void main(String[] args) {
    BoatParty b1 = new BoatParty();
    BoatParty b2 = new BoatParty();
    // b1.setName("fdfull");
    // System.out.println(b1.equals(b2));
    // String abc ="Hello";
    // System.out.println(abc.toString());  
    int[] arr = new int[]{1,2,3,4,5,65,4,2,34,213,41,2};
    // String[] starr = new String[]{"2d","Dfasdf","SDfasdfadf"};
    BoatParty[] arr1 = new BoatParty[]{b1,b2};
    String[] Stringarr = new String[]{"DSF","DFasdf"};
    b1.setName("ABC");
    b2.setName("DEFR");
    System.out.println(Arrays.toString(arr1));
    System.out.println(b1);
    System.out.println(b1.toString());
    System.out.println(b2.toString());

    
    //Object toString(); (Object Class 係最大既 Class)
    //String toString(); 
    //Arrays.toString(); 
    //自製Class Suppose no toString() method
    //由於所有 Class 都係implicitly extends 最大既Class (Object Class)
    //自製Class 如果唔設定 toString() method
    // 就會 Run Object Class既 toString() 
    // Object Class既 toString() 係for print out address
    // 所以 如果直接 sysout 自製 Object 就會 print out 地址
    // 所以 我地要好似 String Class Arrays Class 咁自己 set 好一個 toString() Method



    

  }
}
