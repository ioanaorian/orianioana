package orian.ioana.lab6.ex1;


public class TestBankAccount {
    
     public static void main(String [] args)
    {
    BankAccount b1=new BankAccount("owner1",300.00);
    BankAccount b2=new BankAccount("owner1",300.00);
    BankAccount b3=new BankAccount("owner2",400.00);
    if(b1.equals(b2) ) System.out.println("b1 and b2 are equals.");
    else System.out.println("b1 and b2 are NOT equals."); 
    if(b1.equals(b3) ) System.out.println("b1 and b3 are equals.");
    else System.out.println("b1 and b3 are NOT equals.");
    if(b2.equals(b3) ) System.out.println("b2 and b3 are equals.");
    else System.out.println("b2 and b3 are NOT equals.");
    
    if(b1.hashCode()==b2.hashCode()) System.out.println("b1 and b2 are equals.");
    else System.out.println("b1 and b2 are NOT equals.");   
    if(b2.hashCode()==b3.hashCode()) System.out.println("b2 and b3 are equals.");
    else System.out.println("b2 and b3 are NOT equals.");  

}
}
