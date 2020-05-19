package design.pattern.behavioral.iterator;

/**
 *
 * @author maidul
 * 
 * Iterator pattern is very commonly used design pattern in java !!
 * This is used to get a way to access the elements of a collection object in 
 * sequential manner without any need to know its underlying representation.
 */
public class App {
    public static void main(String[] args) {
        NameRepository repository=new NameRepository();
        for (Iterator iterator = repository.getIterator(); iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println(name);
        }
    }
}
