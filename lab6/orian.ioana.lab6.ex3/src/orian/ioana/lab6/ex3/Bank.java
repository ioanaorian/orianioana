package orian.ioana.lab6.ex3;

/**
 *
 * @author Alexandra
 */
import java.util.*;

public class Bank {

    private TreeSet<BankAccount> bank=new TreeSet<BankAccount>();
    public void addAccount(String owner, double balance){

        bank.add(new BankAccount(owner, balance));
    }
    public void printAccounts(){
        for(BankAccount b: bank) {
            System.out.println(b);
        }
    }
    public void printAccounts(double minBalance, double maxBalance) {
        for (BankAccount b : bank) {
            if ((b.getBalance()>minBalance) && (b.getBalance()<maxBalance)){
                System.out.println(b);
            }
        }
    }

    public void printAllAccounts() {

        ArrayList<BankAccount> array = new ArrayList<BankAccount>(bank);
        Comparator<BankAccount>NAME_ORDER = new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                return o1.getOwner().compareTo(o2.getOwner());
            }
        };
        Collections.sort(array,NAME_ORDER);
        for(BankAccount s: array)
            System.out.println(s);
    }
}