import java.util.Arrays;

public class CarFactory {
  public static void main(String[] args) {
    Person Him = new Person("hi",3,'d');
    Person Connie = new Person("hi",3,'d');
    //Connie.setname("him");
    //Connie.name ="abc";
    //Connie.personalInfo("him",9,'d');
    System.out.println(Connie==Him);
    Connie.name="him";
    System.out.println(Connie.name==Him.name);

    
    String s1 = "HELLO";
    String s2 = "HELLO";
    String s3 = new String("HELLO");

    System.out.println(s1 == s2); // true
    System.out.println(s1 == s3); // false
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1.equals(s3));// true


    int[] numbers = new int[] {3,4,2,6,1,9,12,45,24};
    for(int i=0;i<numbers.length-3;i++){
      for (int k=i+1;k<=i+2;k++){
        if (numbers[i]>numbers[k]){
          int temp = numbers[k];
          numbers[k] = numbers[i];
          numbers[i] = temp;
        }
      }
    }
    int []a = new int[]{53,24,61,71};
    for(int i=0;i<a.length-1;i++){
      for (int k=i+1;k<=a.length;k++){
        if (a[i]>a[k]){
          int temp = a[k];
          a[k] = a[i];
          a[i] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(a));
  }

  //attributes
  // public void changeColor(Car car, String color){
  //   car.setColor(color);
  // }



}
