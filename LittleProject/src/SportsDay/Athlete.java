package SportsDay;
public class Athlete {
  private int AthID;
  private static int counter=1;
  private String name;
  private int age;
  private char gender;
  private int yearOfBirth;
  private char grade;
  private double result100;
  private double result200;
  private double result400;
  private double result800;
  private double result1500;
  private double result5k;
  private double result10k;

  public Athlete(String name, int age, char gender, int yearOfBirth) {
    this.AthID =counter++;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.yearOfBirth = yearOfBirth;

    if (this.yearOfBirth >= 1998)
      this.grade = 'A';
    else if (this.yearOfBirth < 1998 && this.yearOfBirth > 1994)
      this.grade = 'B';
    else
      this.grade = 'C';
  }

  @Override
  public String toString() { // At Override
    return this.name;
  }

  public static String toString(Athlete[] athletes){
    return "YEAh";
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int getGender() {
    return this.gender;
  }

  public int getyearOfBirth() {
    return this.yearOfBirth;
  }

  public char getGrade() {
    return this.grade;
  }


  public int getAthID(){
    return this.AthID;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public void setyearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public void setGrade(char grade) {
    this.grade = grade;
  }

  public void setResult100(double result){
    this.result100=result;
  }
  public double getResult100(){
    return this.result100;
  }

  public void setResult200(double result){
    this.result200=result;
  }
  public double getResult200(){
    return this.result200;
  }

  public void setResult400(double result){
    this.result400=result;
  }
  public double getResult400(){
    return this.result400;
  }

  public void setResult800(double result){
    this.result800=result;
  }
  public double getResult800(){
    return this.result800;
  }

  public void setResult1500(double result){
    this.result1500=result;
  }
  public double getResult1500(){
    return this.result1500;
  }

  public void setResult5k(double result){
    this.result5k=result;
  }
  public double getResult5k(){
    return this.result5k;
  }

  public void setResult10k(double result){
    this.result10k=result;
  }
  public double getResult10k(){
    return this.result10k;
  }
}
