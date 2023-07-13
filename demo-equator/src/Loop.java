public class Loop {
  public static void main(String[] args){
    //Loop 循環
    //有兩種 1: For Loop   2: While Loop (do ... while/ while)
    //問題：如果我要做 5 次 Hello, 你會點寫code
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    
    // for Loop 既功能
    for (int i=1;i<=5;i++){  
      System.out.println("Hello");
    }
    // 當 i = 1, 佢符合中間個條件，佢就會開始 Run 下面既 program
    // 所以佢 print 1次後 就會 i++ 變 2
    // 當 i = 2, 佢符合中間個條件，佢就會開始 Run 
    // 而始類推 run 到 i = 5 run 5 次

    // 練習由 1 數到 7     顯示: 1, 2, 3, 4, 5, 6, 7
    for (int k=1;k<=7;k++){
      System.out.print(k);
    }
    System.out.println();
    System.out.println();

    //由 5 數到 7     顯示: 5, 6, 7
    for (int k=5;k<=7;k++){
      System.out.print(k);
    }
    System.out.println();
    System.out.println();

    //由 7 數到 1     顯示: 7, 6, 5, 4, 3, 2, 1
    for (int k=7;k>=1;k--){
      System.out.print(k);
    }
    System.out.println();
    System.out.println();

    //由 7 數到 5     顯示: 7, 6, ,5
    for (int k=7;k>=5;k--){
      System.out.print(k);
    }
    System.out.println();
    System.out.println();


    //將個名調轉
    String name = "Charles"; //7 letters
    for (int a=6;a>=0;a--){
      System.out.print(name.charAt(a));  //charAt 顯示 第a個字母
    }
    System.out.println();
    

    // rules  +3
    int num = 5;
    for (int q = 1;q<=10;q++){
      System.out.println(num += 3);
    }

    System.out.println();
    // 我要由 1 2 3 4 5 + ... 9 既總和
    int sum = 0;
    for (int w=1;w<=9;w++){
      sum += w;
    }
    System.out.println(sum);


    // 1 + 3 + 5 + 7 + 9
    int sumOdd = 0;
    for (int m=1;m<=9;m+=2){
      sumOdd += m;
    }
    System.out.println(sumOdd);

    int sumOdd2 = 0;
    for (int m=1;m<=9;m++){
      if (m%2==1){
        sumOdd2 += m;
      }
    }
    System.out.println(sumOdd2);

    // continue skip 左以下既 Statement
    for (int aa=0;aa<5;aa++){
      System.out.println("Hello");
      if(aa == 3 ){
        continue;               // 雖說個 continue 係 inside if {...}
      }                         // 但會直接skip 埋以後的東西
      System.out.println("YAHOOOOOOOO");
    }

    /*for (int a1=0; a1<10;a1++){
      for (int a2=0;a2<10;a2++){
        if(a2==5){
          continue;
        }
        System.out.print(a1 * a2 +"     ");
      }
      System.out.println();
    }*/
System.out.println();
    for(int aad=1;aad<10;aad++){
      if(aad%2==0){
        System.out.println(aad+"Hello.");
      }
      if (aad%3==0){
        System.out.println(aad+"Hello");
        System.out.println(aad+"name");
      }
    }

System.out.println();
    for(int aad=1;aad<10;aad++){
      if(aad%2==0||aad%3==0){
        System.out.println(aad+"Hello.");
        if (aad%3==0){
          System.out.println(aad+"name");
        }
      }
    }

    System.out.println();


    for (int i=1;i<=5;i++){
      for (int k=1;k<=i;k++){
        System.out.print("x");
      }
      System.out.println();
    }

    System.out.println();

    for (int a=5;a>=1;a--){
      for (int b=1;b<=a;b++){
        System.out.print("x");
      }
      System.out.println();
    }

    








    for (int o =1;o<=3;o++){
      System.out.print("o = "+o);
      for (int l=1;l<=4;l++){
        System.out.println ("l = "+l);
      }
      System.out.println();
    }







  }
}
