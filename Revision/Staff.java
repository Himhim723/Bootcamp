package Revision;

import java.util.Objects;

public class Staff {
  private int id;
  private String name;
  private double salary;

  public Staff(){}
  public Staff(int id, String name, double Salary){
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public int getId(){
    return this.id;
  }

  public String getName(){
    return this.name;
  }

  public double getSalary(){
    return this.salary;
  }

  @Override
  public boolean equals(Object obj){
    if(obj == this) return true;
    if(!(obj instanceof Staff)) return false;
    Staff staff = (Staff) obj;
    return Objects.equals(this.id,staff.id);
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.id);
  }


}
