import java.time.LocalDate;

/**
 * Demo0219
 */
public class Demo0219 {

    public static void AboutLocalDate() {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
        int year = newYearsEve.getYear();
        int month = newYearsEve.getMonthValue();
        int day = newYearsEve.getDayOfMonth();
        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        year=aThousandDaysLater.getYear();
        month=aThousandDaysLater.getMonthValue();
        day=aThousandDaysLater.getDayOfMonth();
        System.out.println(year+"-"+month+"-"+day);
    }

    public static void main(final String[] args) {
       AboutLocalDate();
    }
}
