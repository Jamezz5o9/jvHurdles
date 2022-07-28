package myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    private Bank wemaBank;
    private Account account;
    @BeforeEach
    public void setUp(){
        wemaBank = new Bank();
    }
    @Test
    public void bankExistTest(){

        assertNotEquals(null, wemaBank);
        assertNotNull(wemaBank);
    }

    @Test
    public void accountCanBeCreatedTest(){
        //given that there is a bank;
        //when i create an account;
        //check that number of accounts created is 1

        wemaBank.createAccountFor("Banke Celina Owolabi", "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());
    }

    @Test
    public void create_findAccountByAccountNumberTest(){
        wemaBank.createAccountFor("Banke Celina Owolabi", "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());

        account = wemaBank.findAccount("1");
        assertEquals("Banke Celina Owolabi", account.getName());

    }

    @Test
    public  void customerCanDepositInHerAccountTest(){
        wemaBank.createAccountFor("Bank Celina Owoloba", "2727");
        wemaBank.deposit(2_000, "1");

        Account bankeAccount = wemaBank.findAccount("1");
        assertEquals(2_000, bankeAccount.getBalance("2727"));
    }

    @Test
    public void withdrawPostiveAmountFromAccount(){
        wemaBank.createAccountFor("Bank Celina Owoloba", "2727");
        wemaBank.deposit(2_000, "1");

        Account bankeAccount = wemaBank.withdraw(1000, "1", "2727");
        assertEquals(1000, bankeAccount.getBalance("2727"));
    }
    @Test
    public void withdrawNegativeAmountFromAccount(){
        wemaBank.createAccountFor("Bank Celina Owoloba", "2727");
        wemaBank.deposit(2_000, "1");

        Account bankeAccount = wemaBank.withdraw(-1000, "1", "2727");
        assertEquals(2000, bankeAccount.getBalance("2727"));
    }

}
