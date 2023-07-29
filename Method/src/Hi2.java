public class Hi2 {
  public static void main(String[] args) {
    Hi p1 = new Hi("ABC");
    Hi p2 = new Hi("BCD");
    p1.append(p2);
    System.out.println(p1.getPassword()+p2.getPassword());
  } 
}
