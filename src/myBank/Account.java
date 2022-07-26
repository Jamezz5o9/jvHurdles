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
    public int getBalance(String pin){
        if(pin.equals(this.pin)) return balance;
        return 0;
    }

    public void deposit(int amount) {
       // if(amount > 0) balance = getBalance(pin) + amount;
        if(amount < 0){
            amount = 0;
            //amount = getBalance();
        } else{
            balance = getBalance(pin) + amount;
        }
    }

    public void withdraw(int amount){
        if(balance > amount && pin.equals(this.pin)){
           balance -= amount;
        }
    }
}
