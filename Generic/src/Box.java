import java.util.ArrayList;

public class Box<T extends Number>{
  private ArrayList<T> numbers;

  private Box(){
    this.numbers=new ArrayList<>();
  }
  public Box (T num){
    this();
    numbers.add(num);
  }

  public ArrayList<T> getNumbers(){
    return this.numbers;
  }

  public void add(T number){
    this.numbers.add(number);
  }


}
