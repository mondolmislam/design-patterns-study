package design.pattern.SOLID.singleResponsibilityPrinciple.withoutImpl;

/**
 *
 * @author maidul
 */
public class Book {

    //feature or attributes
    private String name;
    private int noOfPages;
    private String author;

    //custom constructor
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

    // here break the rules of SINGLE RESPONSIBILITY PRINCIPLE
    public void save() {
        System.out.println("Book saved!!!!");
    }

    // here break the rules of SINGLE RESPONSIBILITY PRINCIPLE
    public void print() {
        System.out.println("Printing.................");
        System.out.println("Book " + " name = " + name + ", noOfPages = " + noOfPages + ", author = " + author);
    }

    @Override
    public String toString() {
        return "Book " + " name = " + name + ", noOfPages = " + noOfPages + ", author = " + author;
    }
}
