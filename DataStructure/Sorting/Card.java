package DataStructure.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Card extends Paper implements Comparator<Card>{
  int number;

  public Card(){}
  public Card(int num){
    this.number= num;
  }
  public Card(int size, int num){
    this.number = num;
    this.size = size;
  }
  @Override
  public String toString(){
    return "Card Size "+super.size+" Card Number "+ this.number+"\n";
  }
  @Override
  public int compare(Card c1, Card c2){
    if (c1.size-c2.size>0) return -1;
    return c1.number - c2.number;
  }



  public static void main(String[] args) {
    ArrayList<Card> cards = new ArrayList<>();
    cards.add(new Card(22, 5));
    cards.add(new Card(10, 2));
    cards.add(new Card(10, 7));
    cards.add(new Card(9, 1));
    cards.add(new Card(15, 9));
    
    Collections.sort(cards, new Card());
    System.out.println(cards);

  }

  
}
