package practice.akashumate.model;

public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getEmployeeFirstName() {
		return firstName;
	}

	public void setEmployeeFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmployeeLastName() {
		return lastName;
	}

	public void setEmployeeLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
