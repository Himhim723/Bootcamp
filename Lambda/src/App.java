import java.util.Comparator;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       

        //By studying Thread Class We can see we can put Functional Interface In Class Attributes 

        // Functional Interface 
        // Void Abstract Method  -> Lambda
        // 1. Consumer<T> _________ = ( T Same Type Parameter) -> {  ... Method Initialize ...  };
        // 2. BiConsumer<T, U> __________ = (T, U) -> { ... Method Initialize ... };

        // Return Abstract Method -> Lambda

        // Method containing Limited Return Type
        // 3. (BOOLEAN) Predicate<T> __________ = (T) -> Method initialize retrun boolean
        // 4. (BOOLEAN) BiPredicate<T, U> _______ = (T ,U ** Can Different Type **) -> return boolean
        // 5. (INTEGER) Comparator<T> ________ = (T, T (two parameter with SAME TYPE)) return int (use 正負 determine sequence)
        
        // Return Method with 自己定義(想要return data)的Type
        // 6. Function< (Parameter) T , (Return type) U > __________ = T -> return U (What You Want)
        // 7. BiFunction< (Para) T , (Para) U , (Return type) R> __________ = (T,U) -> return R(What You Want)
        // 8. UnaryOperation<(Para && Return Same Type) T > ____________ = T -> return Type T (Data can be changed);
        // 9. BinaryOperation<(Para && Return Same Type) T ,T > ____________ = (T,T) -> return Type T (Data can be changed);
        // 10. Supplier< (Return Type) T > ____________ = ( without Parameter) -> return T;
        //     Normally just provide Random Stuff for others. 





    }
}
