public class HourlyEmployee extends Employee {

	//instance variable
	private int hoursWorked;
	private double hourlySalary;

	
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
		// TODO Auto-generated method stub
		return 0;
	}
	
}
