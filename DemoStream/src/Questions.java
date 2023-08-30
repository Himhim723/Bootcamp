import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Questions {
  private int id;
  private static int count =0;
  private String name;
  private Difficulty difficulty;

  public Questions(){}
  public Questions(String name, Difficulty difficulty){
    this.name=name;
    this.difficulty = difficulty;
    this.id = ++count;
  }

  public static void main(String[] args) {
    ArrayList<Questions> leetcode = new ArrayList<>();
    leetcode.add(new Questions("Two Sum          "     , Difficulty.HARD));
    leetcode.add(new Questions("Palindrome Number"     , Difficulty.EASY));
    leetcode.add(new Questions("Roman to Integer"      , Difficulty.EASY));
    leetcode.add(new Questions("Removed Element  "     , Difficulty.EASY));
    leetcode.add(new Questions("Sliding Window Maximum", Difficulty.HARD));
    leetcode.add(new Questions("HARD Question Two Sum6", Difficulty.HARD));
    leetcode.add(new Questions("Search insert Position", Difficulty.EASY));
    leetcode.add(new Questions("Plus One              ", Difficulty.EASY));
    leetcode.add(new Questions("Add Binary            ", Difficulty.EASY));
    leetcode.add(new Questions("Climbing Stairs       ", Difficulty.EASY));


    List<String> name = leetcode.stream().filter(e-> e.difficulty == Difficulty.EASY)
    .sorted((e1,e2)-> e1.id-e2.id)
    .map(e->"\nQuestion ID:  "+e.id +" \t" +e.name+"\t Difficulty: "+e.difficulty)
    .collect(Collectors.toList());
    
    System.out.println(name);

    long n = leetcode.stream().filter(e-> e.difficulty == Difficulty.EASY)
    .count();
    System.out.println(n);

    
  }


}
