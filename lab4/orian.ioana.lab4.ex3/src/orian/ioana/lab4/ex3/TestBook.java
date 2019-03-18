package orian.ioana.lab4.ex3;

public class TestBook {

    public static void main(String args[]) {

        Author author1 = new Author("Agatha Christie", "agatha.christie@ymail.com", 'f');
        System.out.println(author1.getName() + " " + author1.getEmail() + " "+author1.getGender());
        Author author2 = new Author("Elena Ferrante", "elena.ferrante@ymail.com", 'f');
        System.out.println(author2.getName() + " " + author2.getEmail() + " "+author2.getGender());
        Book b1 = new Book("Tabloul", author1, 23.92);
        System.out.println(b1.getName() + " " + author1.getName() + " " + author1.getEmail() + " "+author1.getGender() + " " + b1.getPrice());
        Book b2 = new Book("Prietena mea geniala", author2, 26.25, 6);
        System.out.println(b2.getName() + " " + author2.getName() + " " + author2.getEmail() + " "+author2.getGender() + " " + b2.getPrice());
        String n1 = b1.getName();
        System.out.println(n1);
        Author a1 = b1.getAuthor();
        System.out.println(a1.getName()+" "+a1.getEmail()+" "+a1.getGender());
        double p1 = b1.getPrice();
        System.out.println(p1);
        b1.setPrice(20);
        System.out.println(b1.getName() + " " + author1.getName() + " " + author1.getEmail() + " "+author1.getGender()+ " " + b1.getPrice());
        int q2 = b2.getQtyInStock();
        System.out.println(q2);
        b2.setQtyInStock(6);
        System.out.println(b2.getName() + " " + author2.getName() + " " + author2.getEmail() + " "+author2.getGender() + " " + b2.getPrice() + " " + b2.getQtyInStock());

    }

}
