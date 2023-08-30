public class Phone {
  private String number;
  private Color color;
  private double weight;

  public Phone(){}
  public Phone(Builder builder){
    this.number = builder.number;
    this.color  = builder.color;
    this.weight = builder.weight;
  }
  private static Builder builder(){
      return new Builder();
  }
  private static Builder builder(String number, Color color, double weight){
      return new Builder(number,color,weight);
  }
  public String toString(){
    return "Phone Number: "+this.number +" Color: "+this.color+" Weight: "+this.weight;
  }
    public Phone setColor(Color color){
      this.color = color;
      return this;
  }
  public Phone setNumber(String number){
    this.number = number;
    return this;
  }
  public Phone setWeight(double weight){
    this.weight = weight;
    return this;
  }
  public static Phone build(){
    return new Phone();
  }





  private static class Builder{ //Cannot access attribute outside
    private String number;
    private Color color;
    private double weight;

    public Builder(){}
    public Builder(String number, Color color, double weight){
      this.number= number;
      this.color = color;
      this.weight =weight;
    }
    public Builder number (String number){
      this.number = number;
      return this;
    }
    public Builder color(Color color){
      this.color = color;
      return this;
    }
    public Builder weight(double weight){
      this.weight = weight;
      return this;
    }

    public Phone build (){
      return new Phone(this);
    }
  }




  public static void main(String[] args) {
    //Chain Method: replace different number of args constructionrs
    Phone phone = Phone.builder().color(Color.RED).number("61236444").weight(55.11d).build();
    Phone phone1 = Phone.build().setColor(Color.RED).setNumber("61112233").setWeight(4.11d);
    System.out.println(phone1);
    System.out.println(phone);

  }

}
