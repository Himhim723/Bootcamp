import java.util.Scanner;

public class Array {
  public static void main(String[] args) {
    // Array 係用黎儲存數據
    // 每一個數據都有一個儲存既地址 (唔明)
    // 一個 Array 每一次只可儲存一種數據:
    // String [] StudentName = {"Him", "Patrick", "Sunny", "Connie", "Angus"};
    // int[] StudentAge = {25, 27, 29, 18+, 25};
    // 咁而家我地就可以用返第幾個數據 match 返邊個幾歲
    // 兩組 Array
    // 第 0 個數據 : Him 25歲
    // 第 1 個數據 : Patrick 27歲
    // 第 2 個數據 : Sunny 29歲
    // 第 3 個數據 : Connie 18+歲
    // 第 4 個數據 : Angus 25歲
    // Array 既寫法係 Data Type 之後加 [] 代表有一組既 Data = {一 set Data}
    // int[] age = {1,2,3,4,5}; 要加 ;
    // String[] name = {"himJai", "Kim", "Iphone","Dumdum"}; 留意String既Value要 " "

    // Array Method
    // 1. Arrays.toString( Array名 ) 無論咩data type 都可 convert 做 String print 返出黎
    // - 將 Array 所有既 data print out 晒出黎
    // 2. String名.toCharArray()
    // - 將 String 既所有字母輸入到 char Array 既每一個 data
    Scanner res = new Scanner(System.in);
    boolean check = false;

    do {
      // 寫法一 先寫幾個 Data 再下面逐個寫返個 Value
      String[] name = new String[5];
      for (int i = 0; i < name.length; i++) {
        System.out.println("\nPlease Enter the name of Runner" + (i + 1));
        name[i] = res.next();
      }

      // 寫法二
      // double[] age = new double[] {25, 25, 18, 26, 11};
      double[] age = new double[5]; // 我地會有 3 個 data in this Array
      for (int i = 0; i < age.length; i++) {
        System.out.println("\nPlease Enter the age of Runner" + (i + 1));
        age[i] = res.nextDouble();
      }

      // name[1].length() //for 一個 String 有幾個字母
      // name.length //for Array 有幾個 data
      int phone[] = new int[5];
      for (int i = 0; i < phone.length; i++) {
        System.out.println("\nPlease Enter the contact of Runner" + (i + 1));
        phone[i] = res.nextInt();
      }

      double[] score = new double[5];
      score[0] = 94;
      score[1] = 95;
      score[2] = 97;
      score[3] = 98;
      score[4] = 99;

      System.out.println();
      System.out.println("\t      Week 2 Test Result");
      System.out.println();
      for (int i = 0; i < name.length; i++) {
        System.out.println(
            "name : " + name[i] + "\t age : " + age[i] + "\t phone: " + phone[i] + " (要抄牌 ? )\tscore: " + score[i]);
      }
      System.out.println();

      // Reverse Print
      System.out.println();
      System.out.println("\t      Please Confirm The Information is correct.");
      System.out.println();
      for (int i = 0; i < name.length; i++) {
        System.out.println("name : " + name[i] + "\t age : " + age[i] + "\t phone: " + phone[i] + " (要抄牌 ? )");
      }
      System.out.println();

      System.out.println("Are you sure your information is correct (True/False)?");
      String ans = res.next().toUpperCase();
      if (ans.equals("TRUE")) {
        check = true;
      }
    } while (check == false);

    System.out.println("\nThank you for your enrollment.");

    System.out.println();
    System.out.println("Welcome to the 1st Mathematics Examination.");
    System.out.println("Please type the correct answer in the space provided.");

    String[] CorrectAns = new String[] { "A", "B", "C", "A", "A", "C", "C", "B", "A", "D", "D", "D", "C", "B" }; // 14Q
    String[] Questions = new String[14];
    Questions[0] = "What is the answer of 1 + 1 \n A. 2\tB. 3\tC. 4\tD. -1";// A
    Questions[1] = "What is the answer of 1 + 2 \n A. 2\tB. 3\tC. 4\tD. -1";// B
    Questions[2] = "What is the answer of 1 + 3 \n A. 2\tB. 3\tC. 4\tD. -1";// C
    Questions[3] = "What is the answer of 1 + 4 \n A. 5\tB. 3\tC. 4\tD. -1";// A
    Questions[4] = "What is the answer of 1 + 25 \n A. 26\tB. 3\tC. 4\tD. -1";// A
    Questions[5] = "What is the answer of 1 + 21 \n A. 2\tB. 3\tC. 22\tD. -1";// C
    Questions[6] = "What is the answer of 1 * 2 \n A. 1\tB. 3\tC. 2\tD. -1";// C
    Questions[7] = "What is the answer of 2 * 2 \n A. 2\tB. 4\tC. 1\tD. -1";// B
    Questions[8] = "What is the answer of 3 + 2 \n A. 5\tB. 3\tC. 4\tD. -1";// A
    Questions[9] = "What is the answer of 5 + 2 \n A. 2\tB. 3\tC. 4\tD. 7";// D
    Questions[10] = "What is the answer of 5 * 2 \n A. 2\tB. 3\tC. 4\tD. 10";// d
    Questions[11] = "What is the answer of 3 * 2 \n A. 2\tB. 3\tC. 4\tD. 6";// d
    Questions[12] = "What is the answer of 21 + 2 \n A. 2\tB. 3\tC. 23\tD. -1";// c
    Questions[13] = "What is the answer of 54 + 2 \n A. 2\tB. 56\tC. 4\tD. -1";// b
    int FinalScore;
    String[] myAns = new String[14];
    boolean restart = true;

    do {
      FinalScore = 0;
      for (int i = 0; i < Questions.length; i++) {
        System.out.println(Questions[i]);
        System.out.print("Your Answer: ");
        myAns[i] = res.next().toUpperCase();
        System.out.println();
        if (myAns[i].equals(CorrectAns[i])) {
          FinalScore++;
        }
      }
      System.out.println("Please check your answer if it is correct.");
      for (int k = 0; k < myAns.length; k++) {
        System.out.print("Q" + (k + 1) + ": " + myAns[k] + "\t");
        if ((k + 1) % 4 == 0) {
          System.out.println();
        }
      }
      System.out.println("\n\nEnter [Submit] if you have checked your answers.");
      String confirm = res.next().toUpperCase();
      if (confirm.equals("SUBMIT")) {
        restart = false;
      }
    } while (restart);

    if (FinalScore >= 7) {
      System.out.println("\nCongraulations.You have passed the Examination");
    } else {
      System.out.println("Please study more. You failed the Examinations.");
    }
    System.out.println("You have got " + FinalScore + " score.");

  }
}
