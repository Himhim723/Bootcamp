public class Number {
  public static int callDigits (int num){
    int count=0;
    for(int i = num;i>=1;i/=10){  //數有幾個digit
        num/=10;
        count++;
    }
    return count;
  }

  public static int[] toIntArray(int num){
    int count = callDigits(num);

    int[] nums = new int[count];  //將佢放入int array掃描
    int digits = count;
    for(int i=num;i>=1;i/=10){
       nums[digits-1]=i%10;
       digits--;
    }
    return nums;
  }

  public static int toInteger(int[]nums){
    int count = nums.length;
    int index=0;                //將佢由 int Array 轉返 int
    int sum=0;
    for(int i=count-1;i>=0;i--){
      sum+=nums[index]*Power(i);
      index++;
    }
        return sum;
  }

  public static int Power(int k){       //10的次方
    int ans = 1;
    for(int i=1;i<=k;i++){
        ans*=10;
    }
    return ans;
  }

  
}
