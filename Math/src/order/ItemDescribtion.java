package order;

import java.util.Arrays;

public class ItemDescribtion {
  private String header;

  private String body;

  public ItemDescribtion(String head, String body){
    this.header = head;
    this.body = body;
  }
  public void setHeader(String header){
    this.header = header;
  }

  public void setBody(String body){
    this.body = body;
  }

  public static void main(String[] args) {
    ItemDescribtion itemdesc = new ItemDescribtion("Item A","10% off just for today");
    Transaction t1 = new Transaction(001, itemdesc, 10, 10.5);
    ItemDescribtion itemdesc2 = new ItemDescribtion("Item B","10% off just for today");
    Transaction t2 = new Transaction(002, itemdesc2, 6, 3.2);
    Order order1 = new Order(new Transaction[]{t1,t2});
    System.out.println(Arrays.toString(order1.getSubTotal(new Transaction[]{t1,t2})));
    System.out.println(order1.getTotal());

    //t1 and t2 are object

  }
}
