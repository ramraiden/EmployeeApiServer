package com.mainproject.middleware.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable{
	
	
	
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	   @Column(name = "id")
	   private int id;

	   @Column(name = "first_name")
	   private String firstName;

	   @Column(name = "last_name")
	   private String lastName;

	   @Column(name = "salary")
	   private int salary;  

	   public Employee() {}
	   
	   public int getId() {
	      return id;
	   }
	   
	   public void setId( int id ) {
	      this.id = id;
	   }
	   
	   public String getFirstName() {
	      return firstName;
	   }
	   
	   public void setFirstName( String first_name ) {
	      this.firstName = first_name;
	   }
	   
	   public String getLastName() {
	      return lastName;
	   }
	   
	   public void setLastName( String last_name ) {
	      this.lastName = last_name;
	   }
	   
	   public int getSalary() {
	      return salary;
	   }
	   
	   public void setSalary( int salary ) {
	      this.salary = salary;
	   }
	   
	   
	}

