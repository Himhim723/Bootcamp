public class Circle {
  public static double 圓形面積計法(double 圓形的半徑){
    double 圓形面積 = 圓形的半徑*圓形的半徑*3.14d;
    return 圓形面積;
  }

  public static double 圓形周界計法(double 圓形的半徑){
    double 圓形周界 = 2 * 3.14d*圓形的半徑;
    return 圓形周界;
  }

  public static void main(String[] args) {
    double No1圓形面積 = 圓形面積計法(5.0d);      //括號內的就是長方形的長和闊
    double No2圓形面積 = 圓形面積計法(13.0d);
    double No1圓形周界 = 圓形周界計法(5.0d);
    double No2圓形周界 = 圓形周界計法(15.0d);

  }
}
