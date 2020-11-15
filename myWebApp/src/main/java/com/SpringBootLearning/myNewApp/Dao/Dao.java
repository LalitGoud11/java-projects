package com.SpringBootLearning.myNewApp.Dao;

import java.util.List;

import com.SpringBootLearning.myNewApp.Entity.Employee;



public interface Dao {
	
	 List<Employee> getEmployees() ;

	 Employee findById(int id);
	 
	 void deleteEmployee(int id);

	 void saveEmployee(Employee employee);
	 
	 void updateEmployee(Employee employee);
}
