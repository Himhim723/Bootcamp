import java.util.Arrays;

public class Array3 {
  public static int sum (int[] arr){
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    return sum;
  }
  
  public static int[] addone(int[] arr){  //arr is object references
    int[] res = new int[arr.length]; // res Object {0,0,0}
    // res = arr;
    for(int i=0;i<arr.length;i++){
      res[i]=arr[i];
    }
    for(int i=0;i<arr.length;i++){
      res[i]++;
    }
    return res;
    // for(int i=0;i<res.length;i++){
    //   res[i]++;
    // }
  }

  //==     data
  //equals reference

  public static void addtwo(int[] arr){
    for(int i=0;i<arr.length;i++){
      arr[i]++;
    }
  }

  public static void main(String[] args) {
    Integer numm = 10;
    System.out.println(numm);
    int numoi = numm;
    Integer a = numoi;
    System.out.println(numoi);
    System.out.println(a==numm);
    System.out.println(a);
    System.out.println(numoi);

    int[] nums = new int[] {3,4,8};
    System.out.println(Arrays.toString(nums));
    int[] target = addone(nums);
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(target));
    target[0]=100;
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(target));
    addtwo(nums);
    int[] target2 = nums;
    System.out.println(Arrays.toString(nums));
    System.out.println(Arrays.toString(target2));
      Number num = new Number();
      Circle circle = new Circle();
      Computer computer = new Computer();
      Person Him = new Person("HI",3,'d');
      Car HimCar = new Car(); //empty Constructor (with defaulted value)
      Car HimCar1 = new Car(8, 16, "RED");   //all argument Constructor (with settled value)
      Him.setName("GG");
      Him.personalInfo("ASA", 99,'M');
      Him.name="GGfgfgfgfgf";
      Him.SelfIntroduction(Him.name,Him.age);
      
      System.out.println(Him.name);
      System.out.println(Him.age);
  
      System.out.println(HimCar1.getColor());

      int[] num1 = new int[]{4,1,5,2,6,3,8,7,44};
      System.out.println(Arrays.toString(binarySearch(num1,52)));
      System.out.println(Arrays.toString(num1));
      
    
  }
      public static int[] binarySearch (int[]num1,int target1){
        Arrays.sort(num1);
        int[] num = new int[]{-1,-1};
        int low = 0;
        int high =num1.length;
        int mid=low+(high-low)/2;
        for(int i=0;i<num1.length-1;i++){
          low = i+1;
        while(low!=high){
          mid=low+(high-low)/2;
          if(num1[i]+num1[mid]==target1){
            return new int[]{num1[i],num1[mid]};
          } else if(num1[i]+num1[mid]<target1){
            low = mid;
          } else {
            high = mid;
          }
        }
        }
        return num;
      }
}
