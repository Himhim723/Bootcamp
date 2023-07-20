import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args){
    //BubbleSort
    int[] num = new int[]{5,3,7,1,2,0};
    for(int i=0;i<num.length;i++){
      for (int k=0;k<num.length-1;k++){
        if(num[k]>num[k+1]){
          int temp = num[k];
          num[k] = num[k+1];
          num[k+1]= temp;
        }
      }
    }
    System.out.println(Arrays.toString(num));

    //XXXSort
    int[] num2 = new int[] {3,5,70,2,1,5,62,3,32,6,2,67};
/* 
    for(int i=0;i<num2.length;i++){
      for (int k=i+1;k<num2.length;k++){
        if(num2[i]>num2[k]){
          int temp = num2[k];
          num2[k] = num2[i];
          num2[i] = temp;
        }
      }
    }
*/
    // Insertion Sort 
    for(int i=0;i<num2.length-1;i++){
      for(int k=i+1;k>0;k--){
        if(num2[k]<num2[k-1]){
          int temp = num2[k];
          num2[k] = num2[k-1];
          num2[k-1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(num2));
  }
}
