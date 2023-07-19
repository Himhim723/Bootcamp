import java.util.Random;

public class Randomm {
  
  public static char randomLetters(){
    int ab = new Random().nextInt(26);
    char letter = (char)(ab+65);
    return letter;
  }
  
  public static void main(String[] args) {
    //int num = new Random().nextInt(3);

    int letternum = new Random().nextInt(26);
    char letter = (char)(65+letternum);

    System.out.println(letter);
}
}
