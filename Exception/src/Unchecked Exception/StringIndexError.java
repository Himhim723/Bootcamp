
public class StringIndexError {
  public static void main(String[] args) {
    try{
      "ABC".charAt(10);
    } catch(StringIndexOutOfBoundsException e){
      System.out.println("StringIndexOutOfBoundException e");
    }
  }
}
