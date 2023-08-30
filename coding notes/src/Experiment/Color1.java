
public enum Color1 {
  RED(100),
  BLUE(200),
  YELLOW(500);

  int score;
  private Color1(int score){
    this.score=score;
  }
  public int getScore(){
    return this.score;
  }
}
