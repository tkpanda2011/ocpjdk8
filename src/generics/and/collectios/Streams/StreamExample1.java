package generics.and.collectios.Streams;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import advanced.java.util.CommoPredicates;
import advanced.java.util.Utility;
import generics.and.collectios.ComparableComparator.Employee;

public class StreamExample1 {

	public static void main(String[] args) {
		Predicate<? super Employee> empSimplePredicate = p -> p.getSal() <501;
		
		System.out.println(Utility.getEmployeesSet().stream().allMatch(empSimplePredicate ));
		
		
		/**
		 * Utility.getEmployeesSet().stream().filter(CommoPredicates.isMale()) is used to filter the stream .
		 * .collect used to collect the elements from the stream 
		 */
		System.out.println(Utility.getEmployeesList().stream().filter(CommoPredicates.isMale()).collect(Collectors.<Employee>toList()));
		
		/**
		 * Counts the elments in the filtered stream 
		 */
		
		System.out.println(Utility.getEmployeesList().stream().filter(CommoPredicates.isAudult()).count());
		
		
		/*
		 * First Element of THe collection .
		 * Find any for any Element  
		 */
		Optional<Employee> firstElementOpt = Utility.getEmployeesList().stream().findFirst();
		
		System.out.println(firstElementOpt.get());
		
		System.out.println("First attemnt "+Utility.getEmployeesList().stream().findAny().get());
			
	
		//  Collect all the locations of every employee
		Set<String> locSet = new HashSet<>();
		Stream<Employee> stream = Utility.getEmployeesList().stream();
		stream.flatMap(emp -> emp.getLocations().stream()).forEach(b -> locSet.add(b));
		System.out.println("Local Set"+locSet);
		stream.findAny();
		
		
	
		
		

	}

}
