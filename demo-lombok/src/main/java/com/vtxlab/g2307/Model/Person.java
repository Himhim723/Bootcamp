package com.vtxlab.g2307.Model;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.PriorityQueue;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Person {
  private String name;
  private int age;

  public Person (){}
  public Person(String name){
    this.name = name;
  }
  public Person(String name,int age){
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    Person person = new Person("John", 23);
    PriorityQueue<Integer> q = new PriorityQueue<>(3);
    q.add(3);
    q.add(6);
    q.add(9);
    q.add(61);
    System.out.println(q);
    Arrays.fill(new int[3],0,)
    



  }


}
