
//Generic   <T>   Coplete Class
// Fufill Strong Type Rule 
// <T> inside < > we can put any class in the 

import java.util.ArrayList;

public class Printer<T> {
  T name;

  public Printer (T name){
    this.name=name;
  }

  public void print(){   //non static method    ==> Step 1 Create OBj Step 2 Obj.print()
    System.out.println(this.name);
  }

  public void setname(T name){
    this.name = name;
  }

  public T toname(){
    return this.name;
  }

  public static void main(String[] args) {
    Printer<String> strPrinter = new Printer<>("Him");
    Printer<Integer> intPrinter = new Printer<>(99);
    Printer<Character> charPrinter = new Printer<>('@');
    Printer<Food> AppPrinter = new Printer<>(new Food("sf"));
    Printer<Boolean> booPrinter = new Printer<>(true);
    Printer<ArrayList<String>> arrlistPrinter = new Printer<>(new ArrayList<>());

    System.out.println();
    arrlistPrinter.setname(null);
    System.out.println(strPrinter.toname());
    System.out.println(intPrinter.toname());
    System.out.println(charPrinter.toname());
    System.out.println(AppPrinter.toname().toString());
    System.out.println(booPrinter.toname());
    


    
  }
  
}
