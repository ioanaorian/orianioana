package ro.utcluj.aut.isp.bankaccount;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountsManagerTest {

    @Test
    public void addAccount() {
        AccountsManager am = new AccountsManager();
        am.addAccount(new BankAccount("ABB",123));
        am.addAccount(new BankAccount("XYT",123));
        am.addAccount(new BankAccount("DSC",123));
        am.addAccount(new BankAccount("AST",123));
        assertEquals(4, am.count());
    }

    @Test
    public void findById() {
        AccountsManager am = new AccountsManager();
        am.addAccount(new BankAccount("ABB",123));
        am.addAccount(new BankAccount("XYT",123));
        am.addAccount(new BankAccount("DSC",123));
        am.addAccount(new BankAccount("AST",123));
        assertTrue(am.exists("ABB"));
        assertFalse(am.exists("GHTY"));
    }

}