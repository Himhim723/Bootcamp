package DataStructure.Queue;
public class 人形蜈弓 {
  String name;
  人形蜈弓 後面的人;
  int index;
  static int length;

  public 人形蜈弓(){}
  public 人形蜈弓(String name){
    this.index=length++;
    this.name=name;
  }
  public 人形蜈弓(人形蜈弓 q2){
    this.name=q2.name;
    this.後面的人=q2.後面的人; 
  }
  
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }

  public void add(String name){
    this.後面的人 = new 人形蜈弓(name);
  }
  public 人形蜈弓 add(人形蜈弓 person){
    return this.後面的人 = person;
  }


  public 人形蜈弓 getNode(){
    return this.後面的人;
  }


  public void 誰要進來了(String str){
    this.get第n個個(length).add(str);
  }
  public void 誰要進來了(人形蜈弓 person){
    this.get第n個個(length).add(person);
  }

  public 人形蜈弓 get第n個個(int length){
    人形蜈弓 第一個人 = this;
    for(int i=0;i<length-1;i++){
      第一個人 = 第一個人.getNode();
    }
    return 第一個人;
  }

  public 人形蜈弓 get(int length){
    return this.get第n個個(length+1);
  }

  // public 人形蜈弓 addFirst(String str){
  //   人形蜈弓 第一個人 = new 人形蜈弓(str);
  //   第一個人.add(this);
  //   this.add(第一個人);
  //   return 第一個人;
  // }

   public void addFirst(String str){
    人形蜈弓 第一個人 = new 人形蜈弓(str);
    第一個人.add(this.getNode());
    this.add(第一個人);
  }

  public void insert(int index,String name){
    人形蜈弓 第一個人 = new 人形蜈弓(this.get第n個個(index));
    this.get第n個個(index).setName(name);
    this.add(第一個人);
  }

  @Override
  public String toString(){
    return this.name;
  }


  public static void main(String[] args) {
    人形蜈弓 q1 = new 人形蜈弓("I am Head 1 guy");
    // System.out.println(q1.getName());
    // q1.add("I am the 2 guy");
    // System.out.println(q1.getNode().getName());
    // q1.getNode().add("I am the 3 guy");
    // System.out.println(q1.getNode().getNode().getName());
    // q1.getNode().getNode().add("I am the 4 guy");   //第三個人 set 後面個個
    // System.out.println(q1.getNode().getNode().getNode().getName());

    // System.out.println(q1.get(0));
    // System.out.println(q1.get(1));
    q1.誰要進來了("I am the 2 guy");
    // System.out.println(q1.get(2));
    q1.誰要進來了("I am the 3 guy");
    // System.out.println(q1.get(3));
    q1.誰要進來了("I am the 4 guy");
    // System.out.println(q1.get(4));
    q1.誰要進來了("I am the 5 guy");
    // System.out.println(q1.get(5));
    q1.addFirst("Hello I am the new Head 0th guy");
    q1.誰要進來了("FUCK");
    q1.誰要進來了("FUCK2");
    q1.addFirst("FUCK YOU I am the first now");
    q1.insert(2, "I am inserting into the list");
    
    

    for(int i=0;i<q1.length;i++){
      System.out.println(q1.get(i));
    }
    

    
    
    
    




   
  }
  
}
