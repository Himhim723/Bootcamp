import java.util.Arrays;

public class Array3 {
  public static int sum (int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }
  
  public static int[] addone(int[] arr){  //arr is object references
    int[] res = new int[arr.length];
    res = arr;
    for(int i=0;i<arr.length;i++){
      arr[i]++;
    }
    return res;
    // for(int i=0;i<res.length;i++){
    //   res[i]++;
    // }
  }

  //==     data
  //equals reference

  public static void addtwo(int[] arr){
    for(int i=0;i<arr.length;i++){
      arr[i]++;
    }
  }

  public static void main(String[] args) {
    int[] nums = new int[] {3,4,8};
    System.out.println(Arrays.toString(nums));
    int[] target = addone(nums);
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(target));
    
    target[0]=100;
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(target));
    addtwo(nums);
    int[] target2 = nums;
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(target2));
  }
}
