package Chapter9Ass;

public class HourlyWage extends Employee{
    private double wages;
    private double hours;

    public HourlyWage(String firstName, String lastName, String socialSecurityNumber, double hours, double wages){
        super(firstName, lastName, socialSecurityNumber);

        if( wages < 0.0){
            throw new IllegalArgumentException("Hour's worked shouldn't be < 0.0");
        }

        if(hours < 0 || hours > 168){
            throw new IllegalArgumentException("Wages should be within the range of 0.0 and 168");
        }
        this.hours = hours;
        this.wages = wages;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if( wages < 0.0){
            throw new IllegalArgumentException("Hour's worked shouldn't be < 0.0");
        }
        this.wages = wages;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(hours < 0 || hours > 168){
            throw new IllegalArgumentException("Wages should be within the range of 0.0 and 168");
        }

        this.hours = hours;
    }

    public double earnings(){
        double earnings;
        double hourDifference = getHours() - 40;
        boolean rangeOfHour = getHours() <= 40;
        if(rangeOfHour){
            earnings = getHours() * getWages();
        }
        else{
            double extraGain = hourDifference * getWages();
            earnings = (40 * getWages()) + (1.5 * extraGain);
        }
    return earnings;
    }

    public String toString(){
        return String.format("%s%s: %.2f%n%s: %.2f%n%s: %.2f%n", super.toString(),
                "Hours worked is", getHours(), "Wages per hour is",  getWages(),
                "Your earnings is", earnings());
    }
}
