import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Person {
   private String name;
   private int age;
   private char gender;

   public Person(String name, int age, char gender){
    this.name= name;
    this.age = age;
    this.gender = gender;
   }

   public int getAge(){
    return this.age;
   }
   public String getName(){
    return this.name;
   }
   public char getGender(){
   return this.gender;
   }

   public static boolean hasElderly(List<Person> persons){
      Optional<Person> people = persons.stream().filter( p -> p.getAge() >60).findFirst();
      return people.isPresent();
   }


   public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("Connie",49,'F'));
    persons.add(new Person("Hi2",64,'M'));
    persons.add(new Person("Mary",14,'F'));
    persons.add(new Person("Daisy",42,'F'));
    persons.add(new Person("Hi4",43,'M'));
    persons.add(new Person("Cherry",44,'F'));

    List<Integer> ages = persons.stream().map(e -> e.getAge()).collect(Collectors.toList());
    System.out.println(ages);
    List<String> names = persons.stream().map(e -> e.getName()).collect(Collectors.toList());
    System.out.println(names);

    List<String> Female = persons.stream()
                                 .filter(e -> e.getAge()>=18 && e.getGender()=='F')
                                 .map(e-> "\tName = "+e.getName()+"\tAge = "+e.getAge()+"\n")
                                 .collect(Collectors.toList());
    System.out.println(Female);

      List<String> animal = Arrays.asList("ABCc","BCCd","KKKK");
      Map<String,Integer> map =animal.stream().collect(Collectors.toMap(str -> str , str -> str.length()));
      for(Map.Entry<String,Integer> a: map.entrySet()){
         System.out.println(a.getKey()+" "+a.getValue());
      }
      
    
   }
}
