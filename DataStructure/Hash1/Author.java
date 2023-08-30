package DataStructure.Hash1;

import java.util.ArrayList;
import java.util.Objects;

public class Author {
  private String name;
  private ArrayList<Book> book;

  public Author(String name){
    this.name=name;
    this.book=new ArrayList<Book>();
  }
  public String getAuthor(){
    return this.name;
  }

  public void writeNewBook(Book book){
    this.book.add(book);
  }

  public ArrayList<Book> getBook(){
    return this.book;
  }
  @Override
  public String toString(){
    return this.name;
  }
  @Override
  public boolean equals(Object o){
    if(o==this) return true;
    if(!(o instanceof Author)) return false;
    Author author = (Author) o;
    if(Objects.equals(this.name,author.name)) return true;
    return false;
  }
  @Override 
  public int hashCode(){
    return Objects.hash(this.name);
  }

}
