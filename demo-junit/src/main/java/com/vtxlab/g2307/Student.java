package com.vtxlab.g2307;

import java.util.List;

import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
public class Student {
  private int age;
  @NonNull List<Subject> subjects;

  public Student(int age, List<Subject> subjects) {
    this.age = age;
    this.subjects = subjects;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public List<Subject> getSubjects() {
    return subjects;
  }
  public void setSubjects(List<Subject> subjects) {
    this.subjects = subjects;
  }
  @Override
  public String toString() {
    return "Student [age=" + age + ", subjects=" + subjects + "]";
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    if (age != other.age)
      return false;
    if (subjects == null) {
      if (other.subjects != null)
        return false;
    } else if (!subjects.equals(other.subjects))
      return false;
    return true;
  }
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + ((subjects == null) ? 0 : subjects.hashCode());
    return result;
  }
  


}
