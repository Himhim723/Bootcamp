package DataStructure.Nodessss;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Node {
  int val;
  Node next;

  public Node(){}
  public Node(int val){
    this.val = val;
  }
  public Node(int val, Node next){
    this.val = val;
    this.next = next;
  }

  public static void main(String[] args) {
     Node l1 = new Node(5, new Node(6, new Node(4)));
     Node l2 = new Node(2, new Node(4, new Node(3)));
     Node temp1 = new Node(l1.val, l1.next);
     Node temp2 = new Node(l2.val, l2.next);
     Node temp3 = new Node(0, new Node());
     int t1 =0;
     int t2 =0;

     while(temp1 != null && temp2 != null){
         t1 = temp1 == null? 0: temp1.val;
         t2 = temp2 == null? 0: temp2.val;
         System.out.println("t1 + t2 = "+ t1 +" + "+t2);
         temp3.val = t1 + t2;
         temp1 = temp1.next;
         temp2 = temp2.next;
         temp3.next = new Node();

     }


     while(temp3 != null){
         System.out.println(temp3.val);
         temp3 = temp3.next;
     }

     Integer[] nums1 = new Integer[]{3,2,5,1};
     int[] nums2 = new int[]{3,3,1,6,9};
    
     List<Integer> a = Arrays.asList(nums1);
     System.out.println(a);
    //  List<Integer> b = nums2.toList();
    //     a.retainAll(b);
    //     HashSet<Integer> d = new HashSet<>();
    //     for(int i: a)
    //     d.add(i);

    //     return d.toArray(new int[0]);
    HashSet<Integer> add = new HashSet<>();
    Integer[] ab = add.toArray(new Integer[0]);
        

  }
}
