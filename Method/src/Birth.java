import java.time.LocalDate;
import java.time.Month;

public class Birth {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.println(today);
    LocalDate specificDate = LocalDate.of(2023,Month.FEBRUARY,28);
    System.out.println(specificDate);

    LocalDate d1 = LocalDate.parse("2023-08-30");
    System.out.println(d1.getYear());
    System.out.println(d1.getMonth());
    Month result = d1.getMonth();
    System.out.println(result.getValue());
    System.out.println(d1.getDayOfMonth());
    System.out.println(d1.getDayOfWeek());


    System.out.println(LocalDate.parse("2023-07-28").getDayOfMonth());
    System.out.println(LocalDate.parse("2023-07-29").getDayOfYear());

    System.out.println(d1.plusMonths(8));

    boolean expiry = false;
    d1 = LocalDate.of(2023,Month.JANUARY,13);
    LocalDate expirDate = LocalDate.of(2023,Month.NOVEMBER,11);
    if(d1.isAfter(expirDate)){
      expiry = true;
      System.out.println("your account have expired");
    } else {
      System.out.println("your account will be expired after "+(expirDate.minusMonths(d1.getMonthValue()))+" months");
    }




  }
}
