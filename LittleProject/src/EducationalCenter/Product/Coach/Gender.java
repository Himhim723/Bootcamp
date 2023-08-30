package EducationalCenter.Product.Coach;

public enum Gender {
  MALE('M',"Male"),
  FEMALE('F',"Female");

  char letter;
  String fullString;

  private Gender(char c, String gender){
    this.letter = c;
    this.fullString = gender;
  }

  public char getChar(){
    return this.letter;
  }

  @Override
  public String toString(){
    return this.fullString;
  }
  
}
