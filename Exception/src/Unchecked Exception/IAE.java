public class IAE {
  public static int add(int a, int b){
    if(a<0 || b< 0) throw new IllegalArgumentException();
    return a+b;
  }
  public static void main(String[] args) {
    try{
      System.out.println(add(-1,2));
      System.out.println(add(1,4));
      System.out.println(add(-3,6));
    } catch (IllegalArgumentException e){
      System.out.println("Skip the process");
    }
  }
  
}
