package DataStructure.Hash1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
  public static void main(String[] args) {
    //HashMap and HashSet 共通點
    // cannot change data 
    // Hash Map is a way for us to use kewords to represent the data
    // HashMap <KEY,VALUE> 用 Key 搵 values

    // HashMap .put() add into the hashMap
    // If duplicate Override the old data (Differences between set and map)
    // Same Override Equals and hashCode


    HashMap<String,Integer> words = new HashMap<>();
    String[] vocab = new String[]{"Hello","Hello","Apple","Banana","Hello","Hello","Apple","Banana"};
    for(String s : vocab){
      words.put(s,0);
    }
    System.out.println(words);

    Person Him = new Person("Him1","abbcd");
    Person Him2 = new Person("Him2","115231");
    Person Him3 = new Person("Him3","361123");

    // HashMap Funciton just like checking dictionary
    // Which word you would like to check
    // Then, pop out the description of the word
    // Examples are as followed
    HashMap<String,String> Dictionary = new HashMap<>();
    Dictionary.put("Coffee","It can help us wake quickly");
    Dictionary.put("Apple","It is a kind of fruit");

    System.out.println(Dictionary.get("Apple"));
    System.out.println(Dictionary.get("Coffee"));

    System.out.println(Dictionary); 

    for(String word: Dictionary.keySet()){
      System.out.println(word);
    }

    for(String desc: Dictionary.values()){
      System.out.println(desc);
    }
    for(Map.Entry<String,String> entry: Dictionary.entrySet()){
      System.out.println(entry.getKey()+"\t"+entry.getValue());
    }
    

    
    HashMap<String,String> login = new HashMap<>();
    //  <Username & password>
    login.put(Him.getUserNmae(), Him.getPassWord());
    login.put(Him2.getUserNmae(), Him2.getPassWord());
    login.put(Him3.getUserNmae(), Him3.getPassWord());

    System.out.println();
    int i=1;
    for(Map.Entry<String,String> entry : login.entrySet()){
      System.out.println("UserName"+(i++)+": "+entry.getKey()+"\t Password: "+entry.getValue());
    }
    System.out.println();



    HashMap<Author,Book> books = new HashMap<>();
    Author author1 = new Author("Him 1");
    Author author2 = new Author("Him 2");

    books.put(author1, new Book("Hello World"));
    books.put(author2, new Book("Cinderella"));

    System.out.println(books);



    HashMap<Author,ArrayList<Book>> bookshelf = new HashMap<>();
    Author Patrick = new Author("Patrick");
    Author Connie = new Author("Connie");

    bookshelf.put(Patrick, Patrick.getBook());
    bookshelf.put(Connie, Connie.getBook());

    Connie.writeNewBook(new Book("I am Big Eater"));
    Connie.writeNewBook(new Book("I love something BIG"));
    Connie.writeNewBook(new Book("I am LOST"));

    Patrick.writeNewBook(new Book("DAMN"));
    Patrick.writeNewBook(new Book("I AM LOST"));
    Patrick.writeNewBook(new Book("WHO AM I"));
    Patrick.writeNewBook(new Book("WHERE AM I"));  

    for(Author a:bookshelf.keySet()){
      System.out.println("Author :"+a+"\t Books: "+bookshelf.get(a)+" Num of Books: "+bookshelf.get(a).size());
    }


    // System.out.println("\nAll Books: ");
    // for(Map.Entry<Author,ArrayList<Book>> entry: bookshelf.entrySet()){
    //   System.out.println(entry.getKey()+"  \t"+entry.getValue());
    // }

    // for(Author author:bookshelf.keySet()){
    //   for(Book book:bookshelf.get(author)){
    //     System.out.println(book);
    //   }
    // }

    // System.out.println(bookshelf.get(new Author("Patrick")));

    //Hash Map && ArrayList combination is the most common
    //ArrayList && ArrayList combination is weird (Useless)

    //Queue
    //LS 

    


  }
}
