package com.WCF.Insurance.FutureRequestFeatures.Service;

import java.util.List;

import com.WCF.Insurance.FutureRequestFeatures.Entity.FeatureRequest;


public interface FutureRequestFeatureService {

	FeatureRequest findByID(int id);
	
	int findAll();
	
	public void save(FeatureRequest fr);
	
	String deleteById(int id);
	
	
}
