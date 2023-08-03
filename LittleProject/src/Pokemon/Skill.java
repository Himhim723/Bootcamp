package Pokemon;

public class Skill {  //enum  fixed details  pp--
  private String name;
  private String Describtion;
  private int power;
  private int attribute;

  public Skill(String name){
    this.name=name;
  }

  public String getName(){
    return this.name;
  }


}
