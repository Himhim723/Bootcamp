import java.util.Arrays;

public class Swap {


  public static String Swaping (String str){
    char[] charA = str.toCharArray();   // 將 str 轉為 Char Array
    //hello! - > 'h''e''l'
    for (int i=0;i<charA.length;i++){   //Scan Char Array
      if(i%2==1){                       //要將第二個同第一個調轉，唔可以第一同第二調轉
        char a = charA[i];              //當去到 charArray[單數] 將佢同前一個調 即 (i-1)
        charA[i] = charA[i-1];
        charA[i-1] = a;
      }
    }                                   //而家完左Loo調完位 
                                        //char Array變左 charA[] {'e','h','l','l','!','o'}
    String k = "";                      //開一個新既 String 接返住 D Char 用黎 return 出去
    for (int i=0;i<charA.length;i++){   //Scan 多次
      k+=charA[i];                      //將每個字母輸入到 String k 入面
    }                                   //輸入完後 String k 既 value有晒所有字母
                                        // k = ehll!o  readyb for return 
    return k;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {100,-100,3,90};

    int sub = arr[3];
    arr[3] = arr[1];
    arr[1] = sub;

    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }

    String hello = "hello!";
    String abcd = "abcd";
    System.out.println(Swaping(hello));
    System.out.println(Swaping(abcd));
    
    char[] charA = hello.toCharArray();  
    //char[] charA = new char[] {'h','e','l','l','o','!'};
    //                            0   1   2   3   4   5   
    
    for (int i=0;i<charA.length;i++){   //Scan String 
      if(i%2==1){                       //
        char a = charA[i];
        charA[i] = charA[i-1];
        charA[i-1] = a;
      }
    }    //    charA[]      已完成調轉  charA[] {'e','h','l','l','!','o'}
    
    System.out.println(String.valueOf(charA));
    System.out.println(Arrays.toString(charA));

    String k = "";                          // k=""
    for (int i=0;i<charA.length;i++){       // Scan char Array 
                                            // charA[] {'e','h','l','l','!','o'}
      k+=charA[i];                          // k="ehll!o"
    }

    System.out.println(k);
    System.out.println(String.valueOf(1.27));

    
    int[] num = new int[]{5,1,1};
    int max=0;
    int place =0;
    for(int i=0;i<num.length;i++){
      if(num[i]>max){
        max = num[i];
        place = i;
      }
    }

    for(int a=place;a<num.length-1;a++){
        num[a]=num[a+1];
    }

    num[num.length-1]=max;
        
    System.out.println(Arrays.toString(num));



    System.out.println(average(num));








    /* 
    for (int i=0;i<num.length-1;i++){
      if(num[i]>num[i+1]){
        int tem = num[i+1];
        num[i+1]=num[i];
        num[i]=tem;
      }
    }
    System.out.println(Arrays.toString(num));*/
  }
  public static double average(int[] arr){
    double sum = 0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum/arr.length;
  }
}
