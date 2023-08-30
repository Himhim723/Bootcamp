import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collector;

public class Person {
  String name;

 public Person(String name){
  this.name = name;
 }

  public void swim() {
    System.out.println("Person is swimming");
  }

  public String toString(){
    return this.name;
  }
  public static void main(String[] args) {

    Swimable person1 = (String x) -> System.out.println(x+"p1 is swimming");
    Runable person3 = () -> System.out.println("p1 is running");
    person1.swim("Him ");
    person3.run();

    Swimable person2 = (String x) -> {
    System.out.println("p2 am swimming"+x);
    System.out.println("this is the second sentence"+x);
    };
    person2.swim("dfd");

    person2.swim("aerfa");

    Comparator<Person> sortByNameDesc = (Person p1,Person p2) ->{
      return p1.name.compareTo(p2.name);
    };

    ArrayList<Person> DamnIt = new ArrayList<>();
    DamnIt.add(new Person("sdfasfa"));
    DamnIt.add(new Person("adfasfa"));
    DamnIt.add(new Person("cdfasfa"));
    DamnIt.add(new Person("jdfasfa"));
    DamnIt.add(new Person("bdfasfa"));
    
    Collections.sort(DamnIt,sortByNameDesc);
    System.out.println(DamnIt);
    
    

        
        
  }

}
