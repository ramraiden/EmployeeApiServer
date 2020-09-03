package com.mainproject.middleware.backend.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mainproject.middleware.backend.model.Employee;
@Repository("employeeDao") 
@CrossOrigin(origins = "http://localhost:4200")
@Transactional

public class DAOImplementation implements EmployeeDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		org.hibernate.Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
		List<Employee> emps = new ArrayList<Employee>();
		emps = (List<Employee>) sessionFactory.getCurrentSession().createQuery("from Employee").list();
		transaction.commit();
		return emps;
		
	}

	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return (Employee) sessionFactory.getCurrentSession().createQuery("from employee");
	}

	public boolean addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Transaction");

			org.hibernate.Transaction transaction = sessionFactory.getCurrentSession().beginTransaction();
			System.out.println("DAO = Adding");
			sessionFactory.getCurrentSession().save(emp);
			transaction.commit();
			return true;
		}
		
		catch(Exception e) {
		e.printStackTrace();
		
		return false;
	}
	}

	public boolean updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().update(emp);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	
	
		
	}

	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println("inside dao deleteemployee");
			sessionFactory.getCurrentSession().delete(findById(empId));
			return false;	
		}
		catch(Exception e)
		{
			return false;
		}

		
	}

	public Employee findById(int empId) {
		return(Employee)sessionFactory.getCurrentSession().createQuery("from Employee where id");
		
	}

}
