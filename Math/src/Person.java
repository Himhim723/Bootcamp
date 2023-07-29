public class Person {
  //instance Variable / Membership Variable (public/private)
  String name;
  int age;
  int year;

  protected Person(String name,int age){
    
    this.age=age;
  }

  protected Person(String name,int age,int year){
    this.name = name;
    this.age = age;
    this.year=year;
  }


}
