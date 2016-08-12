package advanced.java.date.andtime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekExample {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2014, 2, 15); // 2014-06-15
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayOfWeekIntValue = dayOfWeek.getValue(); // 6
		String dayOfWeekName = dayOfWeek.name(); // SATURDAY
		int dayOfMonth = date.getDayOfMonth(); // 15

	}

}
