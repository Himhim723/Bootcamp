import java.util.Scanner;

public class Input {
  public static void main(String[] args){
    Scanner res = new Scanner (System.in);
    System.out.println("Hello what is your name?");
    String name = res.nextLine();
    System.out.println("What is your age?");
    int age = res.nextInt();
    System.out.println("Oh You are so old"+age);
    String hello = res.nextLine();
    System.out.println();
  }
}
