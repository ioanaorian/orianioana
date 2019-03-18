package orian.ioana.lab4.ex2;


public class TestAuthor {
    
    public static void main(String args[]){
        
        Author a1=new Author("Popescu Andrei","andrei.popescu@yahoo.com",'m');
        System.out.println(a1.toString());
        String n1=a1.getName();
        System.out.println(n1);
        String e1=a1.getEmail();
        System.out.println(e1);
        a1.setEmail("popescu.andrei@gmail.com");
        System.out.println(a1.toString());
        char g1=a1.getGender();
        System.out.println(g1);
        
        
        
    }
    
}