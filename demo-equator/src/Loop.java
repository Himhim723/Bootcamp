public class Loop {
  public static void main(String[] args){
    //Loop 循環
    //有兩種 1: For Loop   2: While Loop (do ... while/ while)
    //而家只會講 For Loop
    //問題：如果我要做 5 次 Hello, 你會點寫code
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");
    System.out.println("Hello");   //不停咁寫會好麻煩
    //所以我地會有For Loop既功能 （就係用黎做重覆性的工作）
    
    // for Loop 既功能
    for (int i=1;i<=5;i++){  
      System.out.println("Hello");
    }
    // 做For Loop既時候我地既文法係
    // for (set 新數字variable; run以下code既條件; run完1次後佢個variable會有咩變代) {...}
    


    // 練習由 1 數到 7         顯示: 1, 2, 3, 4, 5, 6, 7
    for (int k=1;k<=7;k++){    //當 k = 1   k = 2
      System.out.print(k);     //顯示   1   2   ...
    }                          //當離開loop cycle 
    System.out.println();      // 1234567
    System.out.println();      // these two line just for 睇起上黎整齊D

    //由 5 數到 7             顯示: 5, 6, 7
    for (int k=5;k<=7;k++){
      System.out.print(k);
    }
    System.out.println();
    System.out.println();

    //由 7 數到 1             顯示: 7, 6, 5, 4, 3, 2, 1
    for (int k=7;k>=1;k--){
      System.out.print(k);
    }
    System.out.println();
    System.out.println();

    //由 7 數到 5             顯示: 7, 6, ,5
    for (int k=7;k>=5;k--){
      System.out.print(k);
    }
    System.out.println();
    System.out.println();


    //將個名調轉
    String name = "Charles"; //7 letters
    //Skill 1: 要知有幾個字母，因為我地要由最後一個字母開始列返出黎

    //Skill 2: 所以 因有 7 個字母 係咪要由字母既 7 6 5 4 3 2 1 字母列出黎
    //         7 6 5 4 3 2 1  頭先我地已經試過由 7 開始例數到 1 
    //         所以 for ()內既野should be 一樣 都係由 7 到 1

    //Skill 3: 點樣可以列出文字既某個字母？
    //         Hints: 之前佢講過的 String Method/功能 (.xxxx 個 D)
    for (int a=6;a>=0;a--){
      System.out.print(name.charAt(a));  //charAt 顯示 第a個字母
    }
    System.out.println();
    

    // 今次我要佢以一個規律，列出 5, 8, 11, 14, 17, 20
    // 列出 10 個數字
    // Method 1: for ( ... )內講明做 10 次
    //           然後再係 Statement中表明每次加 3 
    //           因為 5 8 11 14 可睇到每個中間都係減 3 ok ?
    int num = 5;
    for (int q = 1;q<=10;q++){
      System.out.println(num += 3);
    }

    //Method 2: 直接 for ()內做晒所有野 之後直接 print 出黎
    for (int num0=5;num0<=35;num0+=3){ //呢個就係由一開始就列出數字
      System.out.println(num0);        // num0=5 print後 num0+=3 變 8 再 print x+=3 變 11
    }                                  // 但呢個方法係因為我知 10 次後數字 35 所以我 set 左35 做limit
                                       // 即係 num0<=35 呢句


    System.out.println();
    // 我要由 1 + 2 + 3 + 4 + 5 + ... 9 既總和
    int sum = 0;                
    //點解要set個sum 因為我當而家我每次將糖放入一個糖果箱
    //第一次放一粒 第二次放兩粒 第三次三粒
    for (int w=1;w<=9;w++){
      sum += w;             //而家sum就係個箱，w 就係第一次既 1粒 第二次既 2 粒...
    }
    System.out.println(sum); //最後我而家打開個箱睇佢裹面有幾多粒糖

    // continue skip 左以下既 Statement
    for (int aa=0;aa<5;aa++){
      System.out.println("Hello");
      if(aa == 3 ){
        continue;               // 雖說個 continue 係 inside if {...}
      }                         // 但會直接skip 埋以後的東西
      System.out.println("YAHOOOOOOOO");
    }

    //Nested Loop 超重點
    for (int i=1;i<=5;i++){
      for (int k=1;k<=i;k++){
        System.out.print("x");
      }
      System.out.println();
    }

    System.out.println();

    //
    for (int a=5;a>=1;a--){
      for (int b=1;b<=a;b++){
        System.out.print("x");
      }
      System.out.println();
    }


    String hello = "fndjnjdnjfnjdnjnjnjnjnjdfiennen";
    int count = 0;
    for (int l=0;l<=hello.length()-1;l++){
      if (hello.charAt(l)=='n'){
        count++;
      }
    }
    System.out.println(count);

/* 
    for (int o =1;o<=3;o++){
      System.out.print("o = "+o);
      for (int l=1;l<=4;l++){
        System.out.println ("l = "+l);
      }
      System.out.println();
    }
*/

    System.out.println();
    for (int i = 1; i<=5; i++){
			for (int k=1;k<=5;k++){
				System.out.print(i*k + "\t");
			}
			System.out.println();
		}
    System.out.println();

    int sum1 = 0;
    for (int a1=5;a1<=30;a1+=6){

    }
  String jj ="aj";
 for (int a2=1;a2<=4;a2++){
  jj="o";
  jj+="kkkkk";  // 1: aj + kkkkk  = ajkkkkk  2: ajkkkkk + kkkkk =ajkkkkkkkkkk
 }
System.out.println(jj);
  }
}