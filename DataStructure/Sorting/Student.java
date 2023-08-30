package DataStructure.Sorting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparator<Student>  {
  String name;

  public Student(){}
  public Student (String name){
    this.name=name;
  }

  @Override
  public int compare(Student s2,Student s3) {
    return s3.name.compareTo(s2.name);
  }

  @Override
  public String toString(){
    return this.name;
  }
  public static void main(String[] args) {
    ArrayList<Student> stu = new ArrayList<>() ;
    stu.add(new Student("David"));
    stu.add(new Student("Apple"));
    stu.add(new Student("Cat"));
    Collections.sort(stu, new Student());
    System.out.println(stu);
    List<Integer> arr = new List();
    StringBuilder sb 
  }
  
}
