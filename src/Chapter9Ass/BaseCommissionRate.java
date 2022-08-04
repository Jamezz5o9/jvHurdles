package Chapter9Ass;

public class BaseCommissionRate extends CommissionEmployee{
    private double baseSalary;

    public BaseCommissionRate(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary should be > 0.0");

        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary should be > 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString(){
        return String.format("%s%s: %.2f%n%s: %.2f%n", super.toString(), "The base salary for worker is", baseSalary,
                "Your earning for the month is", earnings());
    }
}
