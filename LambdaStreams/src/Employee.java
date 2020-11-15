
public class Employee {
	  private String name;
	  private Integer age;
	  private Double salary;
	  private Department department;
	 
	  public Employee(String name, Integer age, Double salary, Department department) {
	    this.name = name;
	    this.age = age;
	    this.salary = salary;
	    this.department = department;
	  }
	 
	public String toString(){
	    return "Employee Name:"+this.name;
	  }

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Double getSalary() {
		return salary;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department != other.department)
			return false;
		return true;
	}

	
	 
	
	 
	}