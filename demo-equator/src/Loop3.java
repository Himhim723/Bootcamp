public class Loop3 {
  public static void main(String [] args){
    System.out.println();
    for (int a=1;a<=6;a++){
      for (int b=1;b<=3;b++){
        if (a==b){
          break;     //break which loop
        }
        System.out.print("1");
      }
      System.out.println("2");
    }

    for (int i=0;i<6;i++){    //1 
      for (int j=0;j<=3;j++){  //2
        if (i==j){
          continue;
        }
        System.out.println("i = "+ i +"   j = "+ j);
      }
    }
    // 0 1 2 3  4  5   6   7  8 
    // 0 2 6 12 20 30 42  56 72 
    //Method 1
    int num =0;
    for (int i=1;i<=20;i++){
      System.out.println(num);
      num+=2*i;
    }





  }
}
