package ro.utcluj.aut.isp.bankaccount;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransferContextTest {

    @Test
    public void transfer() {
        BankAccount sender = new BankAccount("A01" ,100);
        BankAccount receive = new BankAccount("B02", 100);
        TransferContext context = new TransferContext();
        context.transfer(sender, receive, 10);
        assertEquals(90, sender.getBalance());
        assertEquals(110, receive.getBalance());
    }
}