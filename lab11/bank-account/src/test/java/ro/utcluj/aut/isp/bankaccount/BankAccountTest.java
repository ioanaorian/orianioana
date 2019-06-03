package ro.utcluj.aut.isp.bankaccount;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void increase() {
        BankAccount a = new BankAccount("a01", 100);
        a.increase(10);
        assertEquals(110, (long)a.getBalance());
    }

    @Test
    public void decrease() {
        BankAccount a = new BankAccount("a01", 100);
        a.decrease(10);
        assertEquals(90, a.getBalance());
    }
}