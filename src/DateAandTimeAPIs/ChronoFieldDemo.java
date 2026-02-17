package DateAandTimeAPIs;

import javax.crypto.spec.PSource;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class ChronoFieldDemo {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt.get(ChronoField.ERA));
        System.out.println(dt.get(ChronoField.AMPM_OF_DAY));
        System.out.println(dt.get(ChronoField.YEAR));
        System.out.println(dt.get(ChronoField.MONTH_OF_YEAR));
    }

}
