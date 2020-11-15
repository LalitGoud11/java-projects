package com.springTesting.DemoSpringProjectLearning.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.engine.spi.ManagedEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springTesting.DemoSpringProjectLearning.Entity.CustomerDetails;

@Repository
public class CustomerDetailsDao {

	@Autowired
	EntityManager entityManager;

	
	public CustomerDetails customerDetailById(int id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(CustomerDetails.class, id);
	}
	
}
