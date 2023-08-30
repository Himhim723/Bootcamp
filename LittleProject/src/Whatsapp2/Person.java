package Whatsapp2;

import java.util.ArrayList;
import java.util.HashMap;

public class Person {
  private String name;
  private HashMap<Person,ArrayList<Message>> chatRooms;

  public Person(String name, int phone){
    this.name=name;
    this.chatRooms= new HashMap<Person,ArrayList<Message>>();
  }

  public void setContact(Person p){
    ArrayList<Message> newChatRm = new ArrayList<>();
    this.chatRooms.put(p, newChatRm);
    p.chatRooms.put(this, newChatRm);
  }

  public void sendMessage(Person p,String str){
    Message message = new Message(this.name+": "+str+"\n");
    this.chatRooms.get(p).add(message);
  }

  public ArrayList<Message> getMessage(Person p){
    return this.chatRooms.get(p);
  }
  
  public static void main(String[] args) {
    
    Person Him = new Person("Him", 12345678);
    Person Angus = new Person("Angus", 1413245);
    Person Patrick = new Person("Patrick", 14134133);
    Him.setContact(Angus);
    Patrick.setContact(Him);
    Angus.sendMessage(Him, "Hello I am Angus");
    Him.sendMessage(Angus, "Hello I am Him");
    Him.sendMessage(Angus, "Hello How are You?");
    Angus.sendMessage(Him, "Yo what can we do tmr?");
    Him.sendMessage(Angus, "We can sleep in the lesson");
    System.out.println(Angus.getMessage(Him));
    Him.sendMessage(Patrick, "Hey Yo");
    Patrick.sendMessage(Him, "What's Up");
    Him.sendMessage(Patrick, "Nothing I am LOST");
    Patrick.sendMessage(Him, "Oh me too LOST in the big forest");
    System.out.println(Patrick.getMessage(Him));
    
  }
}
