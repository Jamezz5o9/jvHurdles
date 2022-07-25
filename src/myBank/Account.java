package myBank;

public class Account {
    private String pin;
    private String number;
    private String name;
    private int balance;

    public Account(){};
    public Account(String accountNumber, String accountName, String accountPin){
        pin = accountPin;
        number = accountNumber;
        name = accountName;
    }
    public int getBalance(){
        return balance;
    }

    public void deposit(int amount) {
        //if(amount > 0) balance = getBalance + amount;
        if(amount < 0){
            amount = 0;
            //amount = getBalance();
        } else{
            balance = getBalance() + amount;
        }
    }
}
