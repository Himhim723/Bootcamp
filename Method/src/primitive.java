public class primitive {
  public static void main(String[] args) {
    //Correct Syntax
    //Upcasting (Implicit 隱藏地做 Conversion)
    // byte --> short --> int --> long --> float --> double
    // char --> int 
    short d = 3;
    //short 比 byte 大 所以佢唔可以放入 byte 既 data type
    byte b = 2;
    short c = b; //byte --> short   upcasting / promotion
    int i = c;
    long k = i;
    float o = k;
    double m = o;
    char q = '@';
    int u = q;
    System.out.println(u);

    //downcase is not ok
    //because we cannot convert more precise data to brief data
    //if you still want to convert the data you need to add 
    float f = (float) m;

    //ASCII to char
    //48 is '0'
    //65 is 'A'
    //97 is 'a'
    
    /*
     * Primitive 單位轉換 (Primitive data 除左 String 以外都係)
     * 單位係有細至大既分別
     *  Byte       
     *  Short 
     *  Int 
     *  Long 
     *  Float
     *  Double
     *  如果我地想將幾種 Data combine 埋一齊
     *  我地只可以做 upcasting 既 approach
     *  Byte 係由 -128 到 127
     *  Short 個 range 又再大 D 
     *  int 又再大 D 
     *  所以即係如果 [我地最終Data既range係你overwrite既range大]
     *  java 既 System 會自動幫你做個化
     * 
     *  幾時會有 Error 
     *  當你試試下你發現 唉？點解 Error 左你就可以望下 DATA TYPE 係咪錯左
     *  我地可以將 細既 Data type Overwrite 大既 Data type 
     *  但我地唔可以將 大搬去細
     *  所以 java System Error 左你
     *  如果你點都想做個轉換
     *  就做個 重新定義  (加個括號再定義新的 Variable Type)
     *  
     */


    int dd = 98;
    char aa = (char) dd;

    System.out.println(aa);

  }
}
