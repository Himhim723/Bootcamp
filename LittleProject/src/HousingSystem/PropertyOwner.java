package HousingSystem;

import java.util.ArrayList;
import java.util.List;

public class PropertyOwner extends Person {
  private List<Flat> Flats;


  public PropertyOwner(){}
  public PropertyOwner(String name){
    this.Flats = new ArrayList<Flat>();
    super.name=name;
  }
  public void buyFlat (Block block,String FlatNum){
    block.setFlat(this, FlatNum);
  }

  public List<Flat> getFlats(){
    return this.Flats;
  }
  public String toString(){
    return this.name;
  }
  
}
