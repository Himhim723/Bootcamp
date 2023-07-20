import java.util.Scanner;
import java.util.Random;

public class Game{
	public static void main(String[] args) {
    Scanner res = new Scanner(System.in);
    int bomb = new Random().nextInt(100)+1;
    int low =0;
    int high = 100;
    int ans;

    do{
    System.out.println("Please enter a number "+low+" to "+ high);   // 0 - 100
    ans = res.nextInt();    //your ans : 50    bomb : 90
    if (ans < bomb) {
      low = ans;
    } else if (ans > bomb){
      high = ans;
    }
    } while (ans!=bomb);

    System.out.println("You have been defeated");
  }
}	