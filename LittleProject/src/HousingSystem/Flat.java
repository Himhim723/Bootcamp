package HousingSystem;

public class Flat extends Block{
  private PropertyOwner owner;
  private String FlatNum;
  private int numOfRooms;
  private int inch;
  private int price;

  public Flat(){}
  public Flat(PropertyOwner p){
    this.owner = p;
  }
  public void setOwner(PropertyOwner owner){
    this.owner=owner;
    owner.getFlats().add(this);
  }
  public PropertyOwner getOwner(){
    return this.owner;
  }
  public void setFlatNum(int floor,int flat){
    StringBuilder sb = new StringBuilder();
    if(floor<10) {
      sb.append("0"+floor);
    } else {
      sb.append(floor);
    }
    if(flat<10) {
      sb.append("0"+flat);
    } else {
      sb.append(flat);
    }
    this.FlatNum=sb.toString();
  }
  public String getFlatNum(){
    return this.FlatNum;
  }
  public void setInch(int inch){
    this.inch=inch;
  }
  public int getInch(){
    return this.inch;
  }
  public void setNumOfRooms(int Rooms){
    this.numOfRooms = Rooms;
  }
  public int getNumOfRooms(){
    return this.numOfRooms;
  }
  public void setPrice(int price){
    this.price=price;
  }
  public int getPrice(){
    return this.price;
  }
  public double getInchPrice(){
    return this.price/this.inch;
  }
  public String toString(){
    return this.owner.toString();
  }
  







}
