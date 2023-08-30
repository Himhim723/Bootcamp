package Nike;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import Nike.Sale.Men.Clothe.MClothes;
import Nike.Sale.Men.Clothe.MHoodies;
import Nike.Sale.Men.Clothe.MShorts;
import Nike.Sale.Men.Clothe.MTShirts;
import Nike.Sale.Men.Clothe.MTrousers;
import Nike.Sale.Men.Shoe.MShoes;

public class ShoppingCart<T extends Product>{
  private ArrayList<Product> Cartproduct;
  private double Total;

  public ShoppingCart(){
    this.Cartproduct = new ArrayList<>();
  }
  
  public ArrayList<Product> getCartProduct(){
    return this.Cartproduct;
  }

  public void AddToCart(Product product,int quantity){
    for(int i=0;i<quantity;i++){
      this.Cartproduct.add(product);
    }
  }

  public void AddAlltoCart(Product... products){
    for(Product product:products){   //For Each Loop   every 
      this.Cartproduct.add(product); //ArrayList .add();
    }
  }

  public double getTotal(){
    for(Product p: this.Cartproduct){
      this.Total+=p.getUnitPrice()*(1-p.getDiscount());
    }
    return this.Total;
  }

  public double MemberDiscount(){
    this.Total*=0.9;
    return this.Total;
  }

public static void main(String[] args) {
  Product ZoomFly5 = new MShoes("ZoomFly5","Running",999.0d,0.1d,"It is a running shoes");
  Product NikeACG  = new MTShirts("NikeACG", "T-Shirt", 299.0d, 0.0d, "Easy to wear");
  Product NikeClubFleece = new MHoodies("NIKE CLUB FLEECE", "男子套頭足球連帽衫", 449.0d, 0.0d, "Nike Club Fleece 男子套頭足球連帽衫適合球迷在球場等不同地方穿著。 外層觸感柔軟，內層具有紋理，提供輕盈舒適效能。");
  Product NikeYogaDriFit = new MShorts("NIKE YOGA DRI-FIT", "男子紋理瑜伽短褲", 349.0d, 0.0d, "穿上導濕速乾的 Nike Yoga Dri-FIT 男子紋理瑜伽短褲，隨心伸展，感受身體流暢律動。 紋理外層和順滑內層融合得恰到好處，助你找回與外界的聯繫。");
  Product NikeACG_T = new MTrousers("Nike ACG_T", "男子越野長褲", 799.0d, 0.0d, "Nike ACG 男子越野長褲隨時準備迎接戶外冒險的挑戰。隔水塗層加上強韌的耐穿設計，讓你輕鬆征服濕滑、崎嶇的地段。此產品含有再生聚酯纖維。");
 
  Member Him = new Member();
  System.out.println(Him.CheckProduct(NikeACG_T));
  System.out.println(Him.CheckProduct(ZoomFly5));
  System.out.println(Him.CheckProduct(NikeClubFleece));
  System.out.println(Him.CheckProduct(NikeACG));
  System.out.println(Him.CheckProduct(NikeYogaDriFit));
  //Him.setCart();
  Him.getCart().AddToCart(ZoomFly5,1);
  Him.getCart().AddToCart(NikeACG,3);
  Him.getCart().AddAlltoCart(NikeACG_T,NikeACG,ZoomFly5);
  System.out.println(Him.getCart().getCartProduct());
  System.out.println(Him.getCart().getTotal());


  Him.setName("Him Lee");
  Member Patrick = new Member("Patrick");
  Patrick.getCart().AddAlltoCart(NikeACG_T,NikeACG,ZoomFly5,NikeACG_T,NikeACG,ZoomFly5);
  Member Connie = new Member("Connie Li");
  Connie.getCart().AddAlltoCart(NikeACG_T,NikeACG,ZoomFly5,NikeACG_T,NikeACG,ZoomFly5);
  Member Patrick2 = new Member("Patrick");
  Patrick2.getCart().AddAlltoCart(NikeACG_T,NikeACG,ZoomFly5,NikeACG_T,NikeACG,ZoomFly5);

  ArrayList<Member> MemberList = new ArrayList<>();
  MemberList.add(Him);
  MemberList.add(Patrick);
  MemberList.add(Connie);
  MemberList.add(Patrick2);
  

  HashMap<ArrayList<Member>,ArrayList<Product>> Nike = new HashMap<>();
  Nike.put(MemberList,MemberList.get(0).getCart().getCartProduct()); 
  Nike.put(MemberList,MemberList.get(1).getCart().getCartProduct()); 
  Nike.put(MemberList,MemberList.get(2).getCart().getCartProduct()); 
  Nike.put(MemberList,MemberList.get(3).getCart().getCartProduct()); 




  for(Map.Entry<ArrayList<Member>,ArrayList<Product>> a : Nike.entrySet()){
    System.out.println(a.getKey() + " bought the items below \n"+ a.getValue()+"\n");
  }

  ShoppingCart Hi = new ShoppingCart<>();
  ShoppingCart<MHoodies> clothesCart = new ShoppingCart<>();
  ShoppingCart<MClothes> clothesCartq = new ShoppingCart<>();
  ShoppingCart<MShoes> clothesCareft = new ShoppingCart<>();
  Hi.AddAlltoCart(NikeACG,NikeACG_T,ZoomFly5);
  System.out.println(Hi.getCartProduct());
  clothesCart.AddAlltoCart(NikeACG,NikeACG_T,ZoomFly5);
  System.out.println(clothesCart.getCartProduct());
  
  
}


}
