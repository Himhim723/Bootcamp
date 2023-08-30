import java.util.function.Function;
public interface Fun extends Function<String,Integer>{
  @Override
  public Integer apply(String s);
}
