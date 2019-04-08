package orian.ioana.lab6.ex2;


public class Test {
    public static void main(String[] args) {
        Bank b=new Bank();
        b.addAccount("owner1",1625.25);
        b.addAccount("owner2",167.69);
        b.addAccount("owner3",555.10);
        b.addAccount("owner4",984.85);
        System.out.println("All accounts with the ballance between 400 and 100");
        b.printAccounts(400,1000);
        System.out.println("The sorted list by balance");
        b.printAccounts();

        System.out.println("The sorted list by name");
        b.getAllAcounts();

        System.out.println(b.getAccount("owner3"));

    }
}

