import java.util.ArrayList;

public class School{

  public static void main(String[] args) {
    Integer a = Integer.valueOf(657);
    Integer b = 657;
    Integer c = 657;

    System.out.println(c.equals(b));

    String name = "hi";
    String name2 ="hi";
    System.out.println(name.equals(name2));

    String[] words = new String[] {"jhksaf","weri","sdfec"};
    String[] row = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
    ArrayList<String> ans = new ArrayList<String>();
    int count=0;
    int found=0;
    for(int i=0;i<words.length;i++){
        for(int k=0;k<row.length;k++){
            count=0;
            for(int j=0;j<words[i].length();j++){
            for(int p=0;p<row[k].length();p++){
                if(words[i].charAt(j)==row[k].charAt(p)){
                    count++;
                    if(count==words[i].length()){
                        ans.add(words[i]);
                        found++;
                        break;
                    }
                }
                }
            } 
        } 
    }
    String h="huh";
    //h.contains('h');
       String[] anss = new String[found];
       for(int i=0;i<found;i++){
           anss[i]=ans.get(i);
       }
       ans.add("name2");
       System.out.println(ans);
  }
}
