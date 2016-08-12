package generics.and.collectios.Streams;

import java.util.Optional;

import advanced.java.util.Utility;
import generics.and.collectios.ComparableComparator.Employee;

public class SearchMethods {

	public static void main(String[] args) {
		Optional<Employee> findFirst = Utility.getEmployeesList().stream().findFirst();
		Optional<Employee> findany = Utility.getEmployeesList().stream().findAny();
		
		
		boolean allMatch = Utility.getEmployeesList().stream().allMatch(e -> e.getAge() >20);
		boolean anyMatch = Utility.getEmployeesList().stream().anyMatch(e -> e.getAge() >20);
		
		boolean noneMatch = Utility.getEmployeesList().stream().noneMatch(e -> e.getAge() >2000000);
		
		
	}

}
