public class CommissionEmployee extends Employee {
	//Instance Variables
	private double grossSales;
	private double commissionRate;
	
	//Earns Method
	public double earnings() {
        return getGrossSales() * getCommissionRate();}
	
	public double getGrossSales() {
        return grossSales;}
	
	public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;}
	public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        if(commissionRate > 1.0 || commissionRate < 0.0){
            throw new IllegalArgumentException("The commission rate should be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }
    //Printing Employee Details
    @Override
    public String toString() {
        return "CommissionEmployee [commissionRate=" + commissionRate + ", grossSales=" + grossSales + ", fName=" +super.getFName() + ", lName=" +super.getLName() + "]";
    }
}
