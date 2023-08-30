package DataStructure.Queue;

public class Node {
  int data;
  Node next;

  public Node(){}
  public Node(int data){
    this.data = data;
  }
  public int getData(){
    return this.data;
  }

  public String toString(){
    return String.valueOf(data);
  }


  public static void main(String[] args) {
    Node head = new Node(10);
    head.next = new Node(11);
    head.next.next = new Node(12);
    head.next.next.next = new Node(13);
    for(int i =0;i<4;i++){
      System.out.println(head);
    }
  }
}
