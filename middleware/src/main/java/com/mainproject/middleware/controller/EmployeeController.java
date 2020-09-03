package com.mainproject.middleware.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mainproject.middleware.backend.model.Employee;
import com.mainproject.middleware.backend.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Employee> showEmployee(ModelMap emp_model){
		List<Employee> emp = new ArrayList<Employee>();
		emp = empService.getEmployeeList();
		System.out.println("EmployeeController:showEmployee - Employees are " + emp.toString());
		return emp;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	@CrossOrigin(origins = "http://localhost:4200")
	public Employee[] showTest(){
		System.out.println("EmployeeController:showTest - retrieving an employee details for api testing.");
		Employee[] emp_arr = new Employee[1];
		Employee emp_add = new Employee();
		emp_add.setFirstName("World");
		emp_add.setLastName("last_name");
		emp_add.setId(4);
		emp_arr[0] = emp_add;
		return emp_arr;
	}
	
	/**
	 * Add More Methods Below to support Remove, Addition of Employee to the employee table
	 */
	}
