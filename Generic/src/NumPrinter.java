public class NumPrinter {
  static int num=0;

  public static void print(){
    System.out.println(num++);
  }
  public static void print(int num){
    System.out.println(num);
  }
  public static void print(String str){
    System.out.println(str);
  }
  // public void print(){ //compile error

  // }

public static void main(String[] args) {
  NumPrinter.print();
  Printer.print();
  Printer.print();
  Printer.print();
  Printer.print();
  Printer.print();
  Printer.print();
  Printer.print(11);
  Printer.print();
  Printer.print();
  Printer.print();
  Printer.print();
  Printer.print();
  
  
}


}
