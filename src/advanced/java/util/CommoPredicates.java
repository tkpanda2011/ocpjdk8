package advanced.java.util;

import java.util.function.Predicate;

import generics.and.collectios.ComparableComparator.Employee;

public class CommoPredicates {
	
	public static  Predicate<? super Employee> isMale() {
		return p -> "M".equalsIgnoreCase(p.getGender());
	}
	
	public static  Predicate<? super Employee> isAudult() {
		return p -> p.getAge() > 18;
	}
}
