package design.pattern.SOLID.srp.impl;

/**
 *
 * @author maidul
 */
public class Book implements PrintHandler,Persistance{

    private String name;
    private int noOfPages;
    private String author;

    public Book(String name, int noOfPages, String author) {
        this.name = name;
        this.noOfPages = noOfPages;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book " + " name = " + name + ", no Of Pages = " + noOfPages + ", author = " + author;
    }

    @Override
    public void print() {
        System.out.println("Print start ......");
        System.out.println("Book " + " name = " + name + ", no Of Pages = " + noOfPages + ", author = " + author);
        System.out.println("Print successfully..");
    }

    @Override
    public void save() {
        System.out.println("Saving.....");
        System.out.println("Book " + " name = " + name + ", no Of Pages = " + noOfPages + ", author = " + author);
        System.out.println("Saved successfully..");
    }
}
