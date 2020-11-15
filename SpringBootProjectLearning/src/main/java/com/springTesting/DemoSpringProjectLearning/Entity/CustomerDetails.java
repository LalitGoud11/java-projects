package com.springTesting.DemoSpringProjectLearning.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "Customer_Dtls")

public class CustomerDetails {
	
	@Id
	@Column(name = "customer_id")
	private int customerId;
	
//	@Column(name = "customer_firstname")
	private String customer_firstname; 
	
	@Column(name = "Customer_LastName")
	private String customerLastName;
	
	@Column(name = "customer_phone")
	private String customerPhone;
	
	@Column(name = "orders_id")
	private int ordersId;
	
	
	public CustomerDetails() {
		
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerId=" + customerId + ", customerFirstName=" + customer_firstname
				+ ", customerLastName=" + customerLastName + ", customerPhone=" + customerPhone + ", ordersId="
				+ ordersId + "]";
	}
	
	
}
