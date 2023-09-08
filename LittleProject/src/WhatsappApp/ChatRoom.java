package WhatsappApp;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom extends Whatsapp{
  private String groupName;
  private String groupDescribtion;
  private List<Person> participants;
  private List<Integer> phoneNumbers;

  public ChatRoom(String groupName,Person... participants){
    this.groupName=groupName;
    this.participants = new ArrayList<>();
    for(Person p: participants){
    this.participants.add(p);
    this.phoneNumbers.add(p.getPhoneNum());
    }
  }
  
}
