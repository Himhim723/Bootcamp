package ObjectCLass.Shape;

import java.util.Objects;

public class 女人 extends 人類 {
  private int x;
  private int y;
  public 女人(int x, int y){
    super();
    this.x=x;
    this.y=y;
  }


  public boolean equals(Object o){
    //if(this==o) return true;
    if(!(o instanceof 女人)) return false; //如果 o 根本不是 人類 都冇得比較啦
    
    女人 女 = (女人) o; //定義返 Object o 係女人 用 "女" 黎代表佢
    return Objects.equals(女.x, this.x) && 
           Objects.equals(女.y, this.y) ;
           
    // if(this.x == point.x && this.y==point.y) return true;  
    // // why can use == 因為數字  if is String we use .equals(...)
    // else return false;

  }


  public static void main(String[] args) {
    女人 女人1 = new 女人(3,4);
    女人 女人2 = new 女人(3,4);
    男人 男人3 = new 男人(3,4);
    Object k = new Object();

    System.out.println(男人3 instanceof 人類); //true
    System.out.println(女人2 instanceof 人類); //true
    //System.out.println(男人3 instanceof 女人); //false (Compile Error)
    System.out.println(女人1 instanceof 女人); //true
    System.out.println( k instanceof 女人); //false
    // k 同 女人 有 linkage 所以
    人類 human = new 女人(0, 0);
    Object obj = new String ("234");

    System.out.println(obj.hashCode());

    
    

    
    
  }
}
