public class SalariedEmployee extends Employee {

	//instance
	private double fixedSalary;
	

	@Override
	public double earnings() {
		
		return fixedSalary;
	}
	
}
