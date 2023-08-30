package poker.src;

public enum Rank {
  n1("A",14),
  n2("2",15),
  n3("3",3),
  n4("4",4),
  n5("5",5),
  n6("6",6),
  n7("7",7),
  n8("8",8),
  n9("9",9),
  n10("10",10),
  J("J",11),
  Q("Q",12),
  K("K",13);

  String cas;
  int num;

  private Rank(String k, int n){
    this.num = n;
    this.cas =k;
  }

  public int compare (Rank r){
    return this.num - r.num;
  }

  public int getNum(){
    return this.num;
  }
  
  public String toString(){
    return this.cas;
  }

}
