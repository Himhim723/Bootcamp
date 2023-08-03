package Interface;
//before java8 no method instance
public interface Move {

  final int speed=33;

  //static constant
  static final int SPEED=10;
  

  //Java --> naming Conversion --> CamlCase
  //"noOfDays"


  //Behaviors
  void jump();
  //No method implementation 


  //after java8, week 6 lamda
  //instance method
  default void print(){ //implictly public
    System.out.println("After java8 i can use method in interface");
    
  }


  static String concat(String a, String b){//Move.concat()
    return a+b;
  }


  
}
