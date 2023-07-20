import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    //While 係一個 Loop 黎
    //For 都係一個
    //Do While Loop
    Scanner res = new Scanner(System.in);
    boolean 唔肯訓教 = false;
    
    do{
      System.out.println("啊仔夠鐘訓教啦 ~ ~ ");
      String ans1 = res.next();
      if (ans1.equals("Yes")||ans1.equals("Y")){
        唔肯訓教 = false;
      } else {
        唔肯訓教 = true;
      }
    } while(唔肯訓教==true);

    System.out.println("乖啦！Go to Sleep Immediately");




/* 
    int date = 1;
    while (date<=365){
      System.out.println("Today is day "+date);
      date++;
      if (date%7==0){
        System.out.println("Today is a Holiday. Yeah!!!");
      }
    }


    // 上班時間
    int time = 0;
    while (time<24){
      System.out.println("The time now is "+time+":00");
      
      if(time<=7){
      System.out.println("Zzz...");
      System.out.println();
      }

      if(time >= 9 && time < 17 ){
        System.out.println("It is an office hour.");
        System.out.println();
      }

      if (time == 17){
        System.out.println("Yeah 我放工啦。");
        System.out.println();
      }


      time++;
    }
*/
  }
}
