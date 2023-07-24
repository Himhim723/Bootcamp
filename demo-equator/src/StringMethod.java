import java.util.Arrays;

public class StringMethod {
  public static void main(String[] args) {
    String name = "h1e";
    System.out.println(name.replace(name.charAt(1),(char)(name.charAt(1)+12)));
    
    //功能性上的Method
    //M1: .charAt(number)  => Show the character
    //M2: .length()        => Show how many characters the String has
    //M3: .toUpperCase     => Convert ALL the characters into Upper Case
    //                     e.g. Hello => HELLO
    //M4: .toLowerCase     => Convert ALL the characters into Lower Case
    //                     e.g. HELLO => hello
    //M5: .substring(x,y)  => x 係起點  y 係起點 +1 
    //                        所以 Be Aware of The Last integer
    //M6: .replace         => (由咩 字母/文字 , 變成咩 字母/文字)  字母 ''   文字 " "
    String abcd = "Hello4 I1 Am2 Him3";
    System.out.println(abcd.replace("Hello3","Am2"));
    //M7: .trim            => 將頭尾的空格 Delete左佢
    //M8: .indexOf / lastIndexOf (字母 / 文字)  => Show 佢出現在第幾個字母
    //M9: .concat          => 將兩何 String combine
    //M10: .compareTo      => 將兩個字既第一個字母查字典
    //M11: .toString       => 將任何 data type 轉換成 String
    //M12: .toCharArray    => 將 String 變 Char Array
    //M13: String.valueOf(名)  => 將任何 data type 轉返做 String


    String empty = "";
    String space = " ";
    String hello = "Hello i am Him";

    System.out.println(hello.indexOf("H"));

    //Boolean
    //.isEmpty()           =>  是咪咩都冇
    System.out.println(empty.isEmpty()); //true
    System.out.println(space.isEmpty()); //false
    //.isBlank()           =>  是咪咩空白 (空白同咩都冇係唔同架 諗下 Space Bar X-D)
    System.out.println(empty.isBlank()); //true
    System.out.println(space.isBlank()); //true
    //.contains()          =>  有沒有 ? 字母或者 ?? 文字既出現
    System.out.println(hello.contains("e")); //有冇字母 e 既存在 true
    System.out.println(hello.contains("q")); //有冇字母 q 既存在 false
    //.endsWith()          =>  是咪以 ? 字母或者 ?? 文字完結
    System.out.println(hello.endsWith("e")); //是咪以 字母 e 完結
    System.out.println(hello.endsWith("q")); //是咪以 字母 q 完結
    //.startsWith()        =>  是咪以 ? 字母或者 ?? 文字開頭
    System.out.println(hello.startsWith("e")); //是咪以 字母 e 完結
    System.out.println(hello.startsWith("q"));
    //.equals()            =>  是咪同另一個文字一樣
    System.out.println(hello.equals("Hello i am Him"));
    System.out.println(hello.equals("Hello"));
    //.equalsIgonreCase()  =>  無視大細階 是咪同另一個文字一樣
    System.out.println(hello.equals("hello i am him"));
    System.out.println(hello.equals("HELLO I AM HIM"));

    String[] food = new String[]{"banana", "orange", "eat","mog","apple"};
    for (int i=0;i<food.length;i++){
      for (int k=i+1;k<food.length;k++){
        if(food[i].compareTo(food[k])>0){
          String sub = food[k];
          food[k] = food[i];
          food[i] = sub;
      }
      }
    }
    System.out.println(Arrays.toString(food));


    
    

  }
}
