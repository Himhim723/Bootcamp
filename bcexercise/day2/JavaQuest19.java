 /**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class JavaQuest19 {
  // Declare instance variables carYear and carModel
  private int year;
  private String model;
  // Constructor with variables carYear and carModel
  public JavaQuest19(int year, String model){
    this.year = year;
    this.model = model;
  }
  public void ShowCarDetails(){
    System.out.println("Car Details : ");
    System.out.println("Model: "+this.model);
    System.out.println("Year of Produced : "+ this.year);
  }
  // methods

  public static void main(String[] args) {
    JavaQuest19 myCar = new JavaQuest19(2020, "ModelY");
    // Create an instance of thefclass, with carYear 2020, and carModel
    // "ModelY"
    // print the expected output
    myCar.ShowCarDetails();

  }
}
