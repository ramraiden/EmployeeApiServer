package com.mainproject.middleware.backend.service;

import java.util.List;

import com.mainproject.middleware.backend.model.Employee;

public interface EmployeeService {
	public List<Employee> getEmployeeList();
	public Employee getEmployee(int empId);
	public boolean addEmployee(Employee emp);
	public boolean updateEmployee(Employee emp);
	public boolean deleteEmployee(int empId);
	public Employee findById(int empId);

}
