package DataStructure.BigO;

import java.util.LinkedList;

public class BinaryTree {
  private int val;
  private BinaryTree left;
  private BinaryTree right;
  public BinaryTree(){}
  public BinaryTree(int val){
    this.val = val;
  }
  public void addLeft(int val){
    this.left = new BinaryTree(val);
  }
  public void addRight(int val){
    this.right = new BinaryTree(val);
  }
  public BinaryTree getLeft(){
    return this.left;
  }
  public BinaryTree getRight(){
    return this.right;
  }
  public void add(int val){
    BinaryTree temp = this;
    if(val>=this.val){
      while(temp.left != null){
        temp = temp.left;
      }
      temp.addLeft(val);
    } else{
      while(temp.right != null){
        temp = temp.right;
      }
      temp.addRight(val);
    }
  }
  public int getVal(){
    return this.val;
  }

  public static void main(String[] args) {
    int[] num = new int[]{2,3,3,4,5,6,7,8,9,10};
    BinaryTree tree1 = new BinaryTree(5);
    for(int i=0;i<num.length;i++){
      tree1.add(num[i]);
    }
    
    System.out.println(tree1.getVal());
    System.out.println("L1 "+tree1.getLeft().getVal());
    System.out.println("R1 "+tree1.getRight().getVal());
    System.out.println("L2 "+tree1.getLeft().getLeft().getVal());
    System.out.println("R2 "+tree1.getRight().getRight().getVal());
    System.out.println("L3 "+tree1.getLeft().getLeft().getLeft().getVal());
    System.out.println("R3 "+tree1.getRight().getRight().getRight().getVal());
    System.out.println("L4 "+tree1.getLeft().getLeft().getLeft().getLeft().getVal());
    System.out.println("R4 "+tree1.getRight().getRight().getRight().getRight().getVal());
    System.out.println("L5 "+tree1.getLeft().getLeft().getLeft().getLeft().getLeft().getVal());
    System.out.println("L6 "+tree1.getLeft().getLeft().getLeft().getLeft().getLeft().getLeft().getVal());
  }
}
