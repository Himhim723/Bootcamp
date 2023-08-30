package ObjectCLass.ENUM;

public enum Color {
  RED  ("#FF00001F"),
  GREEN("#FF324234"),
  BLUE ("#234234FF"),
  M("M"),
  F("F")
  ;

  //attributes
  private String colorCode;
  

  //Constructor
  private Color(String code){
    this.colorCode=code;
  }

  public String getGender(){
    return this.colorCode;
  }

}
