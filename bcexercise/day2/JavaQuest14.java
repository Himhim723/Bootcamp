public class JavaQuest14 {
  // Given an integer x, return true if x is a palindrome (迴文), and false otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or from right to left

  // Case 1: 13431
  // true

  // Case 2: -123
  // false

  // Case 3: 1
  // true

  // Case 4: 22
  // true

  // Case 5: 1231
  // false

  // Do not change anything in main method
  public static void main(String[] args) {
    boolean res = Method4(13431); // true
    boolean res2 = Method4(-121); // false
    boolean res3 = Method4(1); // true
    boolean res4 = Method4(22); // true
    boolean res5 = Method4(1231); // false

    System.out.println(res);
    System.out.println(res2);
    System.out.println(res3);
    System.out.println(res4);
    System.out.println(res5);

 


  }

  // Code a method here to return true if the integer is palindrome, otherwise false
  public static boolean palindrome(int num){
    String oldnum = "";
    oldnum += num;
    String a =Integer.toString(num);            // int 
    char[] OldNum = oldnum.toCharArray();
    char[] NewNum = new char[oldnum.length()];  // 用於整調轉既情況
    int index = 0;                           //因為唔可以用Nested Loop 所以就咁樣每次調轉一個後就 index++
                                             // 下一次就可以繼續入第二個 Data
    for(int i=OldNum.length-1;i>=0;i--){     //呢個 for loop 係用黎生產一個倒轉既 Array
      NewNum[index] = OldNum[i];
      index++; 
    }
    for(int i=0;i<OldNum.length;i++){        //如果調轉既Array 同 原本 Array 完全一樣 True
      if (OldNum[i]!=NewNum[i]){             //所以當我地一發現佢有唔岩既情況就即刻reurn false
        return false;
      }
    }
    return true;          //Run 晒之後仍存在既 就代表佢完全一樣 咁就 return true
  }

  public static boolean Method2 (int num){
    String oldnum = "";
    oldnum += num;
    for(int i=0;i<oldnum.length();i++){
      if(oldnum.charAt(i)!=oldnum.charAt(oldnum.length()-1-i)){
        return false;
      }
    }
    return true;
  }

  public static boolean Method3 (int num){ //1231
    int count = 0;
    for(int i=num;i>=10;i/=10){
      count++;
    }
    if (num<0){
      return false;
    }
    for(int i=0;i<=count/2;i++){
      if(num%10==num/Power(count)){   
        num-= 
        count-=2;
        num/=10;
      } 
      if(num%10!=num/Power(count)){
        return false;
      }
    }
    return true;
  }

  public static int Power(int indice){  
    int num=1;
    for (int i=1;i<=indice;i++){
      num*=10;
    }
    return num;
  }

  //Method 4
  public static boolean Method4 (int num){
    String oldnum = "";
    oldnum += num;
    for(int i=0;i<oldnum.length();i++){
      for(int k=oldnum.length()-1-i;k>=0;k--){
        if(oldnum.charAt(i)==oldnum.charAt(k)){
          break;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}