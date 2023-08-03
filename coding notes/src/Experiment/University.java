package Experiment;


public class University {
  private String name;
  private UStudent[] Student;
  private Bachelor[] bachelor;
  private Club[] club;
  private static int NumOfStudents=0;
  private static int NumOfBachelor=0;
  private static int NumOfClub=0;

  public University(){
    NumOfStudents++;
  }

  public University(UStudent student){
    this.Student[NumOfStudents]=student;
    NumOfStudents++;
  }
  public University(Bachelor bachelor){
    this.bachelor[NumOfBachelor] = bachelor;
    NumOfBachelor++;
  }
  public University(Club club){
    this.club[NumOfClub] = club;
    NumOfClub++;
  }
  
  public UStudent[] getStudents(){
    return Student;
  }

  
  public void setStudents(UStudent student){
    this.Student[NumOfStudents]=student;
    NumOfStudents++;
  }

  public void setClub (Club club){
    this.club[NumOfClub] = club;
    NumOfClub++;
  }
  public void setBachelor(Bachelor bachelor){
    this.bachelor[NumOfBachelor] = bachelor;
    NumOfBachelor++;
  }

  public int getID(){
    return this.NumOfStudents;
  }

  public static void main(String[] args) {
    UStudent Him = new UStudent();
    University Universe = new University(Him);
  


  }
  
}
