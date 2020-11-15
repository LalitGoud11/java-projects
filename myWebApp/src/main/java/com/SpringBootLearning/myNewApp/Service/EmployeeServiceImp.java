package com.SpringBootLearning.myNewApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBootLearning.myNewApp.Dao.Dao;
import com.SpringBootLearning.myNewApp.Entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private Dao dao;
	
	@Override
	@Transactional
	public List<Employee> getEmployees() {
		
		return dao.getEmployees();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		
		return dao.findById(id);
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		
		dao.deleteEmployee(id);
	}

	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		
		dao.saveEmployee(employee);
		
	}

	@Override
	@Transactional
	public void updateEmployee(Employee employee) {
		
		dao.updateEmployee(employee);
		
	}
	
	
}
