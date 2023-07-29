import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
    }
// public static String addBinary(String a, String b) {
//         int[] num1 = toIntArray(StringtoInt(a));
//         int[] num2 = toIntArray(StringtoInt(b));
//         System.out.println(Arrays.toString(num1));
//         System.out.println(Arrays.toString(num2));
//         int n1=num1.length-1;
//         int n2=num2.length-1;
//         int max = Math.max(num1.length,num2.length);
//         System.out.println("MAX = "+max);
//         int[] bin = new int[max];
        
//         while(n1>=0 || n2>=0 || max-1>=0){
//             if(StringtoInt(a)==1 && StringtoInt(b)==1) return"10";
//         if(StringtoInt(a)==0 && StringtoInt(b)==1) return"1";
//         if(StringtoInt(a)==1 && StringtoInt(b)==0) return"1";
//         if(StringtoInt(a)==0 && StringtoInt(b)==0) return"0";
         
//         int[] num1 = toIntArray(StringtoInt(a));
//         int[] num2 = toIntArray(StringtoInt(b));
//         int n1=num1.length-1;
//         int n2=num2.length-1;
//         int max = Math.max(num1.length,num2.length);
//         int[] bin = new int[max];
//         while(n1>=0 || n2>=0 || max-1>=0){
//             if(n1>=0&&n2>=0)
//             bin[max-1]+=num1[n1]+num2[n2];
//             if(n1>=0&&n2<0)
//             bin[max-1]+=num1[n1];
//             if(n1<0&&n2>=0)
//             bin[max-1]+=num2[n2];
//             if(max-1>=0) max--;
//             if(n1>=0) n1--;
//             if(n2>=0) n2--;
//         }

//         for(int i=bin.length-1;i>=1;i--){
//             if(bin[i]>=2){
//                 bin[i]-=2;
//                 bin[i-1]++;
//             }
//         }
        
//         if(bin[0]>=2){
//             bin = Arrays.copyOf(bin,bin.length+1);
//             for(int i=bin.length-1;i>=1;i--){
//                 bin[i]= bin[i-1];
//             }
//             bin[0]=1;
//             bin[1]=bin[1]-2;
//         }
//         }
        




    //     // int sum = toInt(num1)+toInt(num2);
    //     // int[] ans = toBinary(sum);
    //     int sum2 =0;
    //     int aa=bin.length-1;
    //     for(int i=0;i<bin.length;i++){
    //         sum2+=bin[i]*power10(aa);
    //         aa--;
    //     }
    //     String ko ="";
    //     ko+=sum2;
    //     return ko;
    // }
    // public static int StringtoInt(String a){
    //     char[] arr = a.toCharArray();
    //     int sum2=0;
    //     int aa=arr.length-1;
    //     for(int i=0;i<arr.length;i++){
    //         sum2+=(arr[i]-48)*power10(aa);
    //         aa--;
    //     }
    //     return sum2;
    // }


    // public static int[] toIntArray(int a){
    //     int digits=0;
    //     for(int i=a;i>=1;i/=10) digits++;
    //     int[] bin = new int[digits];
    //     int temp=a;
    //     for(int i=digits-1;i>=0;i--){
    //         bin[i]=temp%10;
    //         temp/=10;
    //     }
//         return bin;
//     }

//     public static int toInt(int[] a){
//         int index=0;
//         int sum=0;
//         for(int i=a.length-1;i>=0;i--){
//             sum+=a[i]*power2(index);
//             index++;
//         }
//         return sum;
//     }
//     public static int power2(int a){
//         if(a<=0) return 1;
//         int ans = 1;
//         for(int i=1;i<=a;i++){
//             ans*=2;
//         }
//         return ans;
//     }
//     public static int power10(int a){
//         if(a<=0) return 1;
//         int ans = 1;
//         for(int i=1;i<=a;i++){
//             ans*=10;
//         }
//         return ans;
//     }
//     public static int[] toBinary(int sum){
//         int digits=0;
//         for(int i=sum;i>=1;i/=2) digits++;
//         int[] binary = new int[digits];
//         for(int i=digits-1;i>=0;i--){
//             binary[i]=sum%2;
//             sum/=2;
//         }
//         return binary;
//     }
}