package ObjectCLass.Shape;

import java.util.Scanner;

public class tryme {
  Gender gender;
  
  public void Signin(){
    System.out.println(Gender.getGender(1));
    // Scanner input= new Scanner(System.in);
    // boolean isValid = false;
    // while (!isValid) {
    //   System.out.println("Please input correct Gender (M/F): ");
    //   String genderInput = input.next();
    //   if (genderInput.equals(Gender.MALE.getGender().toString())) {
    //     this.gender = Gender.MALE;
    //     isValid = true;
    //     System.out.println("1");
    //   } else if (genderInput.equals(Gender.FEMALE.getGender().toString())) {
    //     this.gender = Gender.FEMALE;
    //     isValid = true;
    //     System.out.println("2");
    //   }
    // }
  }
  public static void main(String[] args) {
    tryme hi = new tryme();
    hi.Signin();
  }
}
