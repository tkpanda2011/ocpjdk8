package generics.and.collectios.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import advanced.java.util.Utility;
import generics.and.collectios.ComparableComparator.Employee;

public class FlattMapExample {

	public static void main(String[] args) {
		
		// Here i want to collect all the employees from all the departments 
		List<Employee> allEmployees = Utility.getDepartments().stream()
				.flatMap(dept -> dept.getEmployees().stream())  // flatmap collects to a single stream
				.collect(Collectors.toList());
	
		// Here i want to collect Full name of all the employees
		List<String> allFullName = Utility.getDepartments().stream()
				.flatMap(dept -> dept.getEmployees().stream())
				.map(emp -> emp.getFirstName().concat(" ").concat(emp.getLastName()))
				.collect(Collectors.toList());
		
		System.out.println(allFullName);
		
		//above List Contains Duplicates also u can reduce using a Set collector 
 
		// retrieve all the preferred locations of all the employees
			Set<String> alllocations = Utility.getEmployeesList().stream()
					.flatMap(employee -> employee.getLocations().stream())
					.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(alllocations);
		

//What will the following code print when compiled and run?


    Stream<List<String>> s1 = Stream.of(
                Arrays.asList("a", "b"),
                Arrays.asList("a", "c")
        );

    Stream<String> news = s1.filter(s->s.contains("c"))
            .flatMap(olds -> olds.stream());
    news.forEach(System.out::print);


	}

}
