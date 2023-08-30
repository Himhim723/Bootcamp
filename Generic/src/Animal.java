public class Animal extends Items {
  String name;

  public Animal(){}
  public Animal (String name){
    this.name= name;
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    this.name=name;
  }
  public String toString(){
    return this.name;
  }
}
