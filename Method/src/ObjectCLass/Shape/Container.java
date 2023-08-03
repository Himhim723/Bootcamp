package ObjectCLass.Shape;

public class Container {
  private double volume;



  public static void main(String[] args) {
    Object obj = new Container();

    //downcast (Run Time plymorphism)
    if(obj instanceof Container){ //false
      Cube c = (Cube) obj;
      System.out.println("dfdf");
    }

    if(obj instanceof Container){ //true
      Cube c = (Cube) obj;
      System.out.println("dfdf");
    }






  }
}
