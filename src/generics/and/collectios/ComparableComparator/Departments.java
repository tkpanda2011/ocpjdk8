package generics.and.collectios.ComparableComparator;

import java.io.Serializable;
import java.util.List;

public class Departments implements Comparable<Departments> , Serializable {
	private String departmentId;
	private String departmentName;
	private List<Employee> employees;
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Departments(String departmentId, String departmentName, List<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employees = employees;
	}
	@Override
	public int compareTo(Departments o) {
		// TODO Auto-generated method stub
		return this.departmentId.compareToIgnoreCase(o.departmentName);
	}
	
	
	
}
