package WhatsappApp;

import java.util.ArrayList;
import java.util.Scanner;

public class ChatBox {
  private Person owner;
  private Person chatBox;
  private String chat;
  private ArrayList<ChatBox> ChatBoxs;

  public ChatBox(){
    this.chatBox = new Person();
  }
  public ChatBox(Person person){
    this.chatBox = person;
  }
  public void setOwner(Person owner){
    this.owner=owner;
  }
  public Person getOwner(){
    return this.owner;
  }

  public void setChatBox(Person person){
    this.chatBox = person;
    this.ChatBoxs.add(this.chatBox.getChatBox());
  }

  public void sendChat(Person person){
    Scanner input = new Scanner(System.in);
    System.out.println(this.owner+" What do you want to tell "+person.getName());
    person.getChatBox().chat=input.nextLine();
    person.getChatBox().getChat();
  }

  public void getChat(){
    System.out.println(chatBox.getName()+" sent you a message "+this.chat);
  }

}
