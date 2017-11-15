package advanced.java.date.andtime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class InstantLocalDateDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//What will the following code print when compiled and run?

Instant start = Instant.parse("2015-06-25T16:13:30.00z");
Instant startPlus = start.plus(10, ChronoUnit.HOURS);
System.out.println(start);


Duration timeToCook = Duration.ofHours(1);
Instant readyTime = start.plus(timeToCook);





LocalDateTime ltd = LocalDateTime.ofInstant(readyTime, ZoneId.of("GMT+5"));
System.out.println(ltd);

//All Date and Time operations are immutable everytime it returns a new object 

System.out.println("==========================With Returned Value ====================");

System.out.println(startPlus);
Instant readyTimestartPlus = startPlus.plus(timeToCook);
System.out.println(readyTimestartPlus);
LocalDateTime ltdreadyTimestartPlus = LocalDateTime.ofInstant(readyTimestartPlus, ZoneId.of("GMT+2"));
System.out.println(ltdreadyTimestartPlus);

	}

}
