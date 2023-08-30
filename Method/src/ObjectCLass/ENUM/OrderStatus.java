package ObjectCLass.ENUM;

public enum OrderStatus {
  ORDERED(0),
  PAID(1),
  SHIPPED(2),
  COMPLETE(3);

  private int status;

  private OrderStatus(int status){
    this.status=status;
  }

  private boolean isForward(OrderStatus o){
    return this.status>o.status;
  }
  private int getStatusID(){
    return this.status;
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.PAID.isForward(COMPLETE));
  }
}
