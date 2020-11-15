package com.springTesting.DemoSpringProjectLearning.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springTesting.DemoSpringProjectLearning.Dao.CustomerDetailsDao;
import com.springTesting.DemoSpringProjectLearning.Entity.CustomerDetails;

@Service
public class CustomerDetailsService {
	
	@Autowired
	CustomerDetailsDao dao;
	
	@Transactional
	public CustomerDetails getcustomerdetails(int id )
	{
		return dao.customerDetailById(id);
	}
}
