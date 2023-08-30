package Exception.src.checked;

import java.util.HashSet;

public class Student {
  String name;
  double pocketMoney=10;

  public Student(){}

  public Student(String name){
    this.name=name;
  }

  public void buy(double price) throws InsufficientMoney{
    if(pocketMoney-price<0) throw new InsufficientMoney("not enough money");
    pocketMoney-=price;
  }


  public void setName(String name) throws ConstructException{
    if(name.length()>50) throw new ConstructException("Name is too long");    
    //throws ConstructException in the method 
    this.name=name;
    
  }

  public static void main(String[] args) throws ConstructException{
    Student stu = new Student();
    try{
    stu.setName("Johnfb");
    stu.buy(11.3);
    } catch (ConstructException e){
      stu.setName("On9 Jai");
    } catch (InsufficientMoney e){
      System.out.println(e.getMessage());
    }
    System.out.println(stu.name);




    try{
    stu.buy(0.9);
    } catch(InsufficientMoney e){
      System.out.println(e.getMessage());
    }
    System.out.println(stu.pocketMoney);
    try{
    stu.buy(8.9);
    } catch(InsufficientMoney e){
      System.out.println(e.getMessage());
    }
    System.out.println(stu.pocketMoney);
    try{
    stu.buy(0.9);
    } catch(InsufficientMoney e){
      System.out.println(e.getMessage());
    }
    System.out.println(stu.pocketMoney);
    //stu.name.length();    unchecked if is null

    


  }
}
