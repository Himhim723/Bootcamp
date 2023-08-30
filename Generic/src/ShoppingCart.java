import java.util.ArrayList;

public class ShoppingCart<T extends Items> {

  private ArrayList<ShoppingCart> total;
  private ArrayList<T> product;

  public ShoppingCart(){
    this.total = new ArrayList<>();
    this.product = new ArrayList<>();

  }

  public void add(T product){
    this.product.add(product);
  }

  public ArrayList<T> getProduct(){
    return this.product;
  }

  //<T extends Xxx> can only apply on Static Method

  public static void main(String[] args) {
    ShoppingCart<Furniture> clothesCart = new ShoppingCart<>();
    ShoppingCart<Food> FoodCart = new ShoppingCart<>();
    ShoppingCart<Clothes> RiceCart = new ShoppingCart<>();
    ShoppingCart<Animal> AnimalCart = new ShoppingCart<>(); 
    ShoppingCart Cart1 = new ShoppingCart();
    Cart1.total.add(clothesCart);
    Cart1.total.add(FoodCart);
    Cart1.total.add(AnimalCart);
    AnimalCart.add(new Cat("MEOW"));
    System.out.println(Cart1.total.get(2));



  }


}
