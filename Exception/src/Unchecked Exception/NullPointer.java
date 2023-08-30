public class NullPointer {
  public static void main(String[] args) {
    String[] strings = new String[4];

    try{
      for(String s : strings){
        if(s.charAt(0)=='a'){
          System.out.println("First character is a");
        }
      }
    } catch (NullPointerException e){
      System.out.println("Null pointer exception");
    }

    

  }
}
