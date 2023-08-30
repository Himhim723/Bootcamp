public class MathDemo {
  
  public static int calculate(int i,int j, MathOperator formula){
    return formula.operate(i, j);
  }
  public static void main(String[] args) {
    MathOperator add = (a,b) -> a + b;
    MathOperator minus = (x,y) -> x - y;
    MathOperator multiply = (x,y) -> x * y;
    MathOperator divide = (x,y) -> x / y;
    
    int a = add.operate(3,4);
    int b = minus.operate(2,6);
    int c = multiply.operate(6,3);
    int d = divide.operate(3,6);
    calculate(c, d, add);


    
  }
}
