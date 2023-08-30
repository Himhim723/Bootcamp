package EducationalCenter.Product.Course;

public enum Venue {
  SSP("Shum Shui Po SportsGround"),
  TKO("Tseung Kwan O SportsGround"),
  TY("Tsing Yi SportsGround"),
  CWB("Causeway Bay SportsGround"),
  ;
  
  String name;
  private Venue(String name){
    this.name = name;
  }


  public String getVenue(){
    return this.name;
  }
}
