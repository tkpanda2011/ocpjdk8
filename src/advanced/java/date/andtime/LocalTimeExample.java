package advanced.java.date.andtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		

		// time information
		LocalTime time = LocalTime.of(15, 35,00,200); // 15:30:00
		int hour = time.getHour(); // 15
		int second = time.getSecond(); // 0
		int minute = time.getMinute(); // 30
		int secondOfDay = time.toSecondOfDay(); // 55800
		LocalTime time2 = LocalTime.now(); // 15:30:00
		System.out.println(time2.atDate(LocalDate.now()));
		
		System.out.println(time2.truncatedTo(ChronoUnit.HALF_DAYS));
		System.out.println(time2.isSupported(ChronoUnit.ERAS));
		
		System.out.println(time2.isSupported(ChronoUnit.HALF_DAYS));
		
		System.out.println(time2.parse("15:23"));
		
		System.out.println(LocalTime.of(01, 10,20).getSecond());

	}

}
