import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class HotelCheckIn {
  private String clientName;
  private int clientAge;
  private char clientGender;
  private int id;
  private static int count=0;

  public HotelCheckIn(){}
  public HotelCheckIn(Client customer){
    this.id = ++count;
    this.clientName = customer.getName();
    this.clientAge = customer.getAge();
    this.clientGender = customer.getGender();
    System.out.println(customer.name+"has checked in successful");
  }
  public static Client Register(){
    return new Client();
  }
  public String toString(){
    return "customer"+id+": Name: "+clientName+"\tGender; "+clientGender +" Age: "+clientAge;
  }

  private static class Client{
    String name;
    int age;
    char gender;
    public Client setName(String name){
      this.name = name;
      return this;
    }
    public Client setAge(int age){
      this.age = age;
      return this;
    }
    public Client setGender(char gender){
      this.gender = gender;
      return this;
    }
    public HotelCheckIn CheckIn(){
      return new HotelCheckIn(this);
    }
    public String getName(){
      return this.name;
    }
    public int getAge(){
      return this.age;
    }
    public char getGender(){
      return this.gender;
    }
  }

    
  public static void main(String[] args) {
    HotelCheckIn customer1 = HotelCheckIn.Register().setAge(22).setGender('M').setName("Him Jai").CheckIn();
    HotelCheckIn customer2 = HotelCheckIn.Register().setAge(23).setGender('F').setName("Patrick").CheckIn();
    HotelCheckIn customer3 = HotelCheckIn.Register().setAge(22).setGender('M').setName("Himalayas").CheckIn();
    HotelCheckIn customer4 = HotelCheckIn.Register().setAge(23).setGender('F').setName("On9Jai Dum").CheckIn();
    HotelCheckIn customer5 = HotelCheckIn.Register().setAge(22).setGender('M').setName("FuckBoy").CheckIn();
    HotelCheckIn customer6 = HotelCheckIn.Register().setAge(23).setGender('F').setName("Damn it AA").CheckIn();

    System.out.println(customer1);
    System.out.println(customer2);
    System.out.println(customer3);
    System.out.println(customer4);
    System.out.println(customer5);
    System.out.println(customer6);
    
    countStudents(new int[]{1,1,0,0},new int[]{0,1,0,1});
  }
  public static int countStudents(int[] students, int[] sandwiches) {
    int remaining = sandwiches.length;
    int nth = 0;
    int change = 0;
    do{
        int stu = 0;
        while(stu<students.length){
        if(students[stu]==sandwiches[nth]){
            students[stu] =-1;
            sandwiches[nth] = -1;
            System.out.println(nth);
            change++;
            nth++;
            remaining--;
            if
        }
        stu++;
        }
    } while (change!=0);
    return remaining;
}
}
