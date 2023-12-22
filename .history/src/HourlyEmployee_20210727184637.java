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
		double salary = 0.0;
		if(hoursWorked <= 40){
			salary = hourlySalary * hoursWorked;
		} else {
			salary = (hourlySalary * 40) + ((hoursWorked - 40)*1.5*hourlySalary);
		}
		// TODO Auto-generated method stub
		return sala;
	}
	
}
