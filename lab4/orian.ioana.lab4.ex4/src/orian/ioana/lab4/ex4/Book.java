package orian.ioana.lab4.ex4;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock;

    Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors=authors;
        this.price = price;
    }

    Book(String name, Author[] authors, double price, int qtyInStock) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthor() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }
    
   public void printAuthors() {
        for (Author author : authors) {
            System.out.print(author.getName()+" "+author.getEmail()+" "+author.getGender() + " ");
            System.out.println();
        }
}
    @Override
    public String toString(){
        int l=authors.length;
        return(name+" by "+l+" authors");
                
    }

}
