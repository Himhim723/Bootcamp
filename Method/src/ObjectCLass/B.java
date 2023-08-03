package ObjectCLass;

public class B extends A{
  private String str;
  public void setString(String str){
    this.str=str;
  }
  public String getString (){
    return this.str;
  }
  public void print(String anotherStr){
    System.out.println(this.str +" "+anotherStr);
  }
}
