package Revision;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Company {
  private List<Staff> staffs = new ArrayList<>(); 

  public Company(){}

  public Company (List<Staff> staffs){
    this.staffs = staffs;
  }

  public List<Staff> getStaffList(){
    return this.staffs;
  }

  public void add(Staff staff){
    this.staffs.add(staff);
  }

  public static void main(String[] args) {
    Company com = new Company();
    Staff Him = new Staff(1, "Him", 34000.00);
    com.add(Him);
    Staff Jelly = new Staff(2, "Jelly", 44000.00);
    com.add(Jelly);
    Staff David = new Staff(3, "David", 34000.00);
    com.add(David);
    Staff Emily = new Staff(4, "Emily", 34000.00);
    com.add(Emily);
    com.add(new Staff(5, "five guy", 0.00));

    Stream<Staff> stream = com.getStaffList().stream();

    Staff[] staffarr = new Staff[]{Him,Jelly,David,Emily};
    Stream<Staff> s2 = Arrays.stream(staffarr);
    
    Staff deletedStaff = Him;
    Staff[] deleted = new Staff[staffarr.length-1];
    int idx=0;
    for(int i=0;i<staffarr.length;i++){
      if(staffarr[i].equals(deletedStaff)) continue;
      deleted[idx++] = staffarr[i];
    }
    staffarr = deleted;

    System.out.println(Arrays.toString(staffarr));

    double a = 0.1;
    double b = 0.2;
    System.out.println(a+b);

    System.out.println(BigDecimal.valueOf(0.2).add(BigDecimal.valueOf(0.1)));


  }

}
