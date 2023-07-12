public class Conditionals {
  public static void main(String[] args){
    //if ... else if ... if
    int num1 = 10;
    
    //情境一 if (要求) { ... }
    if (num1 > 9) {
    //用 if 既時候 佢既要求要加返個括號比佢 (my要求)
    //當佢符合你既要求，就會叫佢去做野，而佢既工作就要加括號
      System.out.println("係啊！Brilliant 10 係真係大過 9");
    } 

    //情境二 if (要求) { ... } else if (要求) { }
    if (num1 < 10) {
    //用 if 既時候 佢既要求要加返個括號比佢 (my要求)
    //當佢符合你既要求，就會叫佢去做野，而佢既工作就要加括號
      System.out.println("係啊！Brilliant "+num1+" 係真係細過 10");
    } else if (num1>10) {
    //else if (要求) 如果符合要求，我就會run { ... }裹面既野
    //如果唔符合要求係唔會run { .. }裹面既野
      System.out.println("係啊！Brilliant "+num1+" 係真係大過 10");
    } else {
    //如果以上既要求都唔得 佢又冇再有要求 就唔理三七二十一run以下東東  
      System.out.println("You are real dum dum. 咁多次都錯，介紹個腦科醫生比你換下個腦啦！");
    }


    //Challenging questions
    //而家兩個數字 a = 34  b = 10
    //如果 a 大過 b，我要將 a 同 b 調轉
    int c = 2;
    int d = 10;
    if (c>d){
      int c備份 =c;   //因為冇得直接 c = d; d = c; 所以
      //Step1: 將 c 放到新的 variable叫 c備份 而家 c = 2; d = 10; c備份 = 2;
      //Step2: 將 d 放到 c  而家 c = 10; d = 10; c備份 = 2
      //Step3: 將岩岩 c備份 (原本 c 的 value)放到 d 
      c=d;
      d=c備份;
      System.out.println("It is in ascending order.");
    } else { //如果上面條件錯就run呢個啦
      System.out.println("It is in descending order.");
    }

    //check 數字係咪 單數/雙數
    //Step1: What is 單數 雙數
    //       單數：1，3，5，7，9，11 。。。
    //       雙數：2，4，6，8，10，12 。。。
    //Step2: 咁即係點 Define ?
    //       只要個數字除以 2 係可以整除就係 雙數
    //       只要個數字除以 2 餘數 = 1 就係 單數
    //Step3: 開始寫 code
    int yourAns = 234;  // 234係求其作既，你想check 咩數你就改左佢啦
    
    if (yourAns%2==0){
    //如果 yourAns除以2 等於 0
      System.out.println("It is an even number.");
      //顯示 這是雙數
    } else if (yourAns%2==1){
      System.out.println("It is an odd number.");
    } else {
     System.out.println("It is an odd number.");
    }

    //分數評級制度 寫法一
    //只要符合左要求就會開始 run 個個要求既 program
    //之後既 program 一略不理會直接跳出 呢抽 if 既 conditions
    int score = 89;
    if (score >= 90){
      System.out.println("Brilliant. You got a grade A!!!");
    } else if (score >80){
      System.out.println("You have got grade B.");
    } else if (score >60){
      System.out.println("You have got grade C.");
    } else if (score >=40){
      System.out.println("You have got grade D.");
    } else {
      System.out.println("You fail");
    }

    //分數評級制度 寫法二 (分別在於最後先寫輸出Grading)
    int score1 = 8;
    String grade = "";
    if (score1 >= 90){
      grade = "A";
    } else if (score1 >80){
      grade = "B";
    } else if (score1 >60){
      grade = "C";
    } else if (score1 >=40){
      grade = "D";
    } else {
      grade = "F";
    }
    System.out.println("You have got grade "+grade);


    //Boolean xxx = 要求係用黎一開始setting set好晒 Boolean
    //e.g. 學校入data 入學生資料
    //點解 gender 呢 D 咩都冇 因為等緊遲 D D學生電話入入學資料 .....
    String gender = "";
    String Form = "";
    int age = 0;

    boolean isMale = gender.equals("M") || gender.equals("Male");
    boolean isFemale = gender.equals("F");
    boolean isP1 = Form.equals("P1");
    boolean isP2 = Form.equals("P2");
    boolean isP3 = Form.equals("P3");
    boolean isP4 = Form.equals("P4");
    boolean isP5 = Form.equals("P5");
    boolean isP6 = Form.equals("P6");
    boolean AGrade = (age>=10);


    //男生超級馬拉松比賽 only 男生 同 只有 10 歲或以上學生能參加
    if (isMale && AGrade) {
      System.out.println("You are able to join the competition.");
    } else {
      System.out.println("You are not able to join the competition.");
    }

    // P1 大食王比賽 only P1 students can join the competition
    if (isP1) {
      System.out.println("Would you like to join P1大食王比賽?");
    }

    // 學校公佈 message 比 P4-P6學生 
    if (isP4||isP5||isP6){
      System.out.println("高年級發出通告");
    } 

    //switch功能
    switch (age) {
      case 6 : System.out.println("You are P1");
               break;
      case 7 : System.out.println("You are P2");
               break;
    }



  }
}
