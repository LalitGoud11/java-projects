package com.WCF.Insurance.FutureRequestFeatures.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table(name="DEMO")
@Component
public class FeatureRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    
    private String title;
    private String description;
    private String client;
    private String clientPriority;
    private String targetDate;
    private String productArea;
    
    
    
	public FeatureRequest() {
		//super();
	}
	
	public FeatureRequest(int id, String title, String description, String client, String clientPriority,
			String targetDate, String productArea) {
//		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.client = client;
		this.clientPriority = clientPriority;
		this.targetDate = targetDate;
		this.productArea = productArea;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getClientPriority() {
		return clientPriority;
	}
	public void setClientPriority(String clientPriority) {
		this.clientPriority = clientPriority;
	}
	public String getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}
	public String getProductArea() {
		return productArea;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public String print() {
		
		return "string";
	}
	@Override
	public String toString() {
		return "FeatureRequest [id=" + id + ", title=" + title + ", description=" + description + ", client=" + client
				+ ", clientPriority=" + clientPriority + ", targetDate=" + targetDate + ", productArea=" + productArea
				+ "]";
	}
	
	
}