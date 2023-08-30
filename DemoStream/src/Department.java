import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Department {
  private String dep;
  public Department(){}
  public Department(String dep){
    this.dep = dep;
  }

  @Override
  public String toString(){
    return this.dep;
  }
  @Override
  public boolean equals(Object o){
    if( o == this ) return true;
    if(!(o instanceof Department)) return false;
    Department department = (Department) o;
    return Objects.equals(this.dep,department.dep);
  }
  @Override 
  public int hashCode(){
    return Objects.hash(this.dep);
  }
  public static void main(String[] args) {
    List<Staff> staffs = new ArrayList<>();
    staffs.add(new Staff("Mary", new Department("HR"),'F'));
    staffs.add(new Staff("Billy", new Department("HR"),'M'));
    staffs.add(new Staff("Candy", new Department("HR"),'F'));
    staffs.add(new Staff("Louis", new Department("HR"),'M'));
    staffs.add(new Staff("Connie", new Department("IT"),'F'));
    staffs.add(new Staff("Angus", new Department("HR"),'M'));
    staffs.add(new Staff("Jerry", new Department("Edu"),'M'));

    Map<Department,List<Staff>> depMap = 
    staffs.stream().collect(Collectors.groupingBy(staff-> staff.getDepart()));
    System.out.println(depMap);

    //Map --> stream
    Map<Boolean,List<Staff>> FemaleEmployee = staffs.stream()
    .collect( Collectors.partitioningBy(e -> e.getGender()=='F'));

    Map<Boolean,List<Staff>> MaleMap = 
    staffs.stream().collect(Collectors.groupingBy(staff-> staff.getGender()=='M'));
    System.out.println(depMap);


    System.out.println(FemaleEmployee);



 
    // String[] arr = staffs.stream().map(e -> e.getName()).collect(Collectors.toList()).toArray(new String[0]);
    // System.out.println(Arrays.toString(arr));

    



  }
}
