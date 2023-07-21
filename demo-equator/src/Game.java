import java.util.Scanner;
import java.util.Random;

public class Game{
public static void 開口中(){
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
    low = 0;
    high = 100;
    System.out.println("If you want to replay, type \"Replay\"");
    String replay = res.next();
    if(replay.toUpperCase().equals("REPLAY")){
      Replay = true;
    } 
  }while (Replay);
}



	public static void main(String[] args) {
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
    low = 0;
    high = 100;
    System.out.println("If you want to replay, type \"Replay\"");
    String replay = res.next();
    if(replay.toUpperCase().equals("REPLAY")){
      Replay = true;
    } 
  }while (Replay);
}
}	