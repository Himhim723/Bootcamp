package DataStructure.Hash1;

public class Book {
  private String title;

  public Book(String title){
    this.title=title;
  }
  public String getTitle(){
    return this.title;
  }
  @Override
  public String toString(){
    return this.title;
  }
}
