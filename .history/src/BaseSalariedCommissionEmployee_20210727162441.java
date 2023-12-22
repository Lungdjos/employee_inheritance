public class BaseSalariedCommissionEmployee extends CommissionEmployee{
	

	private double baseSalary;

	//Constructors
	public BaseSalariedCommissionEmployee() {
		super();
	}
	public BaseSalariedCommissionEmployee(String fName, String lName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
		//Explicit Call of the superclass constructor
		super(fName, lName, socialSecurityNumber, grossSales, commissionRate);
		//Body of the subclass constructor
		if(baseSalary < 0.0){
			throw new IllegalArgumentException("Base Salary should be more than 0.0");
		}
		this.baseSalary =
}