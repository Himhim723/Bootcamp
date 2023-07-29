public class StringBox{
  private String word;
  public StringBox(){
    
  }
  public StringBox(String word){
    this.word = word;
  }
  public String getString(){
    return this.word;
  }
  public void setString(String word){
    this.word = word;
  }
  public StringBox append(String word){
    this.word += word;
    return this;
  }

  public char charAt(int x){
    char[] arr = this.word.toCharArray();
    char ans = arr[x];
    return ans;
  }

  public char[] toCharArray(String word){
    char[] chararr = new char[this.word.length()];
    for(int i=0;i<this.word.length();i++){
    chararr[i] = this.word.charAt(i);
    }
    return chararr;
  }

/**
 * 
 * @param x   Comment
 * @param y   Comment
 * @return
 */
  // public StringBox insert(char x, int y){
  //   if(y<0||y>this.word.length()) return this;
  //   if( "".equals(this.word)) return this;
  //   this.word = this.word.substring(0, y)+x+this.word.substring(y, this.word.length());
  //   return this;
  // }

  public StringBox insert(String x, int y){
    if( this.word == null &&"".equals(x)) return this; 
    if(y<0||y>this.word.length()) return this;
    this.word = this.word.substring(0, y)+x+this.word.substring(y, this.word.length());
    return this;
  }

  public StringBox replace(char orich,char newch){
    char[] arr = this.word.toCharArray();
    this.word = "";
    int idx =-1; 
    for(int i=0;i<arr.length;i++){
      if(arr[i]==orich) {
        idx=i;
        arr[i] = newch;
      }
    }
    if(idx==-1) return this;
    for(char c:arr){
      this.word += c;
    }
    return this;
  }


  public static void main(String[] args) {
    StringBox a = new StringBox();
    a.setString("I am Him.");
    System.out.println(a.getString());
    System.out.println(a.append("I am lost").replace('H','k').getString());
    System.out.println(a.charAt(1));
    StringBox b = new StringBox();
    b.insert("so", 0);
  }

}