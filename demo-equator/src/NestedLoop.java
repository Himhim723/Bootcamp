public class NestedLoop {
  public static void main(String[] args){
    //What is a Nested Loop?
    //Nested Loop 就係在 一個 Loop Cycle中再加一個 Loop Cycle
    //即同時 Run 緊兩個 Loop Cycle
    //要清楚兩個 Loop Cycle 既執行次序 先可以睇明兩個 Loop Cycle 最後既 Output

    for (int i=1;i<=5;i++){     //1,2,3,4,5 (會執行 5次)
      for (int k=1;k<=3;k++){   //1,2,3     (會執行 3次)
          System.out.print(k);
      }
      System.out.println();
    }
    //當 Step 1: 第一行 i=1 => 第二行 k=1 => run Loop2既code print k(1)
    // 見到 Loop 2 的 " } " 符號 回到 Loop2 的 k++ (因為那 } 是屬於Loop 2 的)
    // 所以 run Loop 2 until Loop 2 finished  (Concept 1)
    //Step 2: 第五行 println 隔行 => 見行 6 既 } 所以回到它屬於的Loop 1 今次 i=2
    // 之後再行多次 Loop2 print kkk (123)

/*
    練習：
    試下整一個
    (橫要6 &直要3) 的長方形
    成個長方形都係要o組成
    即
    oooooo
    oooooo
    oooooo
*/
    for (int i = 1; i<=3; i++){
      for (int k=1;k<=6;k++){
         System.out.print("o");
      }
      System.out.println();
    }

/* 
   練習二：試下整一個
  (橫要2 &直要10) 的長方形
   成個長方形都係要數字組成
   即
   88
   88
   88
   88
   88
*/ 

    for (int i = 1; i<=10; i++){
      for (int k=1;k<=2;k++){
          System.out.print("8");
      }
    System.out.println();
    }

/* 
    練習三
    一樣 2 x 8長方形
    12
    12
    12
    12
    …….
*/   

for (int i = 1; i<=8; i++){
  for (int k=1;k<=2;k++){
    System.out.print(k);
  }
  System.out.println();
}


    String name = "I love programming. I love Java.";
    boolean found = false;
    for (int i=0;i<name.length();i++){
      if(name.charAt(i)=='y'){
        found = true; 
      }
    } if (found) {
      System.out.println("Found.");
    } else {
      System.out.println("y is not found.");
    }

    char target = 'o';
    int count=0;
    for (int i=0;i<name.length();i++){
      if (name.charAt(i)==target){
        count++;
      } 
    } 
    if (count>=3){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    
           
  }
}
