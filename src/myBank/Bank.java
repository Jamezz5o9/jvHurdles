package myBank;

import myBank.BankExceptions.InvalidAccountNumber;

import java.util.Objects;

public class Bank {
    private int numberOfCustomer;
    private Account account;
    private final Account[] accounts = new Account[10];
    public void createAccountFor(String accountName, String pin) {
        account = new Account((numberOfCustomer+1)+ "", accountName, pin);
        accounts[numberOfCustomer] = account;
        numberOfCustomer++;
    }
    public int getNumberOfCustomers() {
        return numberOfCustomer;
    }
    public Account findAccount(String accountNumber) {
//        for(int i = 0; i < accounts.length; i++){
//            if(Objects.equals(accounts[i].getNumber(), accountNumber)) return account;
//        }
        for(Account account : accounts){
            boolean myAccount = account.getNumber().equals(accountNumber);
            if(myAccount) return account;
        }

       throw new NullPointerException("Account Number does not exist");
    }

    public void deposit(int amount, String accountNumber) {
       Account account =  findAccount(accountNumber);
       account.deposit(amount);
    }


    public Account withdraw(int amount, String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        account.getBalance(pin);
        account.withdraw(amount, pin);
        return account;
    }

    public void transfer(String sender, String receiver, int amount, String pin) {
        Account senderAccount  = findAccount(sender);
        Account receiverAccount  = findAccount(receiver);

        senderAccount.withdraw(amount, pin);
        receiverAccount.deposit(amount);
    }
    public int checkBalance(String pin, String accountNumber){
        Account account = findAccount(accountNumber);
        return account.getBalance(pin);

    }
}
