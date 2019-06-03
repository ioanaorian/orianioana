package ro.utcluj.aut.isp.bankaccount;

import java.util.ArrayList;

public class AccountsManager {
    
    int n;
    ArrayList<BankAccount> listAccounts =new ArrayList<BankAccount>();
    

    public void addAccount(BankAccount account){
        listAccounts.add(account);
        n++;
    }

   public boolean exists(String id){
        for (BankAccount ba:listAccounts)
        if (ba.getId().equals(id)) return true;
     
        return false;
    }

    public int count(){
        return this.n;
    }
}
