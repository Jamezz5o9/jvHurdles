package com.unicornWimps.arrays.sales;

import java.math.BigDecimal;

public class Sales {

    private final double salary = 200;
    private final double interestOnSales = 0.09;
    private Item[] items;

    public Sales(){}

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public double calculateEarning() {
        double commission = BigDecimal.ZERO.doubleValue();
        for(int i = 0; i < items.length; i++){
            commission += items[i].getValue() * interestOnSales;
        }

        return commission + salary;

    }
}
