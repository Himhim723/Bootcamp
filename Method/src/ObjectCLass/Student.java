package ObjectCLass;

public class Student extends Adult {
  //ABSTRACT CLASS Purpose is to be extended to another class

  //If there is an abstract method this Must be implemented
  public Student(){
    
  }
  // public Student(int age, double weight){
  //   super(age,weight);
  // }
  public void read(){
    System.out.println("I am reading.");
  }
  public void sleep(){
    System.out.println("I am sleeping");
  }

  public static void main(String[] args) {
    Student stu1 = new Student();
    stu1.sleep(); //abstract sleep in Person
    stu1.read();  //abstract read in Adult
    stu1.eat();   //instance method in Person
    stu1.run();   //instance method in Adult
    System.out.println(stu1.getAge());
  }
  
}
