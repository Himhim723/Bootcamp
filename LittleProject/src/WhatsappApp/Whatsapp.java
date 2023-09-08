package WhatsappApp;


public class Whatsapp {
  
  public static void main(String[] args) {
    Person Him = new Person("Him", 67635995, "I am lazy");
    Person Patrick = new Person("Patrick", 67635995, "I am lazy");
    Him.setChatBox(Patrick);
    Him.getChatBox().sendChat(Patrick);
  }
}
