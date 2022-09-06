package Femi;

public class FairTax {
    private double totalPrice = 0.0;
    private double FAIR_TAX_PRICE = 23.00;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double calcFairTax(double price){
        return (FAIR_TAX_PRICE / 100) * price;

    }
    public void calcTotalPrice(double price){
        totalPrice += price;
    }


}
