package com.SpringBootLearning.myNewApp.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.SpringBootLearning.myNewApp.Entity.Employee;

@Repository
public class DaoImp implements Dao {

	private EntityManager entitymanager;

	@Autowired
	public DaoImp(EntityManager entitymanager) {
		this.entitymanager = entitymanager;
	}

	
	@Override
	public List<Employee> getEmployees() {

		Session session = entitymanager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		List<Employee> emp = query.getResultList();

		return emp;

	}

	
	@Override
	public Employee findById(int id) {		
		Session  session = entitymanager.unwrap(Session.class);		
		
		Employee emp = session.get(Employee.class, id);		
		
		
		return emp ;
	}

	
	@Override
	public void deleteEmployee(int id) {
		Session session = entitymanager.unwrap(Session.class);		
		Query query = session.createQuery("delete from Employee where id =: empid");
		query.setParameter("empid", id);		
		query.executeUpdate();
		
	}
	
	
	@Override
	public void saveEmployee(Employee employee) {
		Session session = entitymanager.unwrap(Session.class);		
		 session.saveOrUpdate(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		Session session =entitymanager.unwrap(Session.class);		
		session.saveOrUpdate(employee);
		
	}

}
