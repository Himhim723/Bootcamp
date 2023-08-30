package HousingSystem;

import java.util.Arrays;

public class Block extends Estate{
  private String blockName;
  private Flat[][] building;
  private static int FlatSold;
  private int NumOfFloor;
  private int NumOfFlat;

  public Block(){
  }
  public Block(int NumOfFloor, int NumOfFlat){
    this.building = new Flat[NumOfFloor][NumOfFlat];
    for(int i=0;i<NumOfFloor;i++){
      for(int k=0;k<NumOfFlat;k++){
        this.building[i][k]= new Flat(new PropertyOwner());
        this.building[i][k].setFlatNum((i+1), (k+1));
      }
    }
    this.NumOfFlat=NumOfFlat;
    this.NumOfFloor=NumOfFloor;
  }
  
  public void setFlat(PropertyOwner owner,String FlatNum){
    int flatNum = Integer.valueOf(FlatNum)%100-1;
    int floor = Integer.valueOf(FlatNum)/100-1;
    this.building[floor][flatNum].setOwner(owner);
    FlatSold++;
  }
  public Flat getFlat(String FlatNum){
    int flatNum = Integer.valueOf(FlatNum)%100-1;
    int floor = Integer.valueOf(FlatNum)/100-1;
    return this.building[floor][flatNum];
  }
  public Flat getFlat(int FloorNum, int FlatNum){
    return this.building[FloorNum-1][FlatNum-1];
  }

  public void setBlockName(String blockName){
    this.blockName = blockName;
  }
  public void setNumOfFloor(int NumOfFloor){
    this.NumOfFloor=NumOfFloor;
  }
  public void setNumOfFlat(int NumOfFlat){
    this.NumOfFlat=NumOfFlat;
  }
  public String getBlockName(){
    return this.blockName;
  }
  public int getNumOfFloor(){
    return this.NumOfFloor;
  }
  public int getNumOfFlat(){
    return this.NumOfFlat;
  }
  public Flat[] getBuilding(int floor){
    return this.building[floor-1];
  }
  public Flat[][] getBuilding(){
    return this.building;
  }
  public int getFlatSold(){
    return FlatSold;
  }
  public int get單位數量(){
    return getNumOfFloor()*getNumOfFlat();
  }
  public double get入住率(){
    return (double)getFlatSold()/(double)get單位數量()*100;
  }
  public int get空置數量(){
    return get單位數量()-getFlatSold();
  }


public static void main(String[] args) {
  Block beauBlock = new Block(14,10);
  Person Him = new PropertyOwner(" [] ");
  Person Him2 = new PropertyOwner("llll");
  Person Connie = new PropertyOwner(" __ ");
  Person Patrick = new PropertyOwner(" -- ");
  Connie.buyFlat(beauBlock, "0101");
  Connie.buyFlat(beauBlock, "0102");
  Connie.buyFlat(beauBlock, "0103");
  Connie.buyFlat(beauBlock, "0201");
  Connie.buyFlat(beauBlock, "0208");
  Connie.buyFlat(beauBlock, "0106");
  Connie.buyFlat(beauBlock, "0107");
  Connie.buyFlat(beauBlock, "0108");
  Patrick.buyFlat(beauBlock, "0301");
  Patrick.buyFlat(beauBlock, "0308");
  Patrick.buyFlat(beauBlock, "0401");
  Patrick.buyFlat(beauBlock, "0408");
  Patrick.buyFlat(beauBlock, "0502");
  Patrick.buyFlat(beauBlock, "0507");
  Patrick.buyFlat(beauBlock, "0603");
  Patrick.buyFlat(beauBlock, "0604");
  Patrick.buyFlat(beauBlock, "0605");
  Patrick.buyFlat(beauBlock, "0606");
  Him.buyFlat(beauBlock, "0902");
  Him.buyFlat(beauBlock, "0903");
  Him.buyFlat(beauBlock, "0907");
  Him.buyFlat(beauBlock, "0908");
  Him.buyFlat(beauBlock, "1002");
  Him.buyFlat(beauBlock, "1003");
  Him.buyFlat(beauBlock, "1007");
  Him.buyFlat(beauBlock, "1008");
  Him2.buyFlat(beauBlock, "1301");
  Him2.buyFlat(beauBlock, "1302");
  Him2.buyFlat(beauBlock, "1303");
  Him2.buyFlat(beauBlock, "1304");
  Him2.buyFlat(beauBlock, "1305");
  Him2.buyFlat(beauBlock, "1306");
  Him2.buyFlat(beauBlock, "1307");
  Him2.buyFlat(beauBlock, "1308");
  Him2.buyFlat(beauBlock, "1401");
  Him2.buyFlat(beauBlock, "1402");
  Him2.buyFlat(beauBlock, "1403");
  Him2.buyFlat(beauBlock, "1404");
  Him2.buyFlat(beauBlock, "1405");
  Him2.buyFlat(beauBlock, "1406");
  Him2.buyFlat(beauBlock, "1407");
  Him2.buyFlat(beauBlock, "1408");
  
  //System.out.println(beauBlock.getFlat(Elevator.goToFloor(11),Elevator.goToFlat(1)).getOwner());
  // System.out.println(beauBlock.getFlat(11, 1));
  // System.out.println(beauBlock.getFlat(11, 2));

  System.out.println("\t\tAll Owner Of the Flat\n\n");
  for(int i=beauBlock.getBuilding().length-1;i>=0;i--){
  System.out.println("Floor"+(i+1)+"\t"+Arrays.toString(beauBlock.getBuilding(i+1)));
  }
  System.out.println(beauBlock.getFlatSold());
  System.out.println(beauBlock.get入住率());


  //Student and Exam

}

}
