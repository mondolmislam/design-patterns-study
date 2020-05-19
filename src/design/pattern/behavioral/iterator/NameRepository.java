package design.pattern.behavioral.iterator;

/**
 *
 * @author maidul
 */
public class NameRepository {

    private String[] names = {"Adam", "Joe", "Maidul", "abdul khalid"};

    public Iterator getIterator() {
        return new NamesIterator(names);
    }
}
