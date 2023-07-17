import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args) {
    String target = "HimJai";
    String[] name = new String [] {"Angus", "Sunny", "Connie", "Patrick", "HimJai"};

    for (int i=0;i<name.length;i++){
      if (name[i].equals(target)){
        System.out.println(target + "is in the "+i+"th place.");
      }
    }

    //toCharArray()
    String fruit = "I am a boy";
    char[] arr = fruit.toCharArray();
    System.out.println(Arrays.toString(arr));
    
    int max=0;
    int[] numbers = new int[]{634,24,23,75,45};
    for (int i=0;i<numbers.length;i++){
      if (numbers[i]>max){
        max=numbers[i];
      }
    }
    System.out.println(max);

    int min;
    int[] numbers1 = new int[]{634,-204,23,-75,45};
    min=numbers1[0];
    for (int i=0;i<numbers1.length;i++){
      if (numbers1[i]<min){
        min=numbers1[i];
      }  
    }
    System.out.println(min);
  }
}
