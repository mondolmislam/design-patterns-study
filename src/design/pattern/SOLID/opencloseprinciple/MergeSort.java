package design.pattern.SOLID.opencloseprinciple;

/**
 *
 * @author maidul
 */
public class MergeSort extends Sorter{

    public MergeSort(){
        super.type=SortType.MERGESORT;
    }
    @Override
    protected void sort() {
        System.out.println("Mergesort implemented here.");
    }
    
}
