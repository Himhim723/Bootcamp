package DataStructure.Sorting;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Class {
  ArrayList<Student> students;

  public Class (Student... stu){
    students = new ArrayList<Student>();
    for(Student s : stu){
      students.add(s);
    }
  }

  public static void main(String[] args) {
    Student A = new Student("Lee Cheuk Him");
    Student B = new Student("Au Ying Ying");
    Student C = new Student("Chan Wing Chi");
    Student D = new Student("So wai tim");
    Student E = new Student("Wong Tsz Wa");
    

    Class S1A = new Class(A,B,C,D);
    Collections.sort(S1A.students);
    System.out.println(S1A.students);
  }
  
}
