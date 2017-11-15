package generics.and.collectios.Streams;

import java.util.Comparator;

import advanced.java.util.Utility;
import generics.and.collectios.ComparableComparator.Employee;
import generics.and.collectios.ComparableComparator.EmployeeSalComparator;

public class ComparatorExample {

	public static void main(String[] args) {
		java.util.Comparator<Employee> empComp = (emp1,emp2) -> new EmployeeSalComparator().compare(emp1, emp2);
		Utility.getEmployeesList().stream().sorted().forEach(e -> System.out.println("Sorted as pername  "+e));
		// above peek can be used also // forEach a terminal method // invokes natural sorting  
		System.out.println("===============================================================================");
		Utility.getEmployeesList().stream().sorted(empComp).forEach(e -> System.out.println("Sorted as pername  "+e));
		
		//custom sorting passing comparator
		
		System.out.println("===============================================================================");
		
		Utility.getEmployeesList().stream().sorted(empComp.thenComparing((e1,e2) -> e1.compareTo(e2))).forEach(e -> System.out.println("Sorted as pername  "+e));
		
		// Chaining using thenComparing
		
Utility.getEmployeesList().stream().sorted(empComp.thenComparing((e1,e2) -> e1.getLastName().compareTo(e2.getLastName()))).forEach(e -> System.out.println("Sorted as pername  "+e));
	

//Utility.getEmployeesList().stream().sorted(Comparator.comparing(q-> q.
		// Chaining using thenComparing
	}

}
