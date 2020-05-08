package design.pattern.SOLID.singleResponsibilityPrinciple.impl;

/**
 *
 * @author maidul
 */
public class BookPersistance {
    public void save(Book book){
        System.out.println("Saving the book: "+book);
    }
}
