package generics.and.colections.ClassesDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import advanced.java.util.Utility;

public class ArrayListDem {

	public static void main(String[] args) {
		List<String> listOfString = new ArrayList<>();
		listOfString.addAll(Utility.getDepartments().stream()
				.filter(dept -> "HR".equalsIgnoreCase(dept.getDepartmentName()))
				.flatMap(newDept -> newDept.getEmployees().stream().flatMap(emp -> emp.getLocations().stream()))
				.collect(Collectors.toList()));
		
		System.out.println(listOfString);
	}

}
