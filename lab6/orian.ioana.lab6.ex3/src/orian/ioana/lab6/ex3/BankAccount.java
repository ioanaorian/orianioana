package orian.ioana.lab6.ex3;

/**
 *
 * @author Alexandra
 */
public class BankAccount implements Comparable<BankAccount> {
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
        public double getBalance(){
             return this.balance;
         }
        public String getOwner(){
             return this.owner;
         }

        @Override
        public boolean equals(Object o)
        {
            if(o==null|| !(o instanceof BankAccount))
                return false;
            BankAccount o2=(BankAccount)o;
            return ((o2.owner == owner)&&(o2.balance == balance));

        }
        @Override
        public int hashCode()
        {

            return owner.hashCode();
        }

       @Override
       public int compareTo(BankAccount o) {
        return (int) (this.balance-((BankAccount) o).getBalance());
       }
}


