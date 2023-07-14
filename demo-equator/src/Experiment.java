import java.util.Scanner;

public class Experiment {
  public static void main (String[] args){
    //幾時我既錢可以番到一倍
    Scanner res = new Scanner(System.in);
    int count=0;
    System.out.println("How many money do you have?");
    int installment = res.nextInt();
    System.out.println("How many money do you want to earn?");
    int earn = res.nextInt();
    System.out.println("How many % do you want to earn a day?");
    int rate = res.nextInt();
    float dayrate = 1+(rate/100);
    int original =0;
    for (int i=1;i<=365;i++){   //我最多 365 日後會有幾錢，
      if (installment<=earn){
        original = installment;
        installment*=dayrate;
        count++;
        System.out.println("In the "+count+" day, you gain $"+(installment-original)+" dollars.");
        System.out.println("You now have $"+ installment+" dollars.");
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
