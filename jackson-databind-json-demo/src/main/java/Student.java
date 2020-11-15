import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {
	
	private int id;
	private boolean active;
	private String first;
	private String last;
	private Address address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getFirstName() {
		return first;
	}
	public void setFirstName(String firstname) {
		this.first = firstname;
	}
	public String getLastName() {
		return last;
	}
	public void setLastName(String lastname) {
		this.last = lastname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
}
