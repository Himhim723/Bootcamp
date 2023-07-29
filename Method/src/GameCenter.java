import java.util.Random;
import java.util.Scanner;

public class GameCenter {

public void 開口中(){
    Scanner res = new Scanner(System.in);
    int ans,low,high,bomb;
    boolean Replay;
    do{    //遊戲數值初始化
    Replay = false;
    bomb = new Random().nextInt(100)+1;
    low =0;
    high = 100;
    do{    //遊戲規則
    System.out.println("Please enter a number "+low+" to "+ high);   // 0 - 100
    ans = res.nextInt();    //your ans : 50    bomb : 90
    if (ans < bomb && ans>low) {
      low = ans;
    } else if (ans > bomb && ans<high){
      high = ans;
    }
    } while (ans!=bomb);
    //遊戲完結並詢問是否重開
    System.out.println("You have been defeated");
    System.out.println("If you want to replay, type \"Replay\"");
    String replay = res.next();
    if(replay.toUpperCase().equals("REPLAY")){
      Replay = true;
    } 
  }while (Replay);
}

  public static void 計時炸彈(){
    Scanner res = new Scanner(System.in);
    String bomb="11";
    String ans="0";
    boolean die = false; 
    System.out.println("不完整的計時炸彈");
    System.out.println("遊戲規則：每人每次順次序說出 1 - 3 個數字，說中 "+bomb+" 的人輸。");
    do{
    System.out.println("目前的數字為 "+ans+" 請說出之後的 1 至 3 個數字。");
    ans = res.next();
    char[] arr = ans.toCharArray();
    for(int i=0;i<ans.length()-1;i++){
      if(arr[i]=='1'&&arr[i+1]=='1'){
        die = true;
      }
    } 
    }while(die==false);
    
      System.out.println("Bomb!!! You DEAD!");
  }


   public static void main(String[] args){
      Person.SelfIntroduction("him",3);
      Person Him = new Person();
      Him.personalInfo("Patrick", 2, 'r');
      Him.SelfIntroduction(Him.getName(), 6);
      
    
   }
  
}
