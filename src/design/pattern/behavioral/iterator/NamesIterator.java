package design.pattern.behavioral.iterator;

/**
 *
 * @author maidul
 */
public class NamesIterator implements Iterator {

    private String[] names;
    private int index;

    public NamesIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < this.names.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return this.names[index++];
        }
        return null;
    }

}
