package ro.utcluj.aut.isp.bankaccount;

import java.util.logging.Logger;

public class BankAccount {

    public static Logger LOG = Logger.getLogger( BankAccount.class.getName() );

    private String id;
    private int balance;

    public BankAccount(String id, int balance) {
        this.id = id;
        this.balance = balance;
    }


    public void increase(int money) {
        this.balance+=money;
    }

    public void decrease(int money) {
        this.balance -= money;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getId() {
        return this.id;
    }

}
