public class LogicalOperator {
  public static void main(String[] args){
    //BOOLEAN 即係分對錯
    boolean Correct = true;
    boolean Incorrect = false;

    //Logical Operator
    //Logical Operator 常見等號
    // 1: == (一樣) 2: != (不一樣) 3: && (and) 4: || (or)
    String myFavSinger = "周興哲";
    String yourFavSinger = "周杰倫";
    String myFavSingerGender="男";
    String yourFavSingerGender="男";

    System.out.println("問題一：周興哲同周杰倫是否一樣？");
    boolean Question1 = (myFavSinger == yourFavSinger);
    //                       周興哲   同   周杰倫   是否一樣 ？
    System.out.println(Question1);   // False 錯的

    System.out.println("問題二：周興哲同周杰倫是否不一樣？");
    boolean Question2 = (myFavSinger != yourFavSinger);
    //                       周興哲   同   周杰倫   是否[不]一樣 ？
    System.out.println(Question2);   // True 對的

    System.out.println("問題三：周興哲同周杰倫是否一樣？或者 兩人性別是否一樣？");
    boolean Question3 = (myFavSinger == yourFavSinger || myFavSingerGender==yourFavSingerGender);
    //                   周興哲 同 周杰倫 是否一樣       或者  兩人性別是否一樣
    //                   周興哲 同 周杰倫 不一樣唔緊要  兩人性別一樣就沒問題了
    System.out.println(Question3);   // True 因為雖兩人名稱並不一樣 但兩人性別一樣

    System.out.println("問題四：周興哲同周杰倫是否不一樣？及 兩人性別閃否亦不一樣？");
    boolean Question4 = (myFavSinger != yourFavSinger && myFavSingerGender!=yourFavSingerGender);
    //                   周興哲 同 周杰倫 是否不一樣       及  兩人性別是否不一樣
    //                   周興哲 同 周杰倫 的確不一樣     而  兩人性別亦都不一樣
    System.out.println(Question4);   // True

    
    //另外Logical Operator 亦都有數學符號，例如：
    // 1: >   2: <    3: >=   4: <=
    int a = 50;
    int b = 100;
    System.out.println("Math Q1: 50是否大於100?");
    boolean Math1 = (a>b);  //50是否大於100, False
    System.out.println(Math1); //False

    System.out.println("Math Q2: 50是否少於100?");
    boolean Math2 = (a<b);  //50是否少於100, 對的 True
    System.out.println(Math2); //True

    System.out.println("Math Q3: 50是否大於或等於50?");
    boolean Math3 = (a>=50);  //50是否大於或等於50, 對的 True
    System.out.println(Math3); //True

    System.out.println("Math Q4: 1000是否少於或等於100?");
    boolean Math4 = (1000<=b);  //1000是否少於或等於100, False
    System.out.println(Math4); //False

  }
}
