package orian.ioana.lab6.ex1;

public class BankAccount {

    private String owner;
    private double balance;
    public BankAccount(String owner,double balance){
        this.balance=balance;
        this.owner=owner;
    }
    public void withdraw(double amount){
        this.balance=this.balance-amount;
    }
    public void deposit(double amount){
        this.balance=this.balance+amount;
    }
    @Override
    public boolean equals(Object obj)
    {
        if(obj==null|| !(obj instanceof BankAccount)) return false;
        BankAccount o2=(BankAccount)obj;
        return ((o2.owner == owner)&&(o2.balance == balance));
        
    }
    @Override
    public int hashCode()
    {
        return owner.hashCode()+(int)balance;
    }
    
}
