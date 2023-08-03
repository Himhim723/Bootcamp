package Hospital;

import java.util.Arrays;

public class Hospital {
  private Patient[] patient=new Patient[9];
  private static int NumOfPatient=0;

  public void setPatient(Patient patient){
    this.patient[NumOfPatient]=patient;
    NumOfPatient++;
  }

  public String toString(){
    String s="The hospital now have "+this.NumOfPatient+" patients";
    for(int i=0;i<this.patient.length;i++){
      s+="\n"+this.patient[i].getName();
    }
    return s;
  }


  public static void main(String[] args) {
    Hospital hos1 = new Hospital();
    Patient patient1 = new Patient("Him",322,"M",34.13d,1.4d);
    Patient patient2 = new Patient("Connie",322,"M",34.13d,1.4d);
    Patient patient3 = new Patient("Patrick",322,"M",34.13d,1.4d);
    Patient patient4 = new Patient("Angus",322,"M",34.13d,1.4d);
    Patient patient5 = new Patient("Oscar",322,"M",34.13d,1.4d);
    Patient patient6 = new Patient("Vincent",322,"M",34.13d,1.4d);
    Patient patient7 = new Patient("sdfsdfI",322,"M",34.13d,1.4d);
    Patient patient8 = new Patient("ssI",322,"M",34.13d,1.4d);
    Patient patient9 = new Patient("Name",12,"F",33.4d,1.66d);
    System.out.println(hos1.toString());


  }
}
