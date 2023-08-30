package WhatsappApp;

public class Person {
  private String name;
  private int phoneNum;
  private String status;
  //private ChatRoom group;
  private ChatBox chatbox;
  private ChatBox[] chats;

  

  public Person(){

  }
  public Person(String name,int phoneNum,String status){
    this.name=name;
    this.phoneNum=phoneNum;
    this.status=status;
  }

  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }
  public void setPhoneNum(int phoneNum){
    this.phoneNum=phoneNum;
  }
  public int getPhoneNum(){
    return this.phoneNum;
  }
  public void setStatus(String status){
    this.status=status;
  }
  public String getStatus(){
    return this.status;
  }
  public void setChatBox(Person contact){
    this.chatbox=new ChatBox(contact);
    this.chatbox.setOwner(this);
    contact.chatbox=new ChatBox(this);
    contact.chatbox.setOwner(contact);
  }
  public ChatBox getChatBox(){
    return this.chatbox;
  }

  @Override
  public String toString(){
    return this.name;
  }


}
