package orian.ioana.lab4.ex4;

public class TestBook {
    
    public static void main(String args[]){
        
        Author[] authors=new Author[3];
        authors[0]=new Author("Sajj Kjjk ","sajj.kjjk@ymail.com ",'m');
        authors[1]=new Author("Fdff Aggg ","fdff.aggg@ymail.com ",'m');
        authors[2]=new Author("Fdff Aggg ","fdff.aggg@ymail.com ",'m');
        Book b1=new Book("ada",authors,25);
        System.out.println(b1.toString());
        b1.printAuthors();
        
                
    }
    
}
