package generics.and.collectios.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import advanced.java.util.Utility;
import generics.and.collectios.ComparableComparator.Employee;

public class CollectorsExample {
	
	/*
	 * Streams have the following method:

	collect(Collector<? super T,A,R> collector)
	collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
	
	A collect operation requires three functions:

	A supplier function to construct new instances of the result container
	An accumulator function to incorporate an input element into a result container
	A combining function to merge the contents of one result container into another.
	
	In fact, streams also have the following method that takes the above functions to create our own collect operations:
	 */
	public static void main(String[] args) {
		
	List<Employee>	emps =Utility.getEmployeesList().stream().filter( emp -> emp.getFirstName().startsWith("A"))
		.collect(()-> new ArrayList<>(), (c,s) -> c.add(s), (c1,c2)-> c1.addAll(c2));
	
		System.out.println(emps);
		
		List<Employee>	emps2 =Utility.getEmployeesList().stream().filter( emp -> emp.getFirstName().startsWith("A"))
				.collect(Collectors.toList());
		
		System.out.println(emps2);
		
		Set<Employee> empSet = Utility.getEmployeesList().stream().filter( emp -> emp.getFirstName().startsWith("A"))
				.collect(Collectors.toCollection(TreeSet::new));
		
		System.out.println(empSet);
		
		/*Set<Employee> empJoin = Utility.getEmployeesList().stream().filter( emp -> emp.getFirstName().startsWith("A"))
				.collect(Collectors.joining("/"));
		
		
		// check joining and partition by 
		System.out.println(empSet);*/
				
	}

}
