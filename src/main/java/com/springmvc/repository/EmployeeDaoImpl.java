package com.springmvc.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springmvc.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean addEmployee(Employee employee) {
		String query = "INSERT INTO employee(\r\n" + "	id, email, name, password, course)\r\n"
				+ "	VALUES (?, ?, ?, ?, ?)";
		int update = this.jdbcTemplate.update(query, employee.getEmployeeId(), employee.getEmployeeEmail(),
				employee.getEmployeeName(), employee.getEmployeePassword(), employee.getEmployeeCourse());

		return update == 1 ? true : false;
	}

	public Employee searchEmployee(Long employeeId) {
		String query = "select * from employee where id=?";
		Employee employee=null;
		RowMapper<Employee> rowMapper = (rs, rowNum) -> {
			Employee emp = new Employee();
			emp.setEmployeeId(rs.getLong(1));
			emp.setEmployeeEmail(rs.getString(2));
			emp.setEmployeeName(rs.getString(3));
			emp.setEmployeePassword(rs.getString(4));
			emp.setEmployeeCourse(rs.getString(5));
			return emp;
		};
		  employee = this.jdbcTemplate.queryForObject(query, rowMapper, employeeId);
		 return employee;
	}
}
