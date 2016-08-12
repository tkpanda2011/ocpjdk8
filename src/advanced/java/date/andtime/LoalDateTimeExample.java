package advanced.java.date.andtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LoalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime zoneIdDateTime = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
		LocalDateTime timeOf = LocalDateTime.of(LocalDate.now(), LocalTime.of(13, 40, 23));
		
		System.out.println("Current Time "+dateTime);
		System.out.println("Zone  Time "+zoneIdDateTime);
		System.out.println("Custom  Time "+timeOf);
		System.out.println(ZoneId.systemDefault());
		System.out.println(ZoneId.of("Asia/Dili"));
		
		
		System.out.println(""+dateTime.isBefore(zoneIdDateTime));
		
		System.out.println(""+dateTime.minusDays(2));
		
		System.out.println(ChronoUnit.HOURS.between(dateTime, zoneIdDateTime));
		System.out.println(ChronoUnit.MINUTES.between(dateTime, zoneIdDateTime));
		System.out.println(ChronoUnit.WEEKS.between(dateTime, zoneIdDateTime));
	}

}
