import java.util.Arrays;

public class Array4 {
  public static void main(String[] args) {
    int[] nums = new int[]{3,4,5};
    //int[] nums -> declaration 
    //new int[3] -> initialization
    System.out.println(nums);
    nums = Arrays.copyOf(nums, nums.length+2);
    System.out.println(nums);
    System.out.println(Arrays.toString(nums));
    int[][] num = new int[3][4];
    System.out.println(num.length);
    System.out.println(num[0].length);

    
    
    
  }
}
