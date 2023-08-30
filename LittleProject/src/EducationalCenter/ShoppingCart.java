package EducationalCenter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import EducationalCenter.Product.Product;

public class ShoppingCart {
  private HashMap<Product,Integer> items;
  private double totalPrice;
  private double discount;
  private List<HashMap<Product,Integer>> history; 

  public ShoppingCart(){
    items = new HashMap<>();
    history = new ArrayList<>();
  }

  public void addToCart(Product product){
    items.put(product, items.getOrDefault(product, 1)+1);
  }
  private void setDiscount(double discount){
    this.discount = discount;
  }
  public double getTotalPrice(){
    for(Map.Entry<Product,Integer> product: items.entrySet()){
      totalPrice += product.getKey().getPrice() * product.getValue();
    }
    return totalPrice;
  }
  public HashMap<Product,Integer> checkBills(){
    history.add(items); //What did the customer buy save it as a record
    items = new HashMap<>();
    totalPrice = 0;     // initialize the shopping cart
    discount = 0;   
    return new HashMap<>(items);  // return the product customer has bought
  }








}
