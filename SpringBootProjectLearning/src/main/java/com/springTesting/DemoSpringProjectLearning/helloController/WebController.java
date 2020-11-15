package com.springTesting.DemoSpringProjectLearning.helloController;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springTesting.DemoSpringProjectLearning.Entity.CustomerDetails;
import com.springTesting.DemoSpringProjectLearning.service.CustomerDetailsService;

@Controller
@RequestMapping("DemoApp")
public class WebController {
	
	@Autowired
	private CustomerDetailsService service;
	
	@GetMapping("/helloC")
	public @ResponseBody String hello() {
		//checkConnection();
		return "hellooooo";
	}
	
	@GetMapping("/customerId/{ID}")
	public @ResponseBody String customerData(@PathVariable ("ID") int id ) {
		
		return service.getcustomerdetails(id).toString();
	}
	
	public void checkConnection() {
		String JdbcUrl =
				"jdbc:mysql://localhost:3306/DemoSpringProjectLearning?useSSL=false&serverTimezone=UTC";
		String UserN ="Admin";
		String password ="password";
		
		
		try {
			System.out.println("Trying to connect to db");
			Connection con =DriverManager.getConnection(JdbcUrl,UserN,password);
			System.out.println("connected to db!!!!!");
			
		}
		catch(Exception exe) {
			System.out.println("--------");
			exe.printStackTrace();
		}

	}
}
