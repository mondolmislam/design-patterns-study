package design.pattern.SOLID.DependencyInversionPrinciple;

/**
 *
 * @author maidul
 *
 * DEPENDENCY INVERSION PRINCIPLE
 *
 * What is the motivation?
 *
 * When we develop a software or an application First we create the low level
 * modules --->bluetooth communication,XML parser, disk access, database
 * connection second -->we implement the high level modules that heavily on the
 * low level ones
 *
 * HIGH LEVEL MODULES ^ | | ^ LOW LEVEL MODULES What if we want to replace a low
 * level module? we have to change the whole high level implementation as well
 * For example: connect to oracle instead of MySQL or want to store data in XML
 * instead of CSV
 *
 * Conclusion: high level modules should not depend on low level modules we have
 * to use abstraction and an abstract layer between teh low and high level
 * modules
 *
 * HIGH LEVEL MODULES <----> ABSTRACT LEVEL (INTERFACE) <----> LOW LEVEL MODULES
 * !!! ---------------------------------------------------- --very difficult to
 * apply: but it is the most important principle --high level modules should not
 * depend on low level modules--- Both should depend on abstraction!!!
 * Abstraction should not depend on detail... Detail should depend upon
 * abstraction
 *
 * Dog dog=new Dog() create Animal interface Animal dog=new Dog();
 *
 */
public class App {

    public static void main(String[] args) {
        DatabaseHandler handler = new DatabaseHandler(new MySQLDatabase());
        handler.connect();
        handler.disconnect();
    }
}
