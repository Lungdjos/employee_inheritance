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
			throw new IlegalArgumentException("The base Sa");
		}
	}
}
