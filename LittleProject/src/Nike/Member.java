package Nike;

import java.util.Scanner;

public class Member {
  private String name;
  private int age;
  private String gender;
  private int phoneNum;
  private String email;
  private String password;
  private ShoppingCart shoppingCart;

  public Member(){
    //SignIn();
  }

  public void SignIn(){
    boolean valid = false;
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to Nike.com. Sign In and become A Member of Us.");
    while(!valid){
    System.out.println("Please enter your email address");
    this.email = input.next();
    if(email.contains("@gmail.com")||email.contains("@icloud.com")) valid=true;
    else {
      System.out.println("Please enter a valid email address");
    }
    }
    valid=false;
    while(!valid){
    System.out.println("Please set your password with not less than 8 characters.\nFor your safety, please ensure your password contains UpperCase letter and LowerCase letter");
    this.password = input.next();
    int UpperCase=0;
    int LowerCase=0;
    for(int i=0;i<password.length();i++){
      if(UpperCase==1&&LowerCase==1) break;
      if(password.charAt(i)>65&&password.charAt(i)<90) UpperCase=1;
      if(password.charAt(i)>97&&password.charAt(i)<122) LowerCase=1;
    }
    if(UpperCase==1&&LowerCase==1&&password.length()>=8) valid=true;
    }
    valid=false;
    while(!valid){
    System.out.println("Please enter your name: ");
    this.name = input.next();
    System.out.println("Please enter your age: ");
    this.age = input.nextInt();
    System.out.println("Please enter your gender: ");
    this.gender = input.next();
    System.out.println("Please enter your contact number: ");
    this.phoneNum = input.nextInt();
    System.out.println("\nPlease confirm the information below if it is correct.");
    System.out.println("Name: "+this.name+"\nAge: "+this.age+"\nGender: "+this.gender+"\nContact Number: "+this.phoneNum+"\nEmail Address: "+this.email);
    System.out.println("Enter 'confirm if your information is correct.'");
    if(input.next().toLowerCase().equals("confirm")) valid = true;
    }
    System.out.println("\nCongratulations, You have Sign in Successfully.");
  }

  public void setCart(){
    this.shoppingCart = new ShoppingCart();
  }

  public ShoppingCart getCart(){
    return this.shoppingCart;
  }
  
  public String CheckProduct(Product product){
    StringBuilder sb = new StringBuilder();
    sb.append("  產品介紹\n");
    sb.append("產品: "+product.getName()+"\n");
    sb.append("類型: "+product.getSports()+"\n");
    sb.append("價錢: "+product.getUnitPrice()+"\n");
    sb.append("Describtion: \n"+product.getDescribtion()+"\n");
    return sb.toString();
  }

  

}
