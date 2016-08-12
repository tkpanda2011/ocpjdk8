package generics.and.collectios.ComparableComparator;

import java.util.Comparator;

public class EmployeeSalComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee firstEmployee, Employee secondEmployee) {
		return firstEmployee.getSal().compareTo(secondEmployee.getSal());
	}

}
