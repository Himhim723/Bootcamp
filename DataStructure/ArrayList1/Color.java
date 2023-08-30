package DataStructure.ArrayList1;

public enum Color {
  RED(100),
  BLUE(200),
  YELLOW(500);

  private int score;

  private Color(int score){
    this.score=score;
  }
  public int getScore(){
    return this.score;
  }
  
}
