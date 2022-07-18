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
        


        // M-3
        // System.out.println(TimeZone.getTimeZone("Asia/Kolkata"));
        // Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata")); // Calender is abstract class

        // System.out.println(c.getCalendarType());    // gregory
        // System.out.println(c.getTimeZone());        // Asia/Kolkata
        // System.out.println(Calendar.DATE);          // 5
        // System.out.println(c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR));        // 18/6/2022
        // System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));     // 11:28:12


        
        // M-4  
        // GregorianCalendar cal =new GregorianCalendar();
        // System.out.println(cal.isLeapYear(2022));   // false
        // System.out.println(cal.get(GregorianCalendar.DATE)+"/"+cal.get(GregorianCalendar.MONTH)+"/"+cal.get(GregorianCalendar.YEAR));       // 18/6/2022
        // System.out.println(cal.get(GregorianCalendar.HOUR)+":"+cal.get(GregorianCalendar.MINUTE)+":"+cal.get(GregorianCalendar.SECOND));    // 11:30:36

        

        // M-5

        // System.out.println(LocalDate.now());        // 2022-07-18   
        // System.out.println(LocalTime.now());        // 11:32:31.200918
        // System.out.println(LocalDateTime.now());    // 2022-07-18T11:32:31.201053


        // --- DateTimeFormatter
        // LocalDate ld = LocalDate.now();
        // DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy - E");
        // System.out.println(ld.format(df));      // 18/07/2022 - Mon
        // System.out.println(ld.format(DateTimeFormatter.ISO_DATE));    // 2022-07-18
    }
}