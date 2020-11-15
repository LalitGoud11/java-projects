package com.WCF.Insurance.FutureRequestFeatures.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.WCF.Insurance.FutureRequestFeatures.Entity.FeatureRequest;

@Repository
public  class FutureRequestFeatureDaoImpl  implements FutureRequestFeatureDao{
	
	@Autowired
	private EntityManager entitymanager;
	
	@Override
	public FeatureRequest findByID(int id) {
		Session s = entitymanager.unwrap(Session.class);
		FeatureRequest fr= s.get(FeatureRequest.class, id);
		return fr;
	}

	@Override
//	public List<FeatureRequest> findAll() {
	public int findAll() {
		Session s = entitymanager.unwrap(Session.class);
		List<FeatureRequest> l = s.getSession().createQuery("from FeatureRequest").list();
		return l.size();
	}

	@Override
	public String deleteById(int id) {
		
		Session s = entitymanager.unwrap(Session.class);
		FeatureRequest fr= s.get(FeatureRequest.class, id);
		
		if(fr!=null) {
		 s.delete(fr);
		 return "object deleted sy=uccesfully";
		}
		else
		return "Record is not present with that id";
	}

	@Override
	public void save(FeatureRequest fr) {
		Session s = entitymanager.unwrap(Session.class);
		s.save(fr);
	}
	
	
	

}
