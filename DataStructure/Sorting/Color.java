package DataStructure.Sorting;

public enum Color {
  RED(1),YELLOW(2),BLUE(3),GREEN(4);

  int id;
  private Color(int id){
    this.id=id;
  }

  public int getId(){
    return this.id;
  }

}
