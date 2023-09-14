package com.springmvc.model;

public class Employee {
	private Long employeeId;
	private String employeeEmail;
	private String employeeName;
	private String employeePassword;
	private String employeeCourse;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	public String getEmployeeCourse() {
		return employeeCourse;
	}
	public void setEmployeeCourse(String employeeCourse) {
		this.employeeCourse = employeeCourse;
	}
	public Employee(Long employeeId, String employeeEmail, String employeeName, String employeePassword,
			String employeeCourse) {
		super();
		this.employeeId = employeeId;
		this.employeeEmail = employeeEmail;
		this.employeeName = employeeName;
		this.employeePassword = employeePassword;
		this.employeeCourse = employeeCourse;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeEmail=" + employeeEmail + ", employeeName="
				+ employeeName + ", employeePassword=" + employeePassword + ", employeeCourse=" + employeeCourse + "]";
	}
	
	
}
