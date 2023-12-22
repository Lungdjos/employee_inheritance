public class CommissionEmployee extends Employee {
    
    private double grossSales;
    private double commissionRate;

    //Constructors
    public CommissionEmployee() {
        super();
    }
    public CommissionEmployee(String socialSecurityNumber, double grossSales, double commissionRate){
        super(String fName, String lName, String //get and set Method
        public double getBaseSalary(){
            return baseSalary;
        }
        public void setBaseSalary(double baseSalary) {
            if(baseSalary < 0.0){
                throw new IllegalArgumentException("Base Salary should be more than 0.0");
            }
            this.baseSalary = baseSalary;
        }
        //Overriding the superclass earning method
        @Override
        public double earnings() {
            return baseSalary + super.earnings();
        }
    
        //printing the Employee's details
        @Override
        public String toString(){
            return String.format("%s: %s%n %s: %s%n %s: %s%n %s: %d%n %s: %d%n %s: %d%n",
            "First Name", getFName(),"Last Name", getLName(),"Social Security Number", getSocialSecurityNumber(),"Gross Sales", getGrossSales(),"Commission Rate", getCommissionRate(),"Base Salary", getBaseSalary());
        })
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be more than 0.0");
        }
        if(commissionRate > 1.0 || commissionRate < 0.0){
            throw new IllegalArgumentException("The commission rate should be between 0.0 and 1.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    //get and set methods
    

    //Earns Method
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }
    
    public double getGrossSales() {
        return grossSales;
    }
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
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
    
    