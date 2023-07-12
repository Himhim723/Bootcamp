//public class 既名一定要同file名一樣
public class datatype {
  // public static void main ... 係開始一個programme時必備一定要寫
  public static void main(String[] args) {
    // 要programme 顯示一D資料既magic word
    System.out.println("如果想顯示文字 要輸入 -(System.out.println( ... ))"); // 顯示文字必加 " " 同埋句尾必加 ;

    // variable type//
    // variable 即係電腦既memory 只要你set好左例如成年係18歲，以後你講成年就係18歲
    // 而呢種資訊可以分為文字同數字，所以我地會有唔同既variable/data
    /*
     * int 數字(整數) 最常用 String 文字/句子
     * byte 數字(整數) 極少用
     * short 數字(整數) 極少用
     * long 數字(整數) 超大數
     * float 幾位小數
     * double 極多位小數
     * char 字元 (單字母)
     * boolean 對/錯 先可不需理會
     */

    // 當我地想set data時候，我地要先講明我地會set咩類型既data,如下：
    int adultAge = 18; // 18歲就叫成年 (adultAge任你寫，你寫佢咩abc名都得)
    String myName = "李卓謙"; // 只有文字或者字母需要有符號 "" / ''
    float pie = 3.14f; // float 同 double 都係小數，但如果只需幾個小數位，就用float
    // 記得float 數字後要加 f
    double pie2 = 3.14161434;
    System.out.println("double pie2 圓周率 = " + pie2 +"//double 可顯示更多位的小數");
    // 點解有時會 int age; 再age = 18; 但呢度一句過?
    // 其實兩行咁寫同一行寫其實完全一樣

    // 點用返D data 出黎
    System.out.println("儲存一個數字資料到Programme中 int adultAge(可隨意改名) = " + adultAge);
    // 只要寫返輸出文字既magic word 再括弧內加返variable名就可
    System.out.println("Hello, I am " + myName + ". Nice to meet you!");
    // 因為已set好左 myName 所以佢唔好放係 " " 裹面，if 寫裹面佢會直接打出myName
    // 加號就係想輸出埋呢 D 資料，咁就用加號串連埋一齊顯示
    // 而家會試一下將幾個 data 一齊顯示出黎
    System.out.println("Hello, My name is " + myName + ". I am " + adultAge + " years old. I am an adult.");
    // 咁我就會有 hi 我係李卓謙我今年18歲係成年人, 所以我地可用加號將所有野串連一齊

    // 以下會係數字既運算方式
    System.out.println("8+5 = " + (8 + 5)); // +加 文字加數式 所以數式要加括號
    System.out.println("8-1 = " + (8 - 1)); // -減 文字加數式 所以數式要加括號
    System.out.println("8*5 = " + 8 * 5); // *乘
    System.out.println("8/2 = " + 8 / 2); // /除
    System.out.println("8除以3的餘數 = " + 8 % 3); // %餘數係咩，8除以3，餘數係2
    // 加減乘可混合使用，另外佢會跟先乘除後加減 & 同埋括號先後使用次序
    // 如果要用variable，就set完再括號內用加減乘除也可以
    int num1 = 12;
    int num2 = 4;
    int num3 = 7;
    System.out.println(num1 + num2 * 2 + (14 / num3));
    // 呢句就代表顯示 (12+ 4*2 + (14/7)) 既答案
    // 所以顯示 22 因為 12＋8＋2＝22
    // 試下計圓形面積 pie r2次
    int r = 5;
    // pie 上面set好左
    System.out.println("圓形的面積 = pie r2次 = " + (r * r * pie));

    // variable 既 setup 轉換
    int a = 1; // 呢一個moment a = 1
    a = 5; // 呢一個moment a = 5
    int b = 3;
    b = a; // 呢一個moment a = 5 , b = 5 因為佢將 a value copy到 b
    int c = 7;
    a = c; // 呢一個moment a = 7 , b = 5 因為佢將 c value copy到 a
    // 只要set 過一次variable 每次直接寫返個名就可以了，不用再寫 int/String ...

    String number = "324"; // 呢度324並唔係一個數字，因為data type係String 所以係文字
    int num4 = 10;
    // 如果兩個加埋會點
    // 係唔會變334 因為324係文字 10係數字
    System.out.println(num4 + number); // 顯示 10324
    // 調返轉 number+num4 一樣 會先係number 324 再寫 10 => 32410 yeahd

    // 比較特別既Operator (+= -= *= /=)
    int num5 = 10;
    num5 -= 1; // WHAT'S THAT？？？ 呢個符號代表佢會自己減1
    // num5 = num5 - 1
    // 頭先有講過 variable 由右到左，所以打完呢句後num5 既value就會由15跌落14
    num5 += 2; // 一樣, 頭先因上面既num5-=1, ，而家num5係14
    // 寫完num5+=2後，num5 就等於 num5 = 14+2
    // =16

    // 另一種特別的Operator (++/--)
    num5++; // 變左num5 + 1
    num5--; // 變左num5 - 1

    // String 裹面有功能可以幫我地拎到 個String裹面既某D data
    // 1. .length() => 用黎搵文字既長度
    String myFriend = "Timmy";
    System.out.println("myFriend 有多少個英文字母: " + myFriend + " 有 " + myFriend.length() + "個英文字母。");
    // 佢就會顯示 Timmy 有幾多個字母
    System.out.println(myFriend);
    // 顯示 Timmy

    // 2. .equals(另一個名) => 睇佢地一唔一樣
    String myFriend2 = "Timmy2";
    System.out.println("myFriend 與 myFriend2 是否一樣？ " + myFriend.equals(myFriend2)); // 對比兩個係咪一樣
    // 唔一樣 所以會顯示 False
    // 即係如果一份網上考卷，答案係 "Eat",我輸入左 "Damn"
    // Programme 就可以用 xxx.equals(答案) 睇下你個答案同佢最終答案一唔一樣答返 True/False

    // 混合使用
    String letters1 = "abcd";
    String letters2 = "efgh";
    System.out.println("letters1 與 letters2 是否一樣? " + letters1.equals(letters2)); // 由於兩個唔同字所以False
    // System.out.println(letters1.length().equals(letters2.length()));
    // letters1的長度 是否等於 letters2的長度
    // 上面呢句唔得因為 letters1.length() 己經變左做 int
    // .equals 只適用於 String, 所以如果想知兩個一唔一樣就用 ==
    System.out.println(letters1.length() == letters2.length()); // 顯示true
    // " == " 呢個符號係睇兩個一唔一樣, 咩type data都得

    // 3. .charAt(數字) 等幾個字母 'A'要大階啊 XD
    String letters = "abcdefghijklmnopqrstuvwxyz"; // A to Z
    System.out.println("letters 有 " + letters.length() + " 個英文字母。");
    System.out.println("letters 的第一個英文字母是 " + letters.charAt(0)); // 第一個字母係 0
    // 所以如果想要最後一個字母，就會.charAt(25),
    // 因為26個英文字，第一個係 0 數起，所以最後一個字母都跟住減1 係 25
    System.out.println("letters 的第一個英文字母是 " + letters.charAt(25));

    // .charAt 既混合使用
    String singer1 = "周杰倫";
    String singer2 = "周興哲";
    // System.out.println(singer1.charAt(0).equals(singer2.charAt(0)));
    // 都係唔得 因為charAt 係char .equals 只適用於String
    System.out.println(singer1.charAt(0) == singer2.charAt(0));
    System.out.println(singer1 == singer2);

  }
}