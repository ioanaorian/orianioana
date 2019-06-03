package ro.utcluj.aut.isp.bankaccount;

import java.util.*;

public class AccountsManager {

    int n;
    ArrayList<BankAccount> list=new ArrayList<BankAccount>();
    public void addAccount(BankAccount account){
        list.add(account);
        n++;
    }
 
    public boolean exists(String id){
        for(BankAccount e:list){
            if(e.getId().equals(id))
                return true;
        }
        return false;
    }

    public int count(){
        return this.n;
    }
}
