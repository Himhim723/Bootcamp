//
// Given a 0-indexed string s, repeatedly perform the following operation any number of times:
//
// Choose an index i in the string, and let c be the character in position i.
// Delete the closest occurrence of c to the left of i (if any) and the closest occurrence of c to the right of i (if any).
// Your task is to minimize the length of s by performing the above operation any number of times.
//
// Return an integer denoting the length of the minimized string.
//
public class JavaQuest31 {
  public static void main(String[] args) {
    System.out.println(minStringLength("null"));// output : 3, delete l
    System.out.println(minStringLength("aaa"));// output : 1, delete a on left and right
    System.out.println(minStringLength("abcabcabc"));// output : 3, 
    System.out.println(minStringLength("bbccdd"));// output : 3, delete b, c, d
    System.out.println(minStringLength("helloworld"));// output : 7
  }

  public static int minStringLength(String s) {
    // code here
    int[] letters = new int[26];
    char[] word = s.toCharArray();
    for(int i=0;i<word.length;i++){
      if(letters[word[i]-'a']==1) continue;
      letters[word[i]-'a']++;
    }
    int count=0;
    for(int i=0;i<letters.length;i++){
      if(letters[i]==1) count++;
    }
    return count;
  }
}