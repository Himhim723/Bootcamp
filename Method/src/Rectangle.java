public class Rectangle {
  public static double 長方形面積計法(double 長方形的長, double 長方形的闊){
    double 長方形面積 = 長方形的長*長方形的闊;
    return 長方形面積;
  }

  public static double 長方形周界計法(double 長方形的長, double 長方形的闊){
    double 長方形周界 = (長方形的長+長方形的闊)*2;
    return 長方形周界;
  }

  public static void main(String[] args) {
    double No1長方形面積 = 長方形面積計法(5.0d,3.0d);      //括號內的就是長方形的長和闊
    double No2長方形面積 = 長方形面積計法(13.0d,5.0d);
    double No1長方形周界 = 長方形周界計法(5.0d,3.0d);
    double No2長方形周界 = 長方形周界計法(15.0d,7.0d);

  }

}
