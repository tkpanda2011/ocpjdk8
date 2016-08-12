package advanced.java.date.andtime;

import java.time.LocalDate;
import java.time.Month;

public class MonthExample {

	public static void main(String[] args) {
		// information about the month
				LocalDate date = LocalDate.of(2014, 2, 15); // 2014-06-15
				Month february = date.getMonth(); // FEBRUARY
				int februaryIntValue = february.getValue(); // 2
				int minLength = february.minLength(); // 28
				int maxLength = february.maxLength(); // 29
				Month firstMonthOfQuarter = february.firstMonthOfQuarter(); // JANUARY

	}

}
