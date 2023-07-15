import java.util.Scanner;

public class Experiment {
  public static void main (String[] args){
    //幾時我既錢可以番到一倍
    Scanner res = new Scanner(System.in);
    int YearsLater=0;
    System.out.println("hi would you want to do some investment?");
    System.out.println("How many money do you have?");
    int 本金 = res.nextInt();
    System.out.println("How many money do you want to earn");
    int 目標金額 = res.nextInt();
    System.out.println("What is the predicted return rate of the investment");
    int rate = res.nextInt();
    float 回報率 = 1+(rate/100f);
    int 本金比較 =0;
    for (int i=1;i<=365;i++){   //我最多 365 日後會有幾錢，
      if (本金<=目標金額){
        本金比較 = 本金;
        本金*=回報率;
        YearsLater++;
        System.out.println(YearsLater+" 年後，即係 "+(2023+YearsLater)+"賺左 $"+(本金-本金比較)+" dollars.");
        System.out.println("you now have $"+本金);
        System.out.println();
      } else {
        break;
      }
    }
    //System.out.println("You use "+count+" days to earn "+((installment-10000)/10000*100)+"%");

    System.out.println();

    String str = "I love programming.";
    for (int i = 0; i < str.length();i++){
      if (str.charAt(i)=='e'){
        System.out.println("The first 'e' is in the "+i+"th place.");
        break;
      }
    }
    //
  }
}
