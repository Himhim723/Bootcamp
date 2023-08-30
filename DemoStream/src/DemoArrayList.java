import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoArrayList {
  
  public static void main(String[] args) {
    List<String> name = new ArrayList<>();
    name.add("Aec"); // 3
    name.add("deeref"); // 6
    name.add("ceede");  //5
    name.add("c"); //  1

    List<Character> length = name.stream().map(e -> e.charAt(0)).collect(Collectors.toList());
    System.out.println("test "+length);

    // for(String s: name){
    // System.out.println(s);
    // }
    // stream //print stlist address
    Stream<String> stlist = name.stream();
    // How to print data in Stream? USE ForEACH( LAMBDA )
    stlist.forEach(s -> {
      System.out.println(33 + " " + s);
    });
    System.out.println(stlist);
  

    // List<String> pp =
    // stlist.map(s->s.substring(0,2)).collect(Collectors.toList());

    List<Integer> num = name.stream()
        .map(s -> s.length()).collect(Collectors.toList());
    System.out.println(num);

    long aa = name.stream().map(e->{
      System.out.println("hello");
      return 'C';
    }).filter(e -> {  System.out.println("gello"); return e=='C';}).count();
    // List<Character> arr = new ArrayList<>();
    // arr = stlist.filter(s -> s.length()>=1).map( e ->
    // e.charAt(3)).collect(Collectors.toList());
    // arr.forEach(c -> System.out.println(c));

    // List<Integer> num = new ArrayList<>();
    // num.add(3);
    // num.add(33);
    // num.add(31);
    // num.add(316);

    // Stream<Integer> list = num.stream();

    // Stream seems like a list containing all data in the list
    // What is the function of Stream. How can it help us to complete task
    // Fuction 1: Filter -> Filter
    // What we need to know when we use filter
    // Step 1: Define what we want to remain in the list
    // How to do? MUST Use Lambda
    // stream().filter( str -> str.length==5; )

    // Function 2: map -> map(Lambda change the data to the data you need / can change to any type)

    // Function 3: sorted ->
    // sorted(Lambda (parameter1, parameter2) -> compare )

    // Funciton 3: collect-> collect(Collectors.toList()) change the type from
    // stream to List

    // Funciton 4: anyMatch(Lambda Conditions) -> is there any data match the
    // condition you mentioned in lambda

    //

    // // Stream method filtering
    // stlist.filter(s1 -> s1.startsWith("Abc")); //filter remain data suits the
    // condition
    // System.out.println(stlist.toString()); //print address
    // stlist.forEach(s -> System.out.println(s));

    // name.stream().filter(str -> str.length()>5).forEach(s ->
    // System.out.println("stream "+ s));

    // List<String> becomeList = name.stream().filter(str ->
    // str.length()==3).collect(Collectors.toList());

    // HashMap<String,Integer> product = new HashMap<>(); //HashMap is not available
    // for stream


    //interminate operations
    // filter(), map(), sorted(), anyMatch()

    //terminate operations
    // forEach(), collect()
    
    //Stream can only terminate once, but it may hava multiple intermidiate operator

    List<Integer> ascii = new ArrayList<>();
    for(int i=97;i<123;i++) ascii.add(i);
    System.out.println(ascii);
    List<Integer> letter = ascii.stream().
    map(e -> {
      return e;
    }).collect(Collectors.toList());
    System.out.println(letter);

    Stream.iterate(1, n-> n+2).limit(10).forEach(e -> System.out.println(e));
  }

}
