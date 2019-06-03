package ro.utcluj.aut.isp.bankaccount;

public class TransferContext {

    public void transfer(BankAccount sender, BankAccount receiver, int ammount){

        sender.decrease(ammount);
        receiver.increase(ammount);
    }

}
