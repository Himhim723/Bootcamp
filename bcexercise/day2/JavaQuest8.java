/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    // code here
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240


    int max=0;
    int sec=0;
    for (int i=0;i<nums4.length;i++){
      if (nums4[i]>=max){
        sec = max;
        max = nums4[i];
      } else if (nums4[i]>sec){
        sec = nums4[i];
      }
    }
    System.out.println(sec);



    
    for (int i=0;i<nums4.length-1;i++){
      for (int k=i;k<nums4.length;k++){
        if(nums4[i]>nums4[k]){
          int sub = nums4[k];
          nums4[k] = nums4[i];
          nums4[i] = sub;
        }
      }
    }
    System.out.println(nums4[nums4.length-2]);



    
    // Your program should be able to handle all the above test case.

  }
 }