package orian.ioana.lab6.ex2;

import java.util.*;

public class Bank {

    private BankAccount accounts;

    ArrayList<BankAccount> lista=new ArrayList<BankAccount>();
    public void addAccount(String owner, double balance){

        lista.add(new BankAccount(owner, balance));
    }
    public void printAccounts(){
        Collections.sort(lista,money);
        for(BankAccount b: lista) {
            System.out.println("The owner "+b.getOwner()+" has "+b.getBalance());
        }
    }
    public void printAccounts(double minBalance, double maxBalance) {
        Collections.sort(lista, money);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getBalance() < maxBalance && lista.get(i).getBalance() > minBalance) {
                System.out.println(lista.get(i).getOwner());
            }
        }
    }

    public static Comparator <BankAccount> money=new Comparator<BankAccount>() {
        @Override
        public int compare(BankAccount o1, BankAccount o2) {
            int balance1 = (int)o1.getBalance();
            int balance2 = (int)o2.getBalance();
            if(o1.getBalance()-o2.getBalance()>0 && o1.getBalance()-o2.getBalance()<1)
                return 1;
            else
                if (o1.getBalance()-o2.getBalance()>-1 && o1.getBalance()-o2.getBalance()<0)
                    return -1;
                else
                    return balance1-balance2;
        }
    };

    public static Comparator<BankAccount> name=new Comparator<BankAccount>() {
        @Override
        public int compare(BankAccount o1, BankAccount o2) {
            String name1=o1.getOwner().toUpperCase();
            String name2=o2.getOwner().toUpperCase();
            return name1.compareTo(name2);
        }
    };

    public BankAccount getAccount(String owner){
          BankAccount b=new BankAccount(owner,100);
          return b;
    }
    public void getAllAcounts(){
        Collections.sort(lista, name);
        for(BankAccount b:lista){
            System.out.println(b.getOwner());
        }
    }
}