package advanced.java.date.andtime;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Instant instant = Instant.ofEpochSecond(180);// 1970-01-01T00:03:00Z 3 minutes more from epoch date
		System.out.println(""+instant.plus(Duration.ofHours(20).plusMinutes(30))); // will add 20hrs and 3mins to epoch date
		System.out.println("dates minus"+instant.minus(5, ChronoUnit.DAYS)); // reduces 5 days from epoh date 
		System.out.println("Date afet minus "+instant.minus(Duration.ofDays(5)));  // another way to reduce the time 
		
		
		Instant currentInstant = Instant.now();
		System.out.println("Instant now "+currentInstant.isBefore(instant));
		
		Instant instant2 = Instant.ofEpochSecond(180);
		
		System.out.println("Instant are immutable so instant==instant2  "+String.valueOf(instant==instant2));
		
		System.out.println("Instant are immutable so instant==instant2  "+instant.equals(instant2));
		
	}

}
