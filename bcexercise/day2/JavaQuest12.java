import java.util.Arrays;

/**
 * Case 1: [2,7,11,15] Target: 9 Ans: [0, 1] or [1, 0]
 * 
 * Case 2: [3,2,4] Target: 6 Ans: [1, 2] or [2, 1]
 *
 * Case 3: [3, 3] Target: 7 Ans: [-1, -1]
 */
public class JavaQuest12 {
  // Given an array of integers nums and an integer target, return the index of
  // the two numbers such that they add up to target.

  // You may assume that each input would have exactly one solution OR no
  // solution, and you may not use the same element twice.

  // If no solution, return [-1, -1]

  // You can return the answer in any order.

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] answers = Sum(new int[] { 2, 7, 11, 15 }, 9); // {2, 7, 11, 15} is the dataset, 9 is the target to sum
    int[] answers2 = Sum(new int[] { 3, 2, 4 }, 6); // {3, 2, 4} is the dataset, 6 is the target to sum
    int[] answers3 = Sum(new int[] { 3, 3 }, 7); // {3, 3} is the dataset, 7 is the target to sum
    System.out.println(Arrays.toString(answers));
    System.out.println(Arrays.toString(answers2));
    System.out.println(Arrays.toString(answers3));
    System.out.println(Math.pow(2,5));


    int num=9696;
    int count=0;
    int sub = num;
    while (sub>=1){
         sub/=10;
        count++;
    }
    System.out.println(count);

        int[] nums = new int[count];
        int digits = count;
        int sum=0;
        for(int i=num;i>=1;i/=10){
            nums[digits-1]=i%10;
            digits--;
        }
        for(int i=0;i<count;i++){
            if(nums[i]==6){
                nums[i]=9;
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
        int index=0;
        for(int i=count-1;i>=0;i--){
          System.out.println(i);
          sum+=nums[index]*Math.pow(10,i);
          index++;
          System.out.println(sum);
        }


  }

  // Code a method here to return an array of two numbers that sum up to the
  // target

  public static int[] Sum(int[] num,int target){
    int[] arr = new int[] {-1,-1};
    for(int i=0;i<num.length;i++){
      for(int k=0;k<num.length;k++){
        if(i!=k&&num[i]+num[k]==target){
          arr[0]=i;  //set data
          arr[1]=k;
          return arr;
        }
      }
    }
    return arr;
  }


  public static int[] twoSum(int[] num,int target){
    int[] ans = new int[]{-1,-1}; 
    for (int i=0;i<num.length;i++){       // i  0 0 0   1 1    2
      for (int k=i+1;k<num.length;k++){   // k  1 2 3   2 3    3
        if(num[i]+num[k]==target){        // int array 中 4 個數可以 6對組合
          ans[0]=i;                       
          ans[1]=k;
          return ans;
        }
      }
    }
    return ans;
  }

}