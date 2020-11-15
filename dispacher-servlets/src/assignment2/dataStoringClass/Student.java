package assignment2.dataStoringClass;

public class Student {

	
	private String name;
	private String address;
	private String email;
	
	public Student(String name, String address, String email) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	
	
	
}
