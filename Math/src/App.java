import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Math.round(5.45));
        System.out.println(Math.round(5.55));
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.6));
        System.out.println(Math.log10(256)/Math.log10(2));

        int[] nums = new int[] {-100,100,90,50};
        int sum=0;
        for(int i =0;i<nums.length;i++){
            sum+=Math.abs(nums[i]);
        }
        System.out.println(sum);

        double sum2 =0;
        double[] prices = new double[] {1.6,-12.6,12.6,2.6};
        for(int i=0;i<prices.length;i++){
            sum2 +=Math.abs(Math.round(prices[i]));
        }
        System.out.println(sum2);

        double[] base = new double[] {1,2,3,4,5};
        double[] index = new double[] {1,2,3,4,5};
        double[] result = new double[base.length]; 
        for(int i=0;i<base.length;i++){
            result[i] = Math.pow(base[i], index[i]);
        }
        System.out.println(Arrays.toString(result));

        StringBuilder sb = new StringBuilder("Hello");
        String s =sb.toString();
        System.out.println(s);


        String a = "hello";
        String b = "hello";
        System.out.println(a==b);
        a+=" a";
        System.out.println(a==b);
        String c = a;
        System.out.println(a==c);

        //Person Him = new Person("Him", 33);
        System.out.println();
        System.out.println("hi");
    }
}
