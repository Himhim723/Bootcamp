package DataStructure.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortByColor implements Comparator<Ball> {

  @Override
  public int compare(Ball o1, Ball o2) {
    if(o1.color==Color.YELLOW) return -1; //sort by color
    return o2.id-o1.id;  // sort by color id big to small
  }

  public static void main(String[] args) {
    String a  = "hello";
    Ball ball13 = new Ball(13,Color.RED);
    Ball ball10 = new Ball(10,Color.RED);
    Ball ball3 = new Ball(3, Color.YELLOW);
    Ball ball36 = new Ball(36, Color.YELLOW);
    Ball ball72 = new Ball(72, Color.RED);


    System.out.println();
    ArrayList<Ball> ballList = new ArrayList<>();
    ballList.add(ball72);  // 
    ballList.add(ball13);  // 
    ballList.add(ball10);  // 
    ballList.add(ball36);  // 
    ballList.add(ball3);   // 

    //Collections.sort
    //Recursion

    Collections.sort(ballList);
    Collections.sort(ballList,new SortByColor());
    System.out.println(ballList);

    String Silly = "Silly";
    String Ada = "Ada";
    System.out.println(Ada.compareTo(Silly));

    System.out.println(Silly.substring(0,1));
    String s="  dfdf sdf sdf  ";
    s.trim().split(s);


    //Sliding Window Alogrithm
    // int[] num = new int[]{5,3,2,5,7,5,4,3,7,8,4,3,1};
    // int target = 15;
    // int total=0;
    // int k=3;
    // for(int i=0;i<k;i++){
    //   total+=num[i];
    // }
    // if(total==15) System.out.println("15 is found in 1st place");
    // for(int i=0;i<num.length-k;i++){
    //   total-=num[i];
    //   total+=num[i+k];
    //   System.out.println(total);
    //   if(total == target) System.out.println("target was found in "+i);
    // }

    int k =1;
    int[] nums = new int[]{0,4,0,3,2};
    System.out.println(Arrays.toString(nums));
    double subtotal = 0;
        for(int i=0;i<k;i++){
            subtotal+=nums[i];
        }
        double average = subtotal/k;
        
            for(int i=0;i<nums.length-k;i++){
                double temp = subtotal;
                temp -= nums[i];
                temp += nums[i+k];
                System.out.println("i = "+ i + " temp = "+ temp);
                if(temp>subtotal) { 
                   average = temp/k;
                }
                subtotal = temp;
            }
        

  }
}