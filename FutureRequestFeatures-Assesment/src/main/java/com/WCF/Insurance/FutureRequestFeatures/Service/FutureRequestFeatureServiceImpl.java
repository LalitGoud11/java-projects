package com.WCF.Insurance.FutureRequestFeatures.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.WCF.Insurance.FutureRequestFeatures.Dao.FutureRequestFeatureDao;
import com.WCF.Insurance.FutureRequestFeatures.Dao.FutureRequestFeatureDaoImpl;
import com.WCF.Insurance.FutureRequestFeatures.Entity.FeatureRequest;

@Service
public class FutureRequestFeatureServiceImpl implements FutureRequestFeatureService {

	@Autowired
	FutureRequestFeatureDao futureRequestFeatureDao;
	
	

	@Override
	@Transactional
	public void save(FeatureRequest fr) {
		futureRequestFeatureDao.save(fr);
		
	}



	@Override
	@Transactional
	public FeatureRequest findByID(int id) {
		return futureRequestFeatureDao.findByID(id);
	}



	@Override
	@Transactional
//	public List<FeatureRequest> findAll() {
	public int findAll() {

		return futureRequestFeatureDao.findAll();
		
	}



	@Override
	@Transactional
	public String deleteById(int id) {
		return futureRequestFeatureDao.deleteById(id);
		
	}

	
		
}

	
	

