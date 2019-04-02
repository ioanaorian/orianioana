/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab6.ex2;

import java.util.*;

public class Bank {
    
    
   ArrayList<BankAccount> lista=new ArrayList<BankAccount>();
    
    public void addAccount(String owner,double balance)
    {
        lista.add(new BankAccount(owner,balance));
    }
    
    public void printAccounts()
    {
        
        for(Object o:lista){
            System.out.println((String)o);
      }
    }
   
    public void  printAccounts(double minBalance,double maxBalance)
    {
        
    }
    public BankAccount getAccount(String owner){
        
    }
}
