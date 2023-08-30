package Nike.Sale.Men.Clothe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class MHoodies extends MClothes {
  public MHoodies (String name,String sports,double price,double discount,String describtion){
    super.setName(name);
    super.setSports(sports);
    super.setPrice(price);
    super.setDiscount(discount);
    super.setDescribtion(describtion);
  }

  public void print(String choice){
    if(choice.equals("animal")) super.print();
    else System.out.println("Hey Yo");
  }


  public static void main(String[] args) {
    //   MHoodies m = new MHoodies("FD", "adfa", 15.34, 1234.23, "dfadsf");
    //   m.print("animal");
    //   HashSet<Integer> n = new HashSet<>();
    //   n.add(3);
    //   n.add(314);
    //   n.add(33);
    //   n.add(366);
    //   n.add(32457);
    //   n.contains(n);
    //   System.out.println(n);
    //   n.clear();
    //   for(int na: n ){
    //     System.out.println(na);
    //   }
      
    //   MHoodies.countGoodTriplets(new int[]{3,0,1,1,9,7},7,2,3);


    //   int[] nums1 = new int[]{1,5,3,2,5};
    //   int[] nums2 = new int[]{1,51,32,55,5};
      

    //     HashSet<Integer> n1 = new HashSet<>();
    //     HashSet<Integer> n2 = new HashSet<>();
    //     for(int i=0;i<nums1.length;i++){
    //         n1.add(nums1[i]);
    //     }
    //     for(int i=0;i<nums2.length;i++){
    //         n2.add(nums2[i]);
    //     }
    //     for(int i=0;i<n1.size();i++){
    //         if(n2.contains(n1)) n1.remove(i);
    //     }
    //     for(int i:n2){
    //         if(n1.contains(i)) n2.remove(i);
    //     }
    //     List<Integer> a1 = new LinkedList<>();
    //     List<Integer> a2 = new LinkedList<>();
        
    //     for(int i:nums1){
    //         if(n1.contains(i)) a1.add(i);
    //     }
    //     for(int i:nums2){
    //         if(n2.contains(i)) a2.add(i);
    //     }


        List<Integer> ans = new LinkedList<>();
        ans.add(1);
        ans.add(2);
        ans.add(44);
        System.out.println(ans);

        
        List<Integer> hello = new LinkedList<>();
        hello = ans;
        hello.add(7);
        System.out.println(ans);

        int[] a = new int[]{1,2,3,4,5};
        int[] b = a;
        int[] c = new int[]{9,8,7,6,5,4};
              b = c;
        c[0]=10000000;
        System.out.println(Arrays.toString(a));
        



    }
    
}
