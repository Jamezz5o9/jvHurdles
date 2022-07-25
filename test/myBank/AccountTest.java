package myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;
    private Account bankeAccount;

    @BeforeEach
    public void setUp(){
        account = new Account();
        bankeAccount = new Account("1", "Banke Celina", "1234");
    }

    @Test
    public void accountCanBeCreatedTest(){
        //given that account exist
        //check that account exists
        //Check that balance is zero
        assertNotNull(account);
        assertEquals(0, account.getBalance());

    }

    @Test
    public void depositMoney_balanceIncreasesTest(){

        //given that i have account and balance is zero;
        //when i deposit 200
        //check that balance is 200

        bankeAccount = new Account();
        assertEquals(0, bankeAccount.getBalance());
        bankeAccount.deposit(200);
        assertEquals(200, bankeAccount.getBalance());

    }

    @Test
    public void cannotDepositNegativeAmount(){
        //given that i have an account
        //when i try to deposit negative amount -2500
        //check that balance is zero;

        bankeAccount = new Account();
        assertEquals(0, bankeAccount.getBalance());
        bankeAccount.deposit(-2500);
        assertEquals(0, bankeAccount.getBalance());

    }
    @Test
    @DisplayName("Getting balance with invalid pin returns ")
    public void checkForPinThatAreInvalid(){

    }
}