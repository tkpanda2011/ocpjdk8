package advanced.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import advanced.java.model.Department;
import advanced.java.model.Employee;
import advanced.java.model.Job;

public class JDBCConnect {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println(new Gson().toJson(getAllEmployees()));

	}

	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 *             /** EMPLOYEE_ID FIRST_NAME LAST_NAME EMAIL PHONE_NUMBER
	 *             HIRE_DATE JOB_ID SALARY COMMISSION_PCT MANAGER_ID
	 *             DEPARTMENT_ID
	 */

	public static List<Employee> getAllEmployees() throws ClassNotFoundException {

		List<Employee> emps = new ArrayList<>();
		Employee emp = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		try (
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
						"HR","0805236020");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEES");) {
			
			while (rs.next()) {
				emp = new Employee();

				emp.setEmployeeId(rs.getLong("EMPLOYEE_ID"));
				emp.setCommissionPct(rs.getBigDecimal("COMMISSION_PCT"));
				emp.setFirstName(rs.getString("FIRST_NAME"));
				emp.setLastName(rs.getString("FIRST_NAME"));
				emp.setEmail(rs.getString("FIRST_NAME"));
				emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
				emp.setHireDate(rs.getDate("HIRE_DATE"));
				emp.setSalary(rs.getBigDecimal("SALARY"));
				String jobId = rs.getString("JOB_ID");
				String departmentId = rs.getString("DEPARTMENT_ID");
				emp.setDepartment(getDepartment(conn, departmentId));
				emp.setJob(getJob(conn, jobId));
				String managerId = rs.getString("MANAGER_ID");
				emp.setManager(getManager(managerId, conn));
				emps.add(emp);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emps;

	}

	private static Employee getManager(String managerId, Connection conn) throws SQLException {
		Employee emp = new Employee();
		if (null != managerId && managerId.length() > 0) {
			System.out.println("Looking For "+managerId+"'s Manager");
			try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID=?");){
			
			ps.setString(1, managerId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				populateEmpFromResultSet(emp, rs, conn);
			}
		} catch (Exception e ) {
			System.out.println("Bigger Exception");
		}
		
		}
		return emp;
	}

	/**
	 * 
	 * @param emp
	 * @param rs
	 * @param conn
	 * @throws SQLException
	 */
	private static void populateEmpFromResultSet(Employee emp, ResultSet rs, Connection conn) throws SQLException {

		emp.setEmployeeId(rs.getLong("EMPLOYEE_ID"));
		
		emp.setCommissionPct(rs.getBigDecimal("COMMISSION_PCT"));
		emp.setFirstName(rs.getString("FIRST_NAME"));
		emp.setLastName(rs.getString("LAST_NAME"));
		emp.setEmail(rs.getString("EMAIL"));
		emp.setPhoneNumber(rs.getString("PHONE_NUMBER"));
		emp.setHireDate(rs.getDate("HIRE_DATE"));
		emp.setSalary(rs.getBigDecimal("SALARY"));
		String jobId = rs.getString("JOB_ID");
		String departmentId = rs.getString("DEPARTMENT_ID");
		emp.setDepartment(getDepartment(conn, departmentId));
		emp.setJob(getJob(conn, jobId));
		String managerId = rs.getString("MANAGER_ID");
		// emp.setManager(getManager(managerId,conn));
	}

	/**
	 * 
	 * @param conn
	 * @param jobId
	 * @return
	 * @throws SQLException
	 */
	private static Job getJob(Connection conn, String jobId) throws SQLException {
		Job job = new Job();
		if (null != jobId) {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM JOBS WHERE JOB_ID=?");
			ps.setString(1, jobId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				populateJobFromResultSet(job, rs, conn);
			}
		}
		return job;
	}

	/**
	 * @author TRIPATIKUMAR
	 * @param job
	 * @param rs
	 * @param conn
	 * @throws SQLException
	 */
	private static void populateJobFromResultSet(Job job, ResultSet rs, Connection conn) throws SQLException {
		job.setJobId(rs.getString("JOB_ID"));
		job.setJobTitle(rs.getString("JOB_TITLE"));
		job.setMaxSalary(rs.getBigDecimal("MAX_SALARY"));
		job.setMinSalary(rs.getBigDecimal("MIN_SALARY"));

	}

	/**
	 * 
	 * @param conn
	 * @param departmentId
	 * @return
	 * @throws SQLException
	 */
	private static Department getDepartment(Connection conn, String departmentId) throws SQLException {
		Department department = null;
		if (null != departmentId && departmentId.length() >0) {
			try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_id=?");) {
				ps.setString(1, departmentId);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					department = new Department();
					populateDepartMentFromResultSet(department, rs, conn);
				}
			} catch (Exception e) {
				System.out.println("Departmnt Id"+departmentId);
				System.out.println("Exception "+e);
			}

		}
		return department;
	}
	
	/**
	 * 
	 * @param department
	 * @param rs
	 * @param conn
	 * @throws SQLException
	 */
	private static void populateDepartMentFromResultSet(Department department, ResultSet rs, Connection conn)
			throws SQLException {
		department.setDepartmentId(rs.getLong("DEPARTMENT_ID"));
		department.setDepartmentName(rs.getString("DEPARTMENT_NAME"));

	}
}
