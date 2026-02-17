package DateAandTimeAPIs;

import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println(zdt);

        ZonedDateTime zdt1=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(zdt1);

        OffsetDateTime odt=OffsetDateTime.now();
        System.out.println(odt);
        System.out.println(odt.withMinute(30));

        MonthDay md=MonthDay.now();
        System.out.println(md);

        Period p=Period.of(2,3,12);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i=Instant.now();
        System.out.println(i);
    }
}
