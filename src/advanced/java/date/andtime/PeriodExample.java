package advanced.java.date.andtime;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		Period period = Period.between(LocalDate.of(2016,05,23), LocalDate.of(2017, 07, 25));
		System.out.println(period);
		System.out.println("Period of "+period.toTotalMonths());
		//P1Y2M2D   Period of One year 2 Months 2 Days
			
		System.out.println(period.minusDays(1));
		
		System.out.println("After some time"+LocalDate.now().plus(period));
	}

}
