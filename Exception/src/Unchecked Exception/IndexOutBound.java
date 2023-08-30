public class IndexOutBound {
  
  public static void main(String[] args) {
    int[] arr = new int[4];

  try{
    for(int i=0;i<10;i++){
      arr[i]=i;
    }
  } catch(ArrayIndexOutOfBoundsException e){
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
    System.out.println("Not Success");
  }

  }
}
