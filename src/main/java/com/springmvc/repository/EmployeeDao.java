package com.springmvc.repository;

import com.springmvc.model.Employee;

public interface EmployeeDao {
	public boolean addEmployee(Employee employee);

	public Employee searchEmployee(Long employeeId);
}
