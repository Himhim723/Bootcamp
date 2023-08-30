package EducationalCenter;

import java.time.LocalDate;
import java.util.HashMap;

import EducationalCenter.Product.Product;
import EducationalCenter.Product.Coach.Gender;

public class Customer {
  private String name;
  private int age;
  private Gender gender;
  private double capital;
  private LocalDate birth;
  private ShoppingCart cart = new ShoppingCart();
  private HashMap<Product,Integer> product = new HashMap<>();

  public Customer(String name, Gender gender, int bYear, int bMonth, int bDay){
    this.name = name;
    this.gender = gender;
    this.birth = LocalDate.of(bYear, bMonth, bMonth);
    if(LocalDate.now().getMonthValue()>birth.getMonthValue()){
      this.age =  LocalDate.now().getYear() - birth.getYear();
    } else {
      this.age = LocalDate.now().getYear() - birth.getYear() + 1;
    }
  }

  public void capitalTopUp(double value){
    this.capital += value;
  }

  public void addToCart(Product product){
    cart.addToCart(product);
  }
  public void addToCart(Product product, int quantity){
    for(int i=0;i<quantity;i++){
      cart.addToCart(product);
    }
  }

  public void checkBills(){
    if(cart.getTotalPrice()>capital)  
    System.out.println("You have no enough money to buy the items");
    else 
    capital -= cart.getTotalPrice();
    product.putAll(cart.checkBills());
  }

  
}
