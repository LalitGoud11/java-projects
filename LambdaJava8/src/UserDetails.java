
public class UserDetails {
	private String id;
	private String name;
	private Boolean isValid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	
	public UserDetails() {}
	public UserDetails(String id,String name,Boolean isValid)
	{
		this.id=id;
		this.name=name;
		this.isValid=isValid;
	}	
	
}
