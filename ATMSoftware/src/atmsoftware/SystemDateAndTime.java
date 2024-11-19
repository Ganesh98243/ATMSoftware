package atmsoftware;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemDateAndTime {
           public static String getDateTime() {
        	   DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        	   LocalDateTime ldt=LocalDateTime.now();
        	   return ldt.format(dtf);
		}
}
