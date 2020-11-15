package mywebapp;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Student {

	private String firstName;
	
	@NotNull(message="is required.")
	@Size(min=1, message="is required.")
	private String lastName;
	
	private String country;
	
	private String postalCode;
	
	private String checkBox;
	
	private String radioButton;
	
	
		
	
		public String getRadioButton() {
			return radioButton;
		}
		public void setRadioButton(String radioButton) {
			this.radioButton = radioButton;
		}
		public String getCheckBox() {
		return checkBox;
		}
		public void setCheckBox(String checkbox) {
			this.checkBox = checkbox;
		}
		public String getPostalCode() {
			return postalCode;
		}
		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
	
	
	
	
}
