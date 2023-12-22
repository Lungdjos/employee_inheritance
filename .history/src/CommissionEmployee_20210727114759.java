public class CommissionEmployee extends Object {
    private String fName;
    private String lName;
    private String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

    //Constructors
    public CommissionEmployee() {
    }
    public CommissionEmployee(String fName, String lName, String socialSecurityNumber, double grossSales, double commissionRate){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be more than 0.0");
        }
        if(commissionRate > 1.0 || commissionRate < 0.0){
            throw new IllegalArgumentException("The commission rate should be between 0.0 and 1.0");
        }
        this.fName = fName;
        this.lName = lName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    
    //get and set methods
    public String getFName(){
        return fName;
    }
    public String getLName(){
        return lName;
    }
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public double getGrossSales(){
        return grossSales;
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public void setFName(String fName){
        this.fName = fName;
    }
    public void setLName(String lName){
        this.lName = lName;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setGrossSales(double grossSales){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be more than 0.0");
        }
        this.grossSales = grossSales;
    }
    
    public void setCommissionRate(double commissionRate){
        if(commissionRate > 1.0 || commissionRate < 0.0){
            throw new IllegalArgumentException("The commission rate should be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }
    //Earns Method
    public double earnings() {
        return getGrossSales() * getCommissionRate();
    }
    //Printing Employee Details
    @Override
    public String toString() {
        return "CommissionEmployee [commissionRate=" + commissionRate + ", fName=" + fName + ", grossSales="
                + grossSales + ", lName=" + lName + ", socialSecurityNumber=" + socialSecurityNumber + "]";
    }
}