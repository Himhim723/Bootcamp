package Hospital;

public class Patient extends Hospital{
  private String name;
  private int age;
  private String gender;
  private double height;
  private double weight;

  public Patient(){

  }

  public Patient(String name,int age,String gender,double weight,double height){
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.weight=weight;
    this.height=height;
  }
  public void setWeight(double weight){
    this.weight=weight;
  }
  public double getWeight(){
    return this.weight;
  }
  public boolean checkOverweight(){
    Diagonals Disease = new Diagonals();
    Disease.CheckOverWeight(this.getWeight());
    System.out.println(Disease.getResult());
    System.out.println("Patient weight is "+this.getWeight());
    return Disease.getResult();
  }
  public String getName(){
    return this.name;
  }

}
