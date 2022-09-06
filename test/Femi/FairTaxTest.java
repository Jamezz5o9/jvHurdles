package Femi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FairTaxTest {
    private Product product;
    private FairTax fairTax;

    @BeforeEach
    public void setUp(){
        product = new Product("Bread", 30.00);
        fairTax = new FairTax();
    }

    @Test
    public void testThatFairTaxCanBeCalculatedOnProduct(){
        fairTax = new FairTax();
        assertEquals(6.9, fairTax.calcFairTax(product.getPrice()));

    }
    @Test
    public void testThatProductsTotalCanBeCalculated(){
        fairTax.setTotalPrice(500);
        fairTax.calcTotalPrice(30);
        assertEquals(530,fairTax.getTotalPrice());
    }
    @Test
    public void testThatTaxCanBeCalculatedOnTheTotalPrice(){
        fairTax.setTotalPrice(500);
        fairTax.calcTotalPrice(30);
        double tax =  fairTax.calcFairTax(fairTax.getTotalPrice());
        assertEquals(121.9, tax);
    }
}
