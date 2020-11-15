package assignment2.ServletClass;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import assignment2.dataStoringClass.Student;

public class AddServlet implements Servlet {
	
	private List<Student> list = new ArrayList<>();;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) 
															throws ServletException, IOException {
//pass the request as this "http://localhost:8080/assignment2/AddServlet?name=lalit&address=123&email=123@456"		
		response.setContentType("text/html");		

		PrintWriter out = response.getWriter();
		list.add(new Student(request.getParameter("name"),
				request.getParameter("address"),request.getParameter("email")));
		
		for(Student s:list)
		out.println(s);
		
	}

}
