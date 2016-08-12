package generics.and.collectios.Filters;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import advanced.java.util.Utility;
import generics.and.collectios.ComparableComparator.Employee;

public class FilterExample {

	public static void main(String[] args) {
	List<Employee> emps=	Utility.getEmployeesList().stream().filter(emp -> emp.getFirstName().startsWith("A")).collect(Collectors.toList());
	
	System.out.println("EMployees "+emps);

	List<Employee> empofLoc=	Utility.getEmployeesList().stream().filter(emp -> {
		
		  return emp.getLocations().contains("BANGALORE");
		
	}).collect(Collectors.toList());
	
	System.out.println(empofLoc);
	
Predicate<Employee> startsWith = p -> p.getFirstName().startsWith("A");
Predicate<Employee> endsWith = p -> p.getFirstName().endsWith("H");
	

List<Employee> empsMul= Utility.getEmployeesList().stream().filter(startsWith.or(endsWith)).collect(Collectors.toList());
	System.out.println("EMployees "+empsMul);

}
	}
