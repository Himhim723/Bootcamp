public class Dog extends Animal{
  
  public Dog(){}
  private Dog (String name){
    super(name);
  }
  public static Dog create(String name){
    return new Dog(name);
  }

}
