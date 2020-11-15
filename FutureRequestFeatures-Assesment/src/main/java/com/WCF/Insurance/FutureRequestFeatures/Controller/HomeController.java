package com.WCF.Insurance.FutureRequestFeatures.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WCF.Insurance.FutureRequestFeatures.Entity.FeatureRequest;
import com.WCF.Insurance.FutureRequestFeatures.Service.FutureRequestFeatureService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/feature")
public class HomeController {

	@Autowired	
	FutureRequestFeatureService futureRequestService;

	
	@PostMapping("request/save")
	@ApiOperation(value = "")
	public void saveRequest(@RequestBody FeatureRequest fr ) {
		futureRequestService.save(fr);
		
	}
	
	@DeleteMapping("deleteRequest/{ID}")
	public String deleteRequest(@PathVariable ("ID") int id) {
		return futureRequestService.deleteById(id);
	}
	
	@GetMapping("getRequest/{ID}")
	public FeatureRequest getRequestById(@PathVariable ("ID") int id) {
		return futureRequestService.findByID(  id);
		
	}
	
	@GetMapping("getAllRequests")
	//public List<FeatureRequest> getAllRequest(){
		public int getAllRequest(){
		return futureRequestService.findAll();
	}
}
