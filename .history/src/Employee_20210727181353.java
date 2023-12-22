public abstract class Employee {
	private String fName;
	private String lName;
	private String socialSecurityNumber;
	
	//Constructors
	public Employee(){
		//c
	}

	public Employee(String fName, String lName, String socialSecurityNumber){
		this.fName = fName;
		this.lName = lName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFName() {
		return fName;
	}
	public void setFName(String fName) {
		this.fName = fName;
	}
	public String getLName() {
		return lName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public abstract earnings(){z
	

}
