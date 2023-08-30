package poker.src;

public enum Suit {
  DIAMOND(1,"♦️"),
  CLUB(2,"♣️"),
  HEART(3,"♥️"),
  SPADES(4,"♠️");
  

  int value;
  String strings;

  private Suit(int n, String s){
    this.value = n;
    this.strings = s;
  }

  public int compare(Suit s){
    return this.value - s.value;
  }

  public String toString(){
    return this.strings;
  }
  
}
