package design.pattern.SOLID.srp.impl;

/**
 *
 * @author maidul
 */
public class BookPersistance {
    public void save(Book book){
        System.out.println("Saving.....");
        System.out.println("Book " + " name = " + book.getName() + ", no Of Pages = " + book.getNoOfPages() + ", author = " + book.getAuthor());
        System.out.println("Saved successfully..");
    }
}
