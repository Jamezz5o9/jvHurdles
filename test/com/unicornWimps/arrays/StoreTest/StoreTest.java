package com.unicornWimps.arrays.StoreTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {

    private StoreCustomer james;
    private StoreCustomer tope;
    private StoreCustomer amez;
    private StoreCustomer goke;

    @BeforeEach
    public  void setUp(){
        james = new StoreCustomer();
        james.setAccountNumber(1);
        james.setBalance(6000);
        james.setCreditLimit(5000);
        james.setTotalCreditApplied(3000);
        james.setTotalItemsCharged(7000);

        goke = new StoreCustomer(300);

        tope = new StoreCustomer(2, 2000, 5000, 3000, 12000);
        amez = new StoreCustomer(3, 3000, 4000, 6000,2000);
    }

    @Test
    public void calculateBalance(){
        james.calculateBalance();
        assertEquals(2000, james.getBalance());
    }

    @Test
    public void calculateBalanceWithNegativeBalance(){
            james.setBalance(-1000);
            james.calculateBalance();
            assertEquals(0, james.getBalance());
    }


    @Test
    public void balanceExceedCustomerCreditLimit(){
        james.calculateBalance();
        boolean exceeded = james.exceedCreditLimit();
        assertTrue(exceeded);
    }

    @Test
    public void checkThroughAllWhoseExceedLimit(){
        StoreCustomer[] store = {james, tope, amez};
        for(int i = 0; i < store.length; i++){
           StoreCustomer stores = store[i];
            stores.calculateBalance();
            if(stores.exceedCreditLimit()){

                System.out.printf("Account Number: %d%n", stores.getAccountNumber());
                System.out.println("Credit Limit exceeded!!!");
            } else{
                System.out.printf("Account Number: %d%n", stores.getAccountNumber());
                System.out.println("Credit Limit not exceeded");
            }
        }
    }

}
