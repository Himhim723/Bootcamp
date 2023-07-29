public class Hi {
  private String password;

  Hi(String x){
    this.password=x;
  }

  public String getPassword(){
    return this.password;
  }

  public void setPassword(String password){
    this.password=password;
  }

  public void append (Hi password){
    password.setPassword("XYZ");
    this.password = "BCD";
  }
  

}
