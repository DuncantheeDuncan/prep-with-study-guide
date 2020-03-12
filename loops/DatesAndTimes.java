import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * DatesAndTimes
 */
public class DatesAndTimes {
public static void main(String[] args) {
    LocalDateTime lcd  = LocalDateTime.now();

// System.out.println(lcd = lcd.format("MM, yy, dd"));
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
System.out.println(dtf.format(lcd)) ;

LocalDate start = LocalDate.of(2015, Month.MARCH,1);
LocalDate end = LocalDate.of(2015, Month.MAY,15);
long betwen = ChronoUnit.DAYS.between(start, end);

System.out.println("Between "+ Start + " and "+ end 
+ " is " + betwen + " days");
betwen= ChronoUnit.MONTHS.between(start,end);

System.out.println("Between "+ start + " and "+ end + "is"+betwen + " months ");



}
    
}