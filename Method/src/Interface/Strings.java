package Interface;

public class Strings implements CharSequence{

  char[]arr;   

  private Strings(String str){
    arr = new char[str.length()];
    for(int i=0;i<str.length();i++){
      arr[i] =  str.charAt(i);
    }
    //this.arr=str.toCharArray();
  }

  public Strings valueOf(String str){
    return new Strings(str);
  }

  @Override
  public int length(){
    return arr.length;
  }

  @Override
  public char charAt(int idx){
    return arr[idx];
  }

  @Override 
  public CharSequence subSequence(int begin,int end){
    if(begin<0||end>arr.length||end<=begin) return String.valueOf(arr);
    StringBuilder sb = new StringBuilder();
    for(int i=begin;i<end;i++){
      sb.append(arr[i]);
    }
    return sb.toString();
  }

  @Override
  public String toString(){
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<this.arr.length;i++){
      sb.append(this.arr[i]);
    }
    return sb.toString();
  }
  
  

  public static void main(String[] args) {
    Strings abd = new Strings("Hello");
    System.out.println(abd.subSequence(1, 3));
    System.out.println(abd);

  }
}
