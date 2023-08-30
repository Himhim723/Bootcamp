package ObjectCLass.ENUM;

public enum Currency {
  USD(1,"US Dollar"),
  HKD(2,"Hong Kong Dollar"),
  CYR(3,"Chinese Yuan Renminbi"),
  BPS(4,"British Pound Sterling");

  private int id;
  private String description;

  private Currency(int id,String description){
    this.id=id;
    this.description=description;
  }

  public String getDescription(){
    return this.description;
  }

  public int getID(){
    return this.id;
  }

  public static Currency getCurrency(int id){
    for(Currency currency: Currency.values()){
      if(currency.getID()==id) return currency;
    }
    return null;
  }

public static void main(String[] args) {
  System.out.println(Currency.HKD.getDescription());
  System.out.println(Currency.valueOf("BPS").getDescription());
  
}




}
