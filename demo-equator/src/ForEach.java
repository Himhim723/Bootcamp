import java.util.Arrays;

public class ForEach {
  public static void main(String[] args) {
    //for each
    //differences of for each loop
    // 1. for-each loop do not have stop condition
    // 2. for-each 無辨法做到 (比較 / 數第幾個數據 / 數據交換)
    // 3. for-each 既做法通常係用黎做比較簡單既東西。。。

    int[] nums = new int[] {4,1,6,2,7,3,45};
    for (int sa:nums){              //For Each
      System.out.print(sa + "    ");
    }
    
    System.out.println();

    for (int i=0;i<nums.length;i++){   //For 
      System.out.println(nums[i]);
    }

    System.out.println();

    //char array
    char[] charArr = new char[] {'b','e','@','g','k'};
    for (char patrick: charArr){   //For Each
      System.out.print(patrick);
    }

    System.out.println();

    for(char i: charArr){
      System.out.println(i);
    }

    //String array
    int count=0;
    String[] name = new String[] {"Him", "Patrick","Connie","Sunny","Angus"};
    for(String s: name){
      System.out.println("No."+(count+1)+" "+s.toUpperCase());
      count++;
    }

    // Wrapper Class For each
    char[] charArray = new char[] {'c','e','@','y','l'};
    for (char c: charArray){   //Character / char 都可以放入 for each 
      System.out.println(c);   //如果 for each 入面將佢變 Wrapper Class 就可以在裡面用 Wrapper Class 既 Method
    }

    String hello = "I AM ;ishdf";
    String[] str = hello.split(";");

    System.out.println(Arrays.toString(str));







    String a = "Hello world ! I am Him";
    char[] b = a.toCharArray();
    String c = "";
    
    // Find the number of space bar
    int count1 =0;    //count1 is number of space bar
    for(int k=0;k<a.length();k++){
      if (a.charAt(k)==' '){
        count1++;
      }
    }  //found numbers of space bar
    // Add a String Array with the number of words
    String[] ans = new String[count1+1];

    // Adding the words into the String Array
    int place = 0;

    for(int i=0;i<a.length();i++){
      if (b[i]!=' '){
      c += b[i];           // c = ""; 
      } else if (b[i]==' ' && !(c.isEmpty())){
        ans[place] = c;     //   space bar wor    => 之前存落既文字放入 String Array
        place++;
        c = "";
      } 
      if (i==a.length()-1){
        ans[place] = c;
      }
    }
    
      System.out.println(Arrays.toString(ans));
    


    //Substring method
    String[] words = new String[count+1];
    char[] charArra = a.toCharArray();
    int index = 0;
    int start=0;
    for(int i=0;i<a.length();i++){
      if (charArra[i]==' '){
        words[index]=a.substring(start, i);
        start = i+1;
        index++;
      } else if(i==a.length()-1){
        words[index]=a.substring(start, a.length());
      }
    }
    
  }
}
