import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {

    System.out.println(swap("Hello", 2, 4));
    Game("him");
    Game("Patrick");
    System.out.println(swap("HEllo I am L",1,0));
    if(swap("HELLO",2,1).equals("HLELO")){
      Game("Go");
    }
  }

  public static void Game(String fromMain){
    Scanner res = new Scanner(System.in);
    int bomb = new Random().nextInt(100)+1;
    int low =0;
    int high = 100;
    int ans;
    System.out.println("Hello "+ fromMain+ ".");
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

  public static String swap(String str, int idx1, int idx2){
    char[] arr = str.toCharArray();
    char temp = arr[idx1];
    arr[idx1]=arr[idx2];
    arr[idx2]= temp;
    return String.valueOf(arr);
  }
}
