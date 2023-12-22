public class BaseSalariedCommissionEmployee extends CommissionEmployee {
	//instance Variable
	private double baseSalary;

	//Constructors
	public BaseSalariedCommissionEmployee(){
		super();
	}

	public BaseSalariedCommissionEmployee(String fName, String lName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
		super(fName, lName, socialSecurityNumber, grossSales, commissionRate);
		if(baseSalary <= 0){
			throw new IllegalArgumentException("The base salary should be more than 0");
		}
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		return super.earnings() + baseSalary +(baseSalary*0.1);
	}

	@Override
	public String toString() {
		return "[baseSalary=" + baseSalary +", " + super.toString()+ "]";
	}
	
	
}
