package poker.src;

import java.util.ArrayList;
import java.util.Random;

public class Card {
  Rank rank;
  Suit suit;

  private Card(Rank rank, Suit suit){
    this.rank = rank;
    this.suit = suit;
  }

  public static Card of(Rank rank, Suit suit){
    return new Card(rank, suit);
  }

  public Rank getRank(){
    return this.rank;
  }
  public Suit getSuit(){
    return this.suit;
  }
  
  
  

  public String toString(){
    return "["+rank+suit+"]";
  }
  public static void main(String[] args) {
    Card n1a = Card.of(Rank.n1, Suit.DIAMOND);
    Card n1b = Card.of(Rank.n1, Suit.CLUB);
    Card n1c = Card.of(Rank.n1, Suit.HEART);
    Card n1d = Card.of(Rank.n1, Suit.SPADES);
    Card n2a = Card.of(Rank.n2, Suit.DIAMOND);
    Card n2b = Card.of(Rank.n2, Suit.CLUB);
    Card n2c = Card.of(Rank.n2, Suit.HEART);
    Card n2d = Card.of(Rank.n2, Suit.SPADES);
    Card n3a = Card.of(Rank.n3, Suit.DIAMOND);
    Card n3b = Card.of(Rank.n3, Suit.CLUB);
    Card n3c = Card.of(Rank.n3, Suit.HEART);
    Card n3d = Card.of(Rank.n3, Suit.SPADES);
    Card n4a = Card.of(Rank.n4, Suit.DIAMOND);
    Card n4b = Card.of(Rank.n4, Suit.CLUB);
    Card n4c = Card.of(Rank.n4, Suit.HEART);
    Card n4d = Card.of(Rank.n4, Suit.SPADES);
    Card n5a = Card.of(Rank.n5, Suit.DIAMOND);
    Card n5b = Card.of(Rank.n5, Suit.CLUB);
    Card n5c = Card.of(Rank.n5, Suit.HEART);
    Card n5d = Card.of(Rank.n5, Suit.SPADES);
    Card n6a = Card.of(Rank.n6, Suit.DIAMOND);
    Card n6b = Card.of(Rank.n6, Suit.CLUB);
    Card n6c = Card.of(Rank.n6, Suit.HEART);
    Card n6d = Card.of(Rank.n6, Suit.SPADES);
    Card n7a = Card.of(Rank.n7, Suit.DIAMOND);
    Card n7b = Card.of(Rank.n7, Suit.CLUB);
    Card n7c = Card.of(Rank.n7, Suit.HEART);
    Card n7d = Card.of(Rank.n7, Suit.SPADES);
    Card n8a = Card.of(Rank.n8, Suit.DIAMOND);
    Card n8b = Card.of(Rank.n8, Suit.CLUB);
    Card n8c = Card.of(Rank.n8, Suit.HEART);
    Card n8d = Card.of(Rank.n8, Suit.SPADES);
    Card n9a = Card.of(Rank.n9, Suit.DIAMOND);
    Card n9b = Card.of(Rank.n9, Suit.CLUB);
    Card n9c = Card.of(Rank.n9, Suit.HEART);
    Card n9d = Card.of(Rank.n9, Suit.SPADES);
    Card n10a = Card.of(Rank.n10, Suit.DIAMOND);
    Card n10b = Card.of(Rank.n10, Suit.CLUB);
    Card n10c = Card.of(Rank.n10, Suit.HEART);
    Card n10d = Card.of(Rank.n10, Suit.SPADES);
    Card Ja = Card.of(Rank.J, Suit.DIAMOND);
    Card Jb = Card.of(Rank.J, Suit.CLUB);
    Card Jc = Card.of(Rank.J, Suit.HEART);
    Card Jd = Card.of(Rank.J, Suit.SPADES);
    Card Qa = Card.of(Rank.Q, Suit.DIAMOND);
    Card Qb = Card.of(Rank.Q, Suit.CLUB);
    Card Qc = Card.of(Rank.Q, Suit.HEART);
    Card Qd = Card.of(Rank.Q, Suit.SPADES);
    Card Ka = Card.of(Rank.K, Suit.DIAMOND);
    Card Kb = Card.of(Rank.K, Suit.CLUB);
    Card Kc = Card.of(Rank.K, Suit.HEART);
    Card Kd = Card.of(Rank.K, Suit.SPADES);
    ArrayList<Card> cards = new ArrayList<>();
    cards.add(n1a);
    cards.add(n1b);
    cards.add(n1c);
    cards.add(n1d);
    cards.add(n2a);
    cards.add(n2b);
    cards.add(n2c);
    cards.add(n2d);
    cards.add(n3a);
    cards.add(n3b);
    cards.add(n3c);
    cards.add(n3d);
    cards.add(n4a);
    cards.add(n4b);
    cards.add(n4c);
    cards.add(n4d);
     cards.add(n5a);
    cards.add(n5b);
    cards.add(n5c);
    cards.add(n5d);
    cards.add(n6a);
    cards.add(n6b);
    cards.add(n6c);
    cards.add(n6d); 
     cards.add(n7a);
    cards.add(n7b);
    cards.add(n7c);
    cards.add(n7d);
    cards.add(n8a);
    cards.add(n8b);
    cards.add(n8c);
    cards.add(n8d);
    cards.add(n9a);
    cards.add(n9b);
    cards.add(n9c);
    cards.add(n9d);
    cards.add(n10a);
    cards.add(n10b);
    cards.add(n10c);
    cards.add(n10d);
    cards.add(Ja);
    cards.add(Jb);
    cards.add(Jc);
    cards.add(Jd);
    cards.add(Qa);
    cards.add(Qb);
    cards.add(Qc);
    cards.add(Qd);
    cards.add(Ka);
    cards.add(Kb);
    cards.add(Kc);
    cards.add(Kd);
    System.out.println();
    for(int i=1;i<=cards.size();i++){
      System.out.print(cards.get(i-1)+"  \t");
      if(i%4==0) System.out.println();
    }
    System.out.println();

    ArrayList<ArrayList<Card>> game = new ArrayList<>();
    ArrayList<Card> p1 = new ArrayList<>();
    ArrayList<Card> p2 = new ArrayList<>();
    ArrayList<Card> p3 = new ArrayList<>();
    ArrayList<Card> p4 = new ArrayList<>();
    game.add(p1);
    game.add(p2);
    game.add(p3);
    game.add(p4);
    

    Random ran = new Random();
    int p = 0;
    while(cards.size()>0){
      if(game.get(p).size()!=13){
        int a = ran.nextInt(cards.size());
        if(cards.get(a)!=null){
        game.get(p).add(cards.get(a));
        cards.remove(a);
        }
      } else {
        p++;
      }
    }

    System.out.println("Player 1" + p1);
    System.out.println("Player 2" + p2);
    System.out.println("Player 3" + p3);
    System.out.println("Player 4" + p4);
    

    


    
    


  }


}
