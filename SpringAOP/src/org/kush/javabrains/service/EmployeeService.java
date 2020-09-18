package org.kush.javabrains.service;

import org.kush.javabrains.model.Employee;

public class EmployeeService {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
		}

	public void setEmployee(Employee employee) {
		this.employee = employee;
		System.out.println("Employee Service set method");
	}
	
	public void getDummy() {
		System.out.println("EmployeeService dummy method");
	}
	
}
