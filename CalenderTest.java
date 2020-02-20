/**
 * CalenderTest
 */
/* CalenderTest  日历表 */
import java.time.*;
public class CalenderTest {

    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();
        //minusDays 减去指定天数
        date= date.minusDays(today-1);//Set to start of month
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i < value; i++) 
            System.out.print("    ");
            while (date.getMonthValue()==month) //确定是否为当前月份，是则继续
            {
                System.out.printf("%3d",date.getDayOfMonth());//打印本月天数
                if (date.getDayOfMonth()==today) //判断是不是为今天
                    System.out.print("*");
                    else
                    System.out.print(" ");
                date = date.plusDays(1);
                if(date.getDayOfWeek().getValue()==1)System.out.println();
            }
            if(date.getDayOfWeek().getValue()!=1)System.out.println();
        
    }
}