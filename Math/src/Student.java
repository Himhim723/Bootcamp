public class Student{
  private String FirstName;
  private String LastName;
  private int age;
  private char gender;
  private int ChiGrade;
  private int EngGrade;
  private int MathGrade;
  private int LSGrade;
  private int X1Grade;
  private int X2Grade;
  private int X3Grade;
  


  public Student(String FName,String LName,int Age, char Gender){
    this.FirstName = FName;
    this.LastName = LName;
    this.age = Age;
    this.gender =Gender;
  }

  public boolean isAdult(){
    // if(this.age>=18) return true;
    // return false;
    //return this.age >= 18? true : false;
    return this.age >= 18;
  }

  public String FullName(){
    return this.FirstName.concat(" ").concat(this.LastName);
  }

  public String getFirstName(){
    return this.FirstName;
  }

  public String getLastName(){
    return this.LastName;
  }

  public int getAge(){
    return this.age;
  }
  
  public char getGender(){
    return this.gender;
  }

  public void setName(String FName, String LName){
    this.FirstName = FName;
    this.LastName =LName;
  }

  

}
