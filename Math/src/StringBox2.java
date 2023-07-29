import java.util.Arrays;

public class StringBox2 {
  private char[] chararr;

  public StringBox2(){

  }

  public StringBox2(String word){
    this.chararr = word.toCharArray();
  }

  public StringBox2(char[] arr){
    this.chararr = Arrays.copyOf(arr, arr.length);
  }

  public char[] getString(){
    return this.chararr;
  }
  public String toString(){
    return Arrays.toString(this.chararr);
  }


  public StringBox2 append(String words){
    char[] arr = Arrays.copyOf(this.chararr, this.chararr.length+words.length());
    char[] temp = words.toCharArray();
    int idx=0;
    for(int i=chararr.length;i<arr.length;i++){
      arr[i]=temp[idx];
      idx++;
    }
    this.chararr = arr;
    return this;
  }


  public static void main(String[] args) {
    char[] chars = new char[] {'a','g','e'};
    StringBox2 a = new StringBox2(chars);
    System.out.println(a.toString());
    chars[1]='z';
    System.out.println(chars);
    System.out.println(a.toString());
    char[] chars1 = new char[] {'k','g','e'};
    char[] chars2 = Arrays.copyOf(chars1, chars1.length);
    chars1[0] = '@';
    int[] num = new int[]{2,4,45,6,7,3};
    System.out.println(String.valueOf(a)+1);
    System.out.println(Arrays.toString(chars1));
    System.out.println(a.append("Hello World I am lost !!!").toString());
  }
}
