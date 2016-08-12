package advanced.java.date.andtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.temporal.ChronoUnit;

public class LocalDateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalDate date2 = LocalDate.now();
		
		LocalDateTime startOfDay = date2.atStartOfDay(); // 2014-02-15 00:00
		
		
		LocalDate date = LocalDate.of(2014, 2, 15); // 2014-06-15
		boolean isBefore = LocalDate.now().isBefore(date); // false
		
		// information about the year
		int year = date.getYear(); // 2014
		int dayOfYear = date.getDayOfYear(); // 46
		int lengthOfYear = date.lengthOfYear(); // 365
		boolean isLeapYear = date.isLeapYear(); // false
		System.out.println(OffsetTime.MIN);
		System.out.println(date2.atTime(OffsetTime.MIN));
		
		System.out.println(date.minus(5,ChronoUnit.DAYS));
		
		System.out.println(date.minus(Duration.ofDays(5)));
		
		
		
		
	
		
	}

}
