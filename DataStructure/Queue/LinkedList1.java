package DataStructure.Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
  String str;
  LinkedList1 head;
  LinkedList1 next ; //[next 中有 String and another next]
  int id;
  static int count=0;

  public LinkedList1(){}
  public LinkedList1(String str){
    this.head = new LinkedList1();
    this.next = new LinkedList1();
    this.id=count++;
    this.str = str;
  }
  public String getString(){
    return this.str;
  }
  public void setnext(LinkedList1 next){
    this.next = next;
  }
  public LinkedList1 getnext(){
    return this.next;
  }

  public LinkedList1 getNthnext(){
    LinkedList1 l1 = this;
    for(int i=0;i<count-2;i++){
      l1=l1.getnext();
    }
    return l1;
  }
  
  public void add(LinkedList1 next){
    this.getNthnext().setnext(next);
  }

  public String get(int index){
    LinkedList1 l1 = this;
    for(int i=0;i<index;i++){
      l1 = l1.getnext();
    }
    return l1.getString();
  }
  
  public void addFirst(String str){
    LinkedList1 newlist = new LinkedList1(str);
    newlist.add(this);
  }
   //LinkedList1 newlist = new LinkedList1(str);
    // head = newlist;
    // head.add(this);
  

  public static void main(String[] args) {
    // LinkedList1 head = new LinkedList1("Hi1");      // 1 
    // System.out.println(head.get(0));
    // //System.out.println(head.getString());
    // head.add(new LinkedList1("2abc"));               // 2
    // System.out.println(head.get(1));
    // //System.out.println(head.getnext().getString());
    // head.add(new LinkedList1("3 is good"));               // 3
    // System.out.println(head.get(2));
    // //System.out.println(head.getnext().getnext().getString());
    // head.add(new LinkedList1("4 is bad"));
    // System.out.println(head.get(3));
    // //System.out.println(head.getnext().getnext().getnext().getString());
    // head.add(new LinkedList1("5"));
    // //System.out.println(head.getnext().getnext().getnext().getnext().getString());
    // head.add(new LinkedList1("6"));
    //head.addFirst("0");
    //System.out.println(ll.getnext().getnext().getnext().getnext().getnext().getString());
    // ll.setnext(new LinkedList1("2"));                                           //2
    // ll.getnext().setnext(new LinkedList1("3"));                                 //3
    // ll.getnext().getnext().setnext((new LinkedList1("4")));                     //4
    // ll.getnext().getnext().getnext().setnext((new LinkedList1("5")));           //5
    // ll.getnext().getnext().getnext().getnext().setnext((new LinkedList1("6"))); //6
    
    // System.out.println(ll.getString());
    // System.out.println(ll.getnext().getString());
    //System.out.println(ll.getnext().getnext().getString());

    // ll.add(new LinkedList1("4"));
    // System.out.println(ll.getnext().getnext().getnext().getString());

    LinkedList1 ll = new LinkedList1("1");
    ll.add(new LinkedList1("we"));
    ll.add(new LinkedList1("we2"));
    ll.add(new LinkedList1("we3"));
    //ll.addFirst("hello");
    

    System.out.println(ll.get(0));
    System.out.println(ll.get(1));

    //Collection
    LinkedList<String> s = new LinkedList<>();
    s.add("adsf");
    s.add("ad");
    s.add("adsf");
    s.add("adsf");
    s.add("ad");
    s.add("adsf");
    HashMap<String,Integer> hmap = new HashMap<>();
    for(String d : s){
      hmap.put(d,hmap.getOrDefault(d, 0)+1);
      System.out.println(hmap);
    }
    hmap.getOrDefault(hmap, null)
    
    

    
    
  }
}
