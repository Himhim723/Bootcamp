package DataStructure.Queue;

public class NodeList {
  Node head;

  public NodeList(Node node){
    this.head=node;
  }
  public void add(Node node){
    //this.head.data = node.data;
    this.head.next = node;
  }
  public void remove(Node node){
    
  }

  public String toString(){
    return this.head.toString();
  }

  public static void main(String[] args) {
    NodeList h1 = new NodeList(new Node(11));
    h1.add(new Node(12));
    h1.add(new Node(2));
    System.out.println(h1.head);

  }

}
