import java.util.Objects;

public class Staff {
  private String name;
  private int age;
  private char gender;
  private Department department;

  public Staff(){}
  
  public Staff (String name,Department department,char gender){
    this.name= name;
    this.department = department;
    this.gender = gender;
  }
  public String getName(){
    return this.name;
  }
  public Department getDepart(){
    return this.department;
  }
  public char getGender(){
    return this.gender;
  }
  @Override
  public String toString(){
    return this.name;
  }
  // @Override
  // public boolean equals(Object o){
  //   if( o == this ) return true;
  //   if(!(o instanceof Staff)) return false;
  //   Staff staff = (Staff) o;
  //   return Objects.equals(this.name,staff.name)&&Objects.equals(this.department,staff.department);
  // }
  // @Override 
  // public int hashCode(){
  //   return Objects.hash(this.name,this.department);
  //}
}
