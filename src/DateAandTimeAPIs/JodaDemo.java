package DateAandTimeAPIs;

import java.time.*;
import java.util.Date;
import java.util.Locale;

public class JodaDemo {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        d.setHours(21);
        System.out.println(d);
        LocalDate dt=LocalDate.now();
        System.out.println(dt);
        LocalDate dt1=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(dt1);

        LocalDate dt2=LocalDate.ofEpochDay(1);
        System.out.println(dt2);

        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalTime t1=t.minusHours(3);
        System.out.println(t1);

        LocalDateTime dd=LocalDateTime.now();
        System.out.println(dd);

    }
}
