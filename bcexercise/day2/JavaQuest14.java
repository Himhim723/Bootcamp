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
    boolean res = Method2(13431); // true
    boolean res2 = Method2(-121); // false
    boolean res3 = Method2(1); // true
    boolean res4 = Method2(22); // true
    boolean res5 = Method2(1231); // false
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
    char[] OldNum = oldnum.toCharArray();
    char[] NewNum = new char[oldnum.length()];
    int index = 0;
    for(int i=OldNum.length-1;i>=0;i--){
      NewNum[index] = OldNum[i];
      index++; 
    }
    for(int i=0;i<OldNum.length;i++){
      if (OldNum[i]!=NewNum[i]){
        return false;
      }
    }
    return true;
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

}