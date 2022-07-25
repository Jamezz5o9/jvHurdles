package com.unicornWimps.arrays.StoreTest;

import java.util.Scanner;

public class StoreCustomer {
    private int accountNumber;
    private int creditLimit;
    private int totalItemsCharged;
    private int totalCreditApplied;
    private int balance;

    public StoreCustomer(){};
        public StoreCustomer(int bal){
        this.balance = bal;
    }

    public StoreCustomer(int accountNumber, int creditLimit, int totalItemsCharged, int totalCreditApplied, int balance){
        this(balance);
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
        this.totalItemsCharged = totalItemsCharged;
        this.totalCreditApplied = totalCreditApplied;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getTotalItemsCharged() {
        return totalItemsCharged;
    }

    public void setTotalItemsCharged(int totalItemsCharged) {
        this.totalItemsCharged = totalItemsCharged;
    }

    public int getTotalCreditApplied() {
        return totalCreditApplied;
    }

    public void setTotalCreditApplied(int totalCreditApplied) {
        this.totalCreditApplied = totalCreditApplied;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int calculateBalance() {
        int balance = getBalance() + totalItemsCharged - totalCreditApplied;
        setBalance(balance);
        return getBalance();
    }

    public boolean exceedCreditLimit() {
            boolean result = false;
            if(getBalance() > getCreditLimit()){
               // System.out.println("Credit limit exceeded");
                return true;
            }
       // System.out.println("Credit limit not exceeded");
            return result;
    }
}
