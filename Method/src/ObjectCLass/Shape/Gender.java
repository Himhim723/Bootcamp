package ObjectCLass.Shape;

public enum Gender {
  MALE("M"),
  FEMALE("F");

  private String gender;

  private Gender(String gender){
    this.gender=gender;
  }

  public static Gender getGender(int i){
    if(i==1)
    return MALE;
    return FEMALE;
  }



}
