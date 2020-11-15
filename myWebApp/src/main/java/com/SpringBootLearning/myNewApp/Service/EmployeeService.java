package com.SpringBootLearning.myNewApp.Service;

import java.util.List;

import com.SpringBootLearning.myNewApp.Entity.Employee;


public interface EmployeeService {
	
	 List<Employee> getEmployees() ;

	 Employee findById(int id);
	 
	 void deleteEmployee(int id);

	 void saveEmployee(Employee employee);
	 
	 void updateEmployee(Employee employee);
}
