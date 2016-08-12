package generics.and.collectios.ComparableComparator;

import java.util.List;



public class Employee implements Comparable<Employee> {
	
	private Integer sal;
	private Integer age;
	private String firstName;
	private String lastName;
	private String gender;
	private String grade;
	private List<String> locations;
	
	public Employee(Integer sal,String firstName, String lastName, String grade) {
		this.sal = sal;
		this.firstName = firstName; 
		this.lastName = lastName;
		this.grade = grade;
	}
	
	public Employee(Integer sal,Integer age,String gender,String firstName, String lastName) {
		this.sal = sal;
		this.gender = gender;
		this.firstName = firstName; 
		this.lastName = lastName;
		this.age = age;
	}
	
	
	
	public Integer getAge() {
		return age;
	}




	public List<String> getLocations() {
		return locations;
	}

	public void setLocations(List<String> locations) {
		this.locations = locations;
	}

	public void setAge(Integer age) {
		this.age = age;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public Integer getSal() {
		return sal;
	}

	public Integer setSal(Integer sal) {
		this.sal = sal;
		return sal;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public int compareTo(Employee otherEmployee) {
		return this.firstName.compareTo(otherEmployee.firstName);
		
	}
	@Override
	public String toString() {
		return "Employee [sal=" + sal + ", firstName=" + firstName + ", lastName=" + lastName + ", grade=" + grade +", gender=" + gender
				+ "]";
	}
	

}
