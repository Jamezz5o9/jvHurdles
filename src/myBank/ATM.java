package myBank;

import myBank.BankExceptions.*;

import java.util.Scanner;

public class ATM {
    private static final Bank oniranu = new Bank();

    public static void main(String[] args) {
        startAtm();
    }

    private static void startAtm() {
        String mainMenu = """
                Welcome to Oniranu Bank
                1 -> Create Account
                2 -> Deposit
                3 -> Withdraw
                4 -> Transfer
                5 -> check Balance
                6 -> Exit
                """;

        String userInput = input(mainMenu);
        switch (userInput){
            case "1" -> createAccount();
            case "2" -> deposit();
            case "3" -> withdraw();
            case "4" -> transfer();
            case "5" -> checkBalance();
            case "6" -> exit(6);

        }
    }

    private static void checkBalance() {
        String accountNumber = input("Enter your account number");
        String pin = input("Enter your pin");
        display(String.format("Balance is %d", oniranu.findAccount(accountNumber).getBalance(pin)));
        startAtm();
    }

    private static void createAccount() {
        String accountName = input("Enter your account name");
        String pin = input("Enter your desired pin");
        oniranu.createAccountFor(accountName, pin);
        display(String.format("Account created for %s", accountName));
        startAtm();
    }

    private static String input(String prompt) {
        display(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    private static void  transfer(){

    }
    private static void exit(int status){

    }
    private static void withdraw(){

    }
    private static void deposit(){
        String accountNumber = input("Enter your account number");
        int amount = inputInt();
        try {
            oniranu.deposit(amount, accountNumber);
        }
        catch(InvalidAmountException ex){
            display(ex.getMessage());
            deposit();
        }
       startAtm();
    }

    private static int inputInt() {
        display("Enter amount you want to deposit");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void display(String prompt){
        System.out.println(prompt);
    }
}
