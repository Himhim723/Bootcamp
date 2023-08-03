/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    char[] vowel =new char[] {'a','e','i','o','u'};
    char[] arr = s.toLowerCase().toCharArray();
    int front=0;
    int back=0;
    for(int i=0;i<arr.length;i++){
      for(int k=0;k<vowel.length;k++){
        if(arr[i]==vowel[k]&&i<arr.length/2){
          front++;
        } else if(arr[i]==vowel[k]&&i>=arr.length/2){
          back++;
        }
      }
    }
    if(front==back) return true;
    return false;
    
  }
}