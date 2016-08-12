package advanced.java.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import generics.and.collectios.ComparableComparator.Departments;
import generics.and.collectios.ComparableComparator.Employee;

public class Utility {
	public static Set<Employee> getEmployeesSet() {
		Employee emp1 = new Employee(100,"Tripati","Panda","A");
		Employee emp2 = new Employee(200,"Balaji","Acharya","A");
		Employee emp3 = new Employee(300,"Lokanath","Mohanty","A");
		Employee emp4 = new Employee(400,"Gopal","Panda","A");
		Set<Employee> names = new TreeSet<>();
		names.add(emp1);
		names.add(emp2);
		names.add(emp3);
		names.add(emp4);
		return names;
	}


public static List<Employee> getEmployeesList() {

Employee e1 = new Employee(200,23,"M","Rick","Beethovan");
e1.setLocations(Arrays.asList(new String[]{"HYDRABAD","BANGALORE","TRIVENDRUM"}));
Employee e2 = new Employee(200,13,"F","Aartina","Hengis");
e2.setLocations(Arrays.asList(new String[]{"BHUBANESWAR","BANGALORE","KOLKATA"}));
Employee e3 = new Employee(300,43,"M","Ricky","Martin");
e3.setLocations(Arrays.asList(new String[]{"ROURKELA","BERHAMPUR","CUTTACK"}));
Employee e4 = new Employee(400,26,"M","Jon","Lowman");
e4.setLocations(Arrays.asList(new String[]{"HYDRABAD","DURGAPUR","ASANSOL"}));
Employee e5 = new Employee(500,19,"F","Cristine","Maria");
e5.setLocations(Arrays.asList(new String[]{"HYDRABAD","LONDON","COCHIN"}));
Employee e6 = new Employee(600,15,"M","David","Feezor");
e6.setLocations(Arrays.asList(new String[]{"BHOPAL","CHENNAI","MADURAI"}));
Employee e7 = new Employee(700,68,"F","Melissa","Roy");
e7.setLocations(Arrays.asList(new String[]{"AHMADABAD","MUMBAI","GOA"}));
Employee e8 = new Employee(200,79,"M","Alex","Hussin");
e8.setLocations(Arrays.asList(new String[]{"LUCKNOW","NOIDA","DELHI"}));
Employee e9 = new Employee(900,15,"F","Neetu","Singh");
e9.setLocations(Arrays.asList(new String[]{"SURAT","SAMBALPUR","GUHWATI"}));
Employee e10 = new Employee(1000,45,"M","Raveen","Jain");
e10.setLocations(Arrays.asList(new String[]{"HYDRABAD","BANGALORE","CHENNAI"}));

Employee e11 = new Employee(200,23,"M","Rick","Beethovan");
e11.setLocations(Arrays.asList(new String[]{"HYDRABAD","BANGALORE","TRIVENDRUM"}));
Employee e22 = new Employee(200,13,"F","Aartina","Hengis");
e22.setLocations(Arrays.asList(new String[]{"BHUBANESWAR","BANGALORE","KOLKATA"}));
Employee e33 = new Employee(300,43,"M","Ricky","Martin");
e33.setLocations(Arrays.asList(new String[]{"ROURKELA","BERHAMPUR","CUTTACK"}));

List<Employee> names = new ArrayList<>();
names.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e22,e33}));
return names;
}

public static List<Departments> getDepartments() {
	
	List<Departments> departments = new ArrayList<>();
		
	departments.add( new Departments("DEPT01", "ACCOUNTING", getEmployeesList().stream().filter(emp -> emp.getFirstName().startsWith("A")).collect(Collectors.toList())));
	departments.add( new Departments("DEPT02", "HR", getEmployeesList().stream().filter(emp -> emp.getFirstName().startsWith("R")).collect(Collectors.toList())));
	departments.add( new Departments("DEPT03", "WOMEN", getEmployeesList().stream().filter(emp -> emp.getGender().equalsIgnoreCase("F")).collect(Collectors.toList())));
	return departments;
}
}