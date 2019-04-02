/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab6.ex2;

  public class BankAccount {
    private String owner;
    private double balance;
    
    public BankAccount()
    {
        this.balance=0;
        this.owner="default";
    }
    
    public BankAccount(String owner, double balance)
    {
        this.owner=owner;
        this.balance=balance;
    }
    
    public void withdraw(double amount)
    {
     this.balance=this.balance-amount;
    }
    
    public void deposit(double amount)
    {
        this.balance+=amount;
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
        return owner.hashCode();
    }
    
        public double  getBalance(){
            return this.balance;
        }
}

