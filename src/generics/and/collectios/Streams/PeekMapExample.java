package generics.and.collectios.Streams;

import java.util.List;
import java.util.stream.Collectors;

import advanced.java.util.Utility;

public class PeekMapExample {

	public static void main(String[] args) {
		
		// get the Employees firstName in upper case whose age is above 20
		// peek is used for debugging purpose and can be an intermediate option
		List<String> filterd =	Utility.getEmployeesList().stream().filter(e -> e.getAge() >20)
		.peek( e -> System.out.println(""+e.getAge())).map(e -> e.getFirstName().toUpperCase()).collect(Collectors.toList());
		
		System.out.println(filterd);

	}

}
