import java.util.Arrays;
public class N {
    public static void main(String[] args) {
      int[] arr = new int[] {1,3,5};
      int[] arr2 = new int[] {10,32,53,56,67,97};
      
      System.out.println(Arrays.toString(Connie(arr)));
      System.out.println(Arrays.toString(Connie(arr2)));

      for(int i=0;i<7;i++){
        if(i==3){    //When i == 3  // output hello yes then break stop looping
          continue;                    // if break, output: 0  ,  1,   2,   Hello  先後次序
        }
        System.out.println(i);    //  0  1   2   // if nested Loop if break in inner loop
      }   // According to Vincent, continue 後面 must have action

      for (int i=0;i<arr.length;i++){
        for(int k=0;k<arr.length;k++){
          if(k==1){
            continue;   // break 即係 直接解開inner Loop
          }
          System.out.println("i = "+i +"    k = "+ k); 
        }
      }


    } 

    public static int[] Connie(int[] arr){
      int[] num = new int[arr.length-1];
      int toSum = 0; 
      for (int i=0;i<arr.length-1;i++){
        for (int k=i;k<i+2;k++){
          toSum += arr[k];
          num[i] = toSum;
        }
        toSum = 0;
      }
      return num;
    }

}
