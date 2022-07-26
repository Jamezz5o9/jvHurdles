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

        boolean isValidAmount = amount > 0;
        if(isValidAmount) balance = getBalance(pin) + amount;
//        if(amount < 0){
//            amount = 0;
//            //amount = getBalance();
//        } else{
//            balance = getBalance(pin) + amount;
//        }
    }

    public void withdraw(int amount, String pin){
        boolean amountIsValid = balance > amount && amount > 0;
        if(isCorrect(pin) && amountIsValid){
           balance -= amount;
        } else {
            balance = 0;
        }
    }
    private boolean isCorrect(String pin){
        return pin.equals(this.pin);
    }
}
