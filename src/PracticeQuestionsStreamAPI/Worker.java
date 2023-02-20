package PracticeQuestionsStreamAPI;

public class Worker {

	private String firstName;
	private String lastName;
	private String alias;
	private String dept;
	
	public Worker(String firstName, String lastName, String alias, String dept) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.alias = alias;
		this.dept = dept;
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

	public String getAlias() {
		return alias;
	}

	public void setAlis(String alias) {
		this.alias = alias;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	
}
