package order;
public class Transaction {
  private int itemNo;


  private ItemDescribtion itemDesc;


  private int quantity;


  private double unitPrice;


  public Transaction(int itemNo, ItemDescribtion IremDesc, int quantity, double unitPrice){
    this.itemNo = itemNo;
    this.itemDesc = itemDesc;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public ItemDescribtion getDesc(){
    return this.itemDesc;
  }

  public int getItemNo(){
    return this.itemNo;
  }

  public int getQuantity(){
    return this.quantity;
  }

  public double getUnitPrice(){
    return this.unitPrice;
  }

  public void setDesc(ItemDescribtion desc){
    this.itemDesc=desc;
  }

  public void setItemNo(int itemNo){
    this.itemNo=itemNo;
  }

  public void setQuantity(int quantity){
    this.quantity=quantity;
  }

  public void setUnitPrice(double unitprice){
    this.unitPrice=unitprice;
  }

  //subtotal method
  

}
