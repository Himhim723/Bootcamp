package Hospital;

public class Diagonals extends Patient{
  private double lipidRate;
  private boolean Result;

  public double getLipid(){
    return this.lipidRate;
  }
  
  public void CheckOverWeight(double weight){
    if(weight > 40) this.Result = true;
  }

  public boolean getResult(){
    return this.Result;
  }



  public static void main(String[] args) {
    Patient Him = new Patient("Him",12,"M",50.4d,900.79d);
    System.out.println(Him.checkOverweight());

  }


}
