package com.mainproject.middleware.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mainproject.middleware.backend.dao.EmployeeDao;
import com.mainproject.middleware.backend.model.Employee;

@Service("employeeService")
public class EmployeeServiceImplementation implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;
	

	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeList();
	}

	public Employee getEmployee(int empId) {
		return employeeDao.getEmployee(empId);
	}

	public boolean addEmployee(Employee emp) {
		System.out.println("In Service");
		employeeDao.addEmployee(emp);
		return true;

	}

	public boolean updateEmployee(Employee emp) {
		employeeDao.addEmployee(emp);
		return true;

	}

	public boolean deleteEmployee(int empId) {
		employeeDao.deleteEmployee(empId);
		 return true;

	}

	public Employee findById(int empId) {
		 return employeeDao.findById(empId);
	}

}
