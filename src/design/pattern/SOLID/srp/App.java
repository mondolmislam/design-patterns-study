package design.pattern.SOLID.srp;

import design.pattern.SOLID.srp.impl.Book;
import design.pattern.SOLID.srp.impl.BookHandler;

/**
 *
 * @author maidul
 * 
 * SINGLE RESPONSIBILITY PRINCIPLE
 * 
 * A software entity (class, method) should have only one reason to change
 * 1. if a class or a method does more than one procedure
 *    It is advisable to separate it into two distinct class/methods
 * It can be done easily with the help of interfaces 
 * 
 * So if we have 2 reason to change for a class -> we should split the functionality
 * into two separate classes
 * each class will handle a SINGLE RESPONSIBILITY
 * 
 * it leads to a low coupled design with less and lighter dependencies
 */
public class App {
    public static void main(String[] args) {
//        System.out.println("Without SIP");
//        Book book=new Book("JAVA",2000,"Harbard Sheild");
//        book.print();
        System.out.println("With SIP");
        BookHandler books=new Book("Programming C", 400, "Balagrosami");
        books.save();
        books.print();
        
    }
}
