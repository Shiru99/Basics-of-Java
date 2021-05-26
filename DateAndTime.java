import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateAndTime{
    public static void main(String[] args) {

        // M-1
        // System.out.println(System.currentTimeMillis());  // 1621996420683 - Milli seconds from 1970 to now
        // System.out.println(1970+System.currentTimeMillis()/1000/3600/24/365); // 2021

        // M-2
        // Date d = new Date();
        // System.out.println(d);                      // Wed May 26 08:03:40 IST 2021
        // System.out.println(d.getTime());            // 1621996420684

        // System.out.println(d.getDate()+"/"+d.getMonth()+"/"+(1900+d.getYear()));    // year From 1900
        // System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
        



        // System.out.println(TimeZone.getTimeZone("Asia/Kolkata"));



        // M-3
        // Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata")); // Calender is abstract class

        // System.out.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        // System.out.println(Calendar.DATE);
        // System.out.println(c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));   
        // System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        // M-4  
        // GregorianCalendar cal =new GregorianCalendar();
        // System.out.println(cal.isLeapYear(2021));

        // System.out.println(cal.get(GregorianCalendar.DATE)+"/"+cal.get(GregorianCalendar.MONTH)+"/"+cal.get(GregorianCalendar.YEAR));   
        // System.out.println(cal.get(GregorianCalendar.HOUR)+":"+cal.get(GregorianCalendar.MINUTE)+":"+cal.get(GregorianCalendar.SECOND));

        

        // M-5

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();         // Nano-seconds
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);


        // --- DateTimeFormatter

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy - E");
        System.out.println(ld.format(df));
        System.out.println(ld.format(DateTimeFormatter.ISO_DATE));
    }
}