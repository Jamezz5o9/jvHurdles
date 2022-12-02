package myBank.BankExceptions;

public class InvalidAccountNumber extends RuntimeException {
    public InvalidAccountNumber(String message){
        super(message);
    }
}
