import java.util.Arrays;

public class Method{
    // 行動 Method
    /* 要引用一個 Method 就要在 public static *void* main 的外面 
       設計一個專做某樣動作既 Method 
       如果你在 main 中要使用 Method 
       就要好似 D 卡通咁，比卡乒 用 『十萬伏特』
       Main:
       十萬伏特();          =>呢個時候 Programme 就會睇 Method 咩係十萬伏特

       Main既*外面* 有一個 十萬伏特既 Method set好左
       public static void 十萬伏特(){
        System.out.println("Pika Pika");
       }

       咁佢 十萬伏特() 就會顯示 [ Pika Pika ]

       如果我地既行動有指向性，即係要利用 D 未知既 data
       我地就要係 十萬伏特() 既括號內加上一 D 你未知既數據 
       - 新增一個 variable
         (因為 Method中 既variable 係唔可以『直接』用返 Main中 既 variable)
         (記住係 no直接 only  唔係唔可以用)
       
       String 敵人 = "果然翁"
       十萬伏特(敵人);       => 敵人 括號內 即係 Method 中的 對手

       Main既外面 有一個 十萬伏特既 Method set好左
       public static void 十萬伏特(String 對手){
        System.out.println("比卡乒 ! 對 " + 對手 (即果然翁) + "用十萬伏特。");
       }

       咁佢就會出左 :  比卡乒 ! 對 果然翁 用十萬伏特。

       所以 if 括號內有東西 就代表我地既 Method 中需要用到個個 variable





       //Return Method     void 中使用 return 就會直接跳返出去
       如果我要佢用完 十萬伏特 後要講出 對手淨返幾多血
       - 我地係咪需要知道 對手而家有幾多血
       - 即係 我既 十萬伏特 Method 要利用 Main中 對手的血量
       - 所以呢個時候 我地就要用一個 Return Value 既 Method 去設計 Program
       
       Return Value 既文法就係
       平時 public static void 方法名( xxx if 你要用 Data in Method )
       return method 寫法係
       public static [data type] 方法名
       e.g. public static (String/ int / boolean / float / double / char...) 方法名( xxx if 你要用 Data in Method ) 
       如果我要整一個 Method 係 要睇 一個人夠唔夠歲 買酒飲
       - 夠唔夠歲 即係 夠 18 歲未啦
       - 如果佢夠 18歲 就係 True   唔夠就 False
       - 即係要整一個 Boolean 既 Method 而我地需要 條友既歲數
       所以： 

       public static boolean 成年 (int 歲數){
        if (歲數 >= 18){
          return true;    佢就會顯示 method 既答案為 true
        } else {
          return false;   少過 18 歲就會顯示 method 既答案為 true
        }
       }

       main中：
       if (  成年 (25)  ) {          //記住括號內有野
        System.out.println("總共 $12.8");
       } else {
        System.out.println("adsjfkjsab 求其啦")
       }
    */

  public static int[] products (int[] arr){
    for(int i=0;i<arr.length-1;i++){
      arr[i]=product(arr[i], arr[i+1]);
    }
    return arr;
  }


  public static int product(int a, int b){
    return a*b;
  }

  public static void walk(){
    System.out.println("HimJai is walking");
    System.out.println("行走中 ... ");
  }

  public static void 起身(){
    System.out.println("HimJai 睡醒了");
  }

  public static void 賴床(){
    System.out.println("HimJai 按停了鐘");
    System.out.println("但他又睡著了 ... ");
  }

  public static void sayHello(String 見到邊個){
    System.out.println("Hello, "+見到邊個+" 好耐冇見。最近肥左wor ~~");
  }

  public static int 比錢(int 原本有幾錢, int 用左幾多錢){
    int 荷包淨返幾多錢 = 原本有幾錢 - 用左幾多錢;
    return 荷包淨返幾多錢;
  }

  public static int 工作 (int 原本有幾錢, int 賺左幾多錢){
    int 荷包淨返幾多錢 = 原本有幾錢 + 賺左幾多錢;
    return 荷包淨返幾多錢;
  }

  public static boolean 查上下午 (int 幾點){
    if (幾點>=12 && 幾點<24){
      return true;
    } else {
      return false;
    }
  } 

  public static void main(String[] args){
    起身();
    //System.out.println("HimJai 睡醒了");

    賴床();
    //System.out.println("HimJai 按停了鐘");
    //System.out.println("但他又睡著了 ... ");

    walk();
    //System.out.println("HimJai is walking");
    //System.out.println("行走中 ... ");

    sayHello("Patrick"); //我要佢個 Method show 到 Patrick 個名
    //  sayHello(String 見到邊個)
    //  System.out.println("Hello, "+見到邊個+" 好耐冇見。最近肥左wor ~~");

    sayHello("Connie");
    //System.out.println("Hello, "+見到邊個+" 好耐冇見。最近肥左wor ~~");
    sayHello("Angus");
    //System.out.println("Hello, "+見到邊個+" 好耐冇見。最近肥左wor ~~");
    sayHello("Sunny");
    //System.out.println("Hello, "+見到邊個+" 好耐冇見。最近肥左wor ~~");


    System.out.println("HimJai 忘記現在該吃早餐還是午餐。");
    int 現在時間 =15;
    /* if (幾點>=12 && 幾點<24){
      return true;             <= 15點大過12  所以 查上下午(現在時間) 是 true Run if 1st statement
    } else {
      return false;
    }  */
    if (查上下午(現在時間)) {
      System.out.println("現在是下午");
    } else{
      System.out.println("現在是上午");
    }


    System.out.println("HimJai 是時候上班了.");
    int HimJai錢包 = 100;
    int 工作時薪 = 150;
    System.out.println("HimJai 有 $"+HimJai錢包);
    HimJai錢包 = 工作(HimJai錢包, 工作時薪);
    //int 荷包淨返幾多錢 = 原本有幾錢 + 賺左幾多錢;
    //return 荷包淨返幾多錢;
    System.out.println("工作一小時後，HimJai 有 $"+HimJai錢包);
    
    HimJai錢包 = 工作(HimJai錢包, 工作時薪);
    System.out.println("工作一小時後，HimJai 有 $"+HimJai錢包);
    //想做死我 就做多幾次野啦
    
    int 面包價錢 = 30;
    System.out.println("HimJai 想買面包...");
    HimJai錢包 = 比錢(HimJai錢包, 面包價錢);
    //int 荷包淨返幾多錢 = 原本有幾錢 - 用左幾多錢;
    //return 荷包淨返幾多錢;
    System.out.println("HimJai 買面包後，剩餘 $"+HimJai錢包);


    int[] nums = new int[]{1,2,6,3,6,7,8,5,4};
    
    System.out.println(Arrays.toString(products(nums)));
  }
}