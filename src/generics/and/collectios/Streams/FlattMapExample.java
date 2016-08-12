package generics.and.collectios.Streams;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import advanced.java.util.Utility;

public class FlattMapExample {

	public static void main(String[] args) {
		
	
	
		List<String> allFullName = Utility.getDepartments().stream()
				.flatMap(employees -> employees.getEmployees().stream()).map(emp -> emp.getFirstName().concat(" ").concat(emp.getLastName())).collect(Collectors.toList());
		
		System.out.println(allFullName);
		
		//above List Contains Duplicates also u can reduce using a Set collector 
 
		
			Set<String> alllocations = Utility.getEmployeesList().stream().flatMap(locations -> locations.getLocations().stream()).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(alllocations);
		
		
	}

}
