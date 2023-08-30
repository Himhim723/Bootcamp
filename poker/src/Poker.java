package poker.src;

public class Poker {
  private static int turn;
  private static int numOfCards;
  
  public static boolean isGreaterThan(Card c1, Card c2){
    if(c1.getRank().compare(c2.getRank())>0 ) return true;
    else if (c1.getRank().compare(c2.getRank()) == 0 & c1.getSuit().compare(c2.getSuit())>0) return true;
    return false;
  }




  



}
