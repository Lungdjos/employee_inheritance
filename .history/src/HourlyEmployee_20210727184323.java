public class HourlyEmployee extends Employee {

	//instance variable
	private int hoursWorked;
	private double hourlySalary;

	public HourlyEmployee(String fName, String lName, String socialSecurityNumber, int hoursWorked,
			double hourlySalary) {
		super(fName, lName, socialSecurityNumber);
		this.hoursWorked = hoursWorked;
		this.hourlySalary = hourlySalary;
	}


	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public double getHourlySalary() {
		return hourlySalary;
	}


	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}


	@Override
	public double earnings() {
		double salary;
		if(hoursWorked <= 40){
			salary = hourlySalary * hoursWorked;
		} else {
			salary = hourly
		}
		// TODO Auto-generated method stub
		return 0;
	}
	
}
