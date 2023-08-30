import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoOptional {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("ohn"));
    books.add(new Book("Anny"));
    books.add(new Book("Joy"));
    books.add(new Book("Same"));
    books.add(new Book("Jame"));
    books.add(new Book("Casiley"));
    
    Optional<Book> s = books.stream().filter(p -> p.author.startsWith("J")).max((e1,e2)->e2.author.length()-e1.author.length());

    Optional<Book> book2 = Optional.of(new Book("Anb"));
    System.out.println(book2);
    Optional<Book> book4 = Optional.ofNullable(null);
    System.out.println(book4);
    Optional<Book> book5 = Optional.ofNullable(new Book("1"));
    System.out.println(book5);
    Optional<Book> book6 = Optional.of(new Book("B"));
    System.out.println(book6);
    Book book7 = book4.orElse(new Book("Book doesn't exist"));
    System.out.println(book7);


    
  }
}
