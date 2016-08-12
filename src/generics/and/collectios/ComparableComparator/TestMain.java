package generics.and.collectios.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(100,"Tripati","Panda","A");
		Employee emp2 = new Employee(200,"Balaji","Acharya","A");
		Employee emp3 = new Employee(300,"Lokanath","Mohanty","A");
		Employee emp4 = new Employee(400,"Gopal","Panda","A");
		Set<Employee> names = new TreeSet<>();
		names.add(emp1);
		names.add(emp2);
		names.add(emp3);
		names.add(emp4);
		System.out.println(names);
		
		List<Employee> emps = new ArrayList<Employee>(names);
		Collections.sort(emps, new EmployeeSalComparator());
		
		System.out.println(emps);
	}

}
