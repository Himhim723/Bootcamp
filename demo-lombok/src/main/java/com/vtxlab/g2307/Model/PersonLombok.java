package com.vtxlab.g2307.Model;

import java.lang.annotation.Target;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

// @Data
// @EqualsAndHashCode (onlyExplicitlyIncluded = true)
// @AllArgsConstructor
// @NoArgsConstructor
// @ToString (onlyExplicitlyIncluded = true)
//@Builder
@SuperBuilder
public class PersonLombok extends Person{
  @ToString.Include private String name2;
  @EqualsAndHashCode.Include private int age2;
  private ArrayList<PersonLombok> book2;

public static void main(String[] args) {
  //@AllArgsConstructor
  PersonLombok person = PersonLombok.builder().age2(0).age(3).build();
  System.out.println(person.getAge());
  //@NoArgsConstructor
  // PersonLombok p2 = new PersonLombok();
  // //@Getter
  // p2.setAge(23);
  // p2.setName("Him");
  // //@Setter
  // p2.getAge();
  // p2.getName();
  // //@toString
  // System.out.println("Test = "+p2);
} 
}
