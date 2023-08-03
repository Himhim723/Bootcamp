package Nike;

public class Product{
  private String name;
  private String sports;
  private double price;
  private double discount;
  private String describtion;

  public Product(){
    
  }

  @Override
  public String toString(){
    return this.name;
  }
  public void setName(String name){
    this.name=name;
  }
  public void setSports(String sports){
    this.sports=sports;
  }
  public void setPrice(double price){
    this.price=price;
  }
  public void setDiscount(double discount){
    this.discount=discount;
  }
  public void setDescribtion(String describtion){
    this.describtion=describtion;
  }
  public double getUnitPrice(){
    return this.price;
  }
  public String getName(){
    return this.name;
  }
  public String getSports(){
    return this.sports;
  }
  public double getDiscount(){
    return this.discount;
  }
  public String getDescribtion(){
    return this.describtion;
  }

  //Member Cart (e.g. Him.AddToCart(AirZoomFly6);) non-static
  



  // public void AddToCart(ArrayList<Product> products){
  //   super.getCart().addAll(products);
  // }


  //Non-Member Cart (e.g.Product.AddToCart(AirZoomFly6);) static
  // public static ArrayList<Product> AddToCart(Product products){
  //   ArrayList<Product> cart = new ArrayList<>();
  //   cart.add(products);
  //   return cart;
  // }

  // public static ArrayList<Product> AddToCart(ArrayList<Product> products){
  //   ArrayList<Product> cart = new ArrayList<>();
  //   cart.addAll(products);
  //   return cart;
  // }



}
