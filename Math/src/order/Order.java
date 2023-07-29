package order;
import java.util.Arrays;

public class Order {
  private Transaction[] transaction;

  public Order(Transaction[] transaction){
    this.transaction = Arrays.copyOf(transaction, transaction.length);
  }


  public double[] getSubTotal(Transaction[] transaction){
      double[] subtotal=new double[transaction.length];
      for(int i=0;i<transaction.length;i++){
      subtotal[i] = transaction[i].getQuantity()*transaction[i].getUnitPrice();
      }
      return subtotal;
    }

    //getTotal()  => sum up all subtotal
    public double getTotal(){
      double total=0;
      for(int i=0;i<this.transaction.length;i++){
      total += this.transaction[i].getQuantity()*this.transaction[i].getUnitPrice();
      }
      if(total>120) total*=0.8;  //100蚊以上 9 折
      return total;
    }

}
