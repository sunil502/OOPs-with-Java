package DateAandTimeAPIs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        ZonedDateTime dt= ZonedDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z Z");
        System.out.println(df.format(dt));
    }
}
