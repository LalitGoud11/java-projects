package com.WCF.Insurance.FutureRequestFeatures.Dao;

import java.util.List;

import com.WCF.Insurance.FutureRequestFeatures.Entity.FeatureRequest;

public interface FutureRequestFeatureDao  {

	public FeatureRequest findByID(int id);

	public int findAll();

	public String deleteById(int id);

	public void save(FeatureRequest fr);

}
