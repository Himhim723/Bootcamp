/*
 * 
 * Question : You are given an integer array nums. 
 * The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

public class JavaQuest26 {
  public static void main(String[] args) {
    System.out.println(sum(new int[] { 1, 2, 3, 2 })); // 4
    System.out.println(sum(new int[] { 1, 1, 1, 1, 1 }));// 0
    System.out.println(sum(new int[] { 1, 2, 3, 4, 5, 6 }));// 21
    System.out.println(sum(new int[] { 1 }));// 1
  }

  public static int sum(int[] nums) {
    // code here
    int deleted = 0;  //deleted 係一個用黎記錄曾經有人同佢既數一樣
                      //所以delete晒同樣既data後要delete埋自己
    for(int i=0;i<nums.length-1;i++){
      deleted=0;
      for(int k=i+1;k<nums.length;k++){
        if(nums[i]==0) break;
        if(nums[i]==nums[k]){
          deleted = 1;
          nums[k]=0;
        }
      }
      if(deleted==1) nums[i]=0;
    }
    int sum=0;
    for(int k:nums){
      sum+=k;
    }
    return sum;
  }

}
