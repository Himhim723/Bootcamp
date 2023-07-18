public class invoice {
  
  public static double 單項總結 (double 單項幾錢, int 數量){
    double 單項總共幾錢 = 單項幾錢*數量;
    return 單項總共幾錢;
  }
  

  //下面兩個 Method 其實做緊同一樣野
  public static double 總計 (double 暫時幾錢, double 每個單項總共幾錢){
    double 總共幾錢 = 暫時幾錢 + 每個單項總共幾錢; //每個單項總共幾錢既總和就係 Total
    return 總共幾錢;
  }

  public static double Arr總計 (double[] totalPricesItems){
      double sum=0;
      for (int i=0;i<totalPricesItems.length;i++){
        sum+=totalPricesItems[i];
      }
      return sum;
  }

  public static void main(String[] args) {
    int[] quantities = new int[] {5, 10, 4, 7, 20};
    double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 1000.3};
    String[] 咩黎 = new String[] {"Apple","Orange","Banana","Fish","Meat"};
    double[] totalPricesItems = new double [unitPrices.length];   //
    double sum = 0;
    for (int i=0;i<unitPrices.length;i++){
      totalPricesItems[i] = 單項總結(unitPrices[i],quantities[i]);
      System.out.println (咩黎[i]+"\t每項\t$"+ unitPrices[i]+"\t\t買左"+quantities[i]+"個  \ttotal $"+ totalPricesItems[i]);
    }
//    for (int i=0;i<totalPricesItems.length;i++){
//      sum = 總計(sum,totalPricesItems[i]);
//    }
    System.out.println("總共： $"+Arr總計(totalPricesItems));
  }

 public static void 十萬伏特(){
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      System.out.println("Pika Pika");
      
     }

}
