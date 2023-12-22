public class SalariedEmployee extends Employee {

	//instance
	private double fixedSalary;
	

	public SalariedEmployee(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}


	public SalariedEmployee(String fName, String lName, String socialSecurityNumber, double fixedSalary) {
		super(fName, lName, socialSecurityNumber);
		this.fixedSalary = fixedSalary;
	}
	


	public double getFixedSalary() {
		return fixedSalary;
	}


	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}


	@Override
	public double earnings() {
		return fixedSalary;
	}
	
}
