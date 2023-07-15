import java.util.Scanner;

public class SingleLoop {
  public static void main(String[] args){
    //Single for Loop 其實有咩用？ 幾時用？ 點樣用？


    // Single Loop 功能一 ： 重覆性動作
    // 例如我要將 一句句子 Copy 5 次
    // for (int i=1;i<=5;i++) { ...print something... }
    // 可進行一些 [重覆動作] 或 [有規律的動作] 
    // for Statement 中重覆動作  e.g. print ("hello");
    // for Statement 中規律的動作  
    // e.g. outcome: 2, 4, 6, 8, 10
    // e.g. outcome: 5, 8, 11, 14, 17
    // e.g. outcome: 77, 70, 63, 56, 49
    // e.g. outcome: 2, 8, 32, 128, 512
    // e.g. outcome: 3, -6, 12, -24, 48, -96
    // e.g. outcome: 1, 2, 6, 24, 120, 720
    // e.g. outcome: 1, -2, 6, -24, 120, -720
    
    // Single Loop 功能二 ： Scanning Scan 一個 String 由頭到尾 Scan一次
    // 例如 我要知道 String 中的某些資訊
    // e.g. String str = "Hello, I am Him. It is a beautiful day, Would you want to go for a walk?";
    //      問題一： show 晒所有 e 出現在哪裡
    //      問題二： 用 for loop 由頭 scan 到尾 print out 返成句句子 一次
    //      問題三： 用 for loop 由尾 scan 到頭 倒轉print out 返成句句子 一次
    //      問題四： str 中 有沒有 p字 如果裹面沒有 就講 "你個仔唔係度啊" 如果有就講 你個 p 排第幾 
    //      問題五： str 中有幾多個 space bar
    //      問題六： str 中有幾多個 c 字
    //      問題七： show 第一個 n 字的位置
    //      問題八： show 最後一個 t 字的位置
    
    
    // 點 Scan？
    // 只要用 for (int i=0; i<str.length; i++){ ...do something... } 
    // 然後查      str.charAt(i)  就可以 scan 由 char(0) 記住 0 開始 到最後
    // 所以調返轉 如果要由尾掃返上前
    // 就打   for (int i=str.length()-1; i>=0; i--) { ... do something ... }
    // 如果唔太明白可以當 for (int i =  str.length()-1)  (起點 Start Scanning from where)
    //                          i >= 0; (由大到細所以 >= ) (Why 0? 因為有 charAt(0) 第一個字母))
    //                          i --) 

    // 點搵 String 中的某些資料
    // 呢 Part 就要熟 if (如果) 既用法 同 String 方法 (.length() / .charAt())
    // 如果要 數某字母既出場次數 => 就要用到 int count (開多個 variable 來 mark 數)
    // 1. 搵 一個字母 出現左係邊
    //    請翻譯以下句子   
    //    如果 句子中有個個字母 就 Print 佢係邊比我睇
    //    你要好清楚自己做緊咩 你而家要搵咩 搵到又要做 D 咩 <= 呢度就係成個架構
    //    另外 你亦都要好清楚 咩叫做 搵到個字母 which is if ( ... ) 中的條件
    //    你唔知咩叫 搵到 你就打唔到括號內的東東
    //    if (str.charAt(i) == '咩字母') {
    //    System.out.println("個字母排第 " + i);   // i 代表緊個字母既排位
    // }

    // 2. 搵字母出現左幾多次
    //    呢個時候就係開一個新 int count = 0; 既時候 
    //   （因為 i 唔會幫你計佢出現過幾次 只會由頭Scan 到尾）
    //    同上打左 if Condition 咩叫搵到後 ， 我地要做咩 就有少少唔同啦
    //    今次既工作 同我講(print) 佢出現左幾多次(count)
    //    咁係咪即係每次有一樣都要 count 1 次
    //    That's Why 我地會做   count++;   (代表搵到 1 次)
    
      Scanner res= new Scanner(System.in);
      int target = 89;
      int low = 0;
      int high = 100;
      for (int i = 0; i<=100;i++){
        System.out.println("Please Enter number between "+low+" and "+high);
        int ans = res.nextInt();
        if (ans == target){
          System.out.println("You DEAD. You have hit the bomb.");
          break;
        } else if (ans > target) {
          high = ans;
        } else {
          low = ans;
        }
      }
      

  }
  
}
