package ObjectCLass;

public abstract class Adult extends Person {
  //abstract Class extends abstract Class
  // implicitly "Extends" abstract method
  //public abstract void read();


  public abstract void sleep();

  public Adult(){
    super();
  }
  // public Adult(int age,double height){
  //   super(age, height);
  // }
  public abstract void read();
  public void eat(){
    System.out.println("i am adult, i am eating");
  }
}
