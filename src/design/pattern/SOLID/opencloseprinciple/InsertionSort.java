package design.pattern.SOLID.opencloseprinciple;

/**
 *
 * @author maidul
 */
public class InsertionSort extends Sorter {

    public InsertionSort() {
        super.type = SortType.INSERTIONSORT;
    }

    @Override
    protected void sort() {
        System.out.println("Insertion sort implement here...");
    }
}
