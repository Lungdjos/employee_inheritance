public class Employee {
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
		this.socialSecurityNumber = socialSecurityNumber
	}

	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	
	

}
