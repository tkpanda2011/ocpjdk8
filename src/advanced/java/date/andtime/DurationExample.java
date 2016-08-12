package advanced.java.date.andtime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {
		Duration duration = Duration.of(2, ChronoUnit.MINUTES);
		System.out.println(duration);
		System.out.println(LocalDateTime.now().plus(duration));
		
	}

}
