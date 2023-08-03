package ObjectCLass;

import java.util.Objects;

public class Keyboard extends Laptop{
  
  private String buttonType;
  private int noOfButton;

  public Keyboard(String buttonType, int noOfButton){
    this.buttonType = buttonType;
    this.noOfButton = noOfButton;
  }
  public void setButtonType(String button){
    this.buttonType=button;
  }
  public void setNoOfButton(int noOfButton){
    this.noOfButton=noOfButton;
  }
  public String getButtonType(){
    return this.buttonType;
  }
  public int getNoOfButton(){
    return this.noOfButton;
  }

  @Override
  public String toString(){
    return "\nKeyboard Information:\nButton Type: "+this.buttonType+"\nNumber oF Button: "+this.noOfButton;
  }

  @Override
  public boolean equals(Object o){
    if(o==this) return true;
    if(!(o instanceof Keyboard)) return false;
    Keyboard key = (Keyboard) o;
    return Objects.equals(this.buttonType,key.buttonType)&&
           Objects.equals(this.noOfButton,key.noOfButton);
  }
}
