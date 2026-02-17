package DateAandTimeAPIs;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();

        System.out.println(gc.isLeapYear(2020));
        System.out.println(gc.get(Calendar.MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        TimeZone tz=gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());

        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz2=gc.getTimeZone();
        System.out.println(tz2.getID());
    }
}
