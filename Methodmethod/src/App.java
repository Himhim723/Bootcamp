import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
public interface App {

    public abstract char charAt(int d);
    public static void main(String[] args) {
        Consumer<String> sysout = s -> System.out.println(s);
        Consumer<String> syosut2 = System.out::println;
        // :: Can be placed in static method
        // public static int addtwoSum(int a , int b)
        // static instance constructor 
        // // ::addTwoSum
        // Arrays.asList("abc","def").forEach(syosut2);

        String name = "Jogn";
        Supplier<Integer> strLenght = ()-> "dd".length();
        Supplier<Integer> strLength2 = "dffff"::length;
        
        List<String> words = Arrays.asList("Effs","asdfa","sdfa");
        Comparator<String> com = (s1, s2) -> s1.compareTo(s2); 
        Comparator<String> com2 = String :: compareTo; 

        Function<String,Integer> fun = str -> Integer.valueOf(str);
        Function<String,Integer> fun2 = Integer::valueOf;


        
        
        




    }
}
