/*
 * Question : Given two strings s and goal, 
 * return true if and only if s can become goal after N shifts on s.

Definition of a shift:
Moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Assume the input need to be lowercase English letters.
*/

import java.util.Arrays;

public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    StringBuilder sb1 = new StringBuilder(s);
    for(int i=0;i<s.length();i++){
      sb1.insert(0,sb1.charAt(sb1.length()-1)).deleteCharAt(sb1.length()-1);
      if(sb1.toString().equals(goal)) return true;
    }
    return false;
  }
}