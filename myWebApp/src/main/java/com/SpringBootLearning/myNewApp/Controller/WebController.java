package com.SpringBootLearning.myNewApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootLearning.myNewApp.Entity.Employee;
import com.SpringBootLearning.myNewApp.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class WebController {
	
	
	private EmployeeService employeeService;
	
	@Autowired
	public WebController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@GetMapping("/")
	public String getHome(){
		return "hello";
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmp(){
		return employeeService.getEmployees();
	}
	
	
	@GetMapping("/employee/{empid}")
	public Employee getempbyid(@PathVariable int empid ) {
		
		Employee emp= employeeService.findById(empid);
		
		if(emp==null) {
			throw new RuntimeException("the given id :"+empid+" is not valid");
		}
		return emp;
	}
	
	@PutMapping("/employee")
	public void updateEmp(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
		
	}
	
	@PostMapping("/employee")
	public Employee saveemp(@RequestBody Employee emp){
		
		emp.setId(0);
		employeeService.saveEmployee(emp);
		
		return emp;
	}
		
	@DeleteMapping("/employee/{deleteId}")
	public String deleteEmpbyid(@PathVariable int deleteId ) {
		
		employeeService.deleteEmployee(deleteId);
		 
		 return "The current employee with this id has been deleted: "+deleteId;
	}	
	
}
