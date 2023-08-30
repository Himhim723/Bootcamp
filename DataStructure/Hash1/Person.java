package DataStructure.Hash1;

import java.util.Scanner;

public class Person {
  private String name;
  private String username;
  private String password;

  public Person(String username, String password){
    this.username = username;
    this.password = password;
  }

  public String getUserNmae(){
    return this.username;
  }
  public String getPassWord(){
    return this.password;
  }
}
