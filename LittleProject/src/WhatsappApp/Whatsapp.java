package WhatsappApp;

import java.util.Scanner;

public class Whatsapp {
  
  public static void main(String[] args) {
    Person Him = new Person("Him", 67635995, "I am lazy");
    Person Patrick = new Person("Patrick", 67635995, "I am lazy");
    Person Connie = new Person("Connie",1263862,"Ad");
    Him.setChatBox(Patrick);
    Him.getChatBox().sendChat(Patrick);

    Connie.setChatBox(Patrick);
    Patrick.getChatBox().sendChat(Connie);
  }
}
