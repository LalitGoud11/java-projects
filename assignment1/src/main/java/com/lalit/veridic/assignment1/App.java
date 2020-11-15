package com.lalit.veridic.assignment1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App 
{
	public static Scanner sc = new Scanner(System.in);
	
	
    public static void main( String[] args ) 
    {
    	String name;
    	int id;
    	int option;
    	
    	
      try( Connection con = DriverManager.getConnection
    		  ("jdbc:mysql://localhost:3306/verdic?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","rocky143");
    		  Statement stm = con.createStatement(); ) {
    	  
		System.out.println("connection established");		
		
		
		while(true) {
			
			System.out.println("Enter an option,for all options enter :0");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			case 0:
				showOptions();
				break;
			case 1:
				id=enterOptionOne();
				name =enterOptionTwo();
				stm.execute("insert into employee values(" + id + "," + "'"+  name +"'"+")");
				
				break;
			case 2:
				name =enterOptionTwo();
				stm.execute("DELETE FROM employee WHERE name = '" + name+ "'"+";");
				break;
			case 3:
				
				System.out.println("Enter a employeeID which you wanna update");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the updated name");
				name= sc.nextLine();
				stm.execute("update employee set name='"+name+"' where emp_id ="+ id +";");
				break;
				
			case 4:
				ResultSet rs = stm.executeQuery("select * from employee");
				System.out.println("----------------------------------------------");
				while(rs.next()) {
					System.out.println("Employee ID :"+rs.getInt("emp_id") +",  Employee Name :"+rs.getString("name"));
				}
				System.out.println("----------------------------------------------");
				break;
			
			}
			
			System.out.println("Whould you like to continue :yes/no");
			String nextOption = sc.nextLine();
			
		
			if(nextOption.toLowerCase().equals("no") ) {		
				break;
			}
			
		}
		 System.out.println("You have ended the program succesfully");
		
	} catch (Exception e) {

		System.out.println(e.getMessage());
	}
     
   
    }
    private static int enterOptionOne() {
    	
    	
    	System.out.print("Enter a employeeID");
    	 int id = sc.nextInt();
    			sc.nextLine();
    	return id;
      	
      }
    private static String enterOptionTwo() {
    	
    	System.out.print("Enter a name");
      	String name= sc.nextLine();
      	return name;
    }
    
    private static void showOptions() {
    	System.out.println("To Insert select 1");
    	System.out.println("To Delect select 2");
    	System.out.println("To Update an entry select 3");
    	System.out.println("To Print all entries select 4");
    }
    
}

