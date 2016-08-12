package advanced.java.date.andtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatterExample {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.parse("2014/09/19 12:30:43", DateTimeFormatter.ofPattern("yyyy/MM/dd kk:mm:ss"));
		
		System.out.println(dateTime);
		System.out.println("ISO Format"+dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
		
		
		LocalDate date = LocalDate.parse("2014/09/19 12:30:43", DateTimeFormatter.ofPattern("yyyy/MM/dd kk:mm:ss"));
				System.out.println(date);
	}

}
