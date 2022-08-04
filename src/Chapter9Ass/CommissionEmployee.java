package Chapter9Ass;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber);
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales shouldn't be < 0.0");
        }

        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate should be between 0.0 and 1.0");
        }

        this.commissionRate = commissionRate;
        this.grossSales = grossSales;

    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales must be > 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        if(commissionRate < 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commission rate should be between 0.0 and 1.0");
        }
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    public String toString(){
        return String.format("%s%s: %.2f%n%s: %.2f%n", super.toString(), "The Gross sales is", grossSales,
                                "The commission rate is ", commissionRate);
    }
}
