package advanced.java.date.andtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDuration {

	public static void main(String[] args) {
		Period period = Period.between(LocalDate.of(2016,05,23), LocalDate.of(2017, 07, 25));
		System.out.println(period);
		
		Duration duration = Duration.between(LocalDateTime.of(2016,05,23, 15, 00), LocalDateTime.of(2016,05,22,15,11));
		
		System.out.println(duration);
	}

}
