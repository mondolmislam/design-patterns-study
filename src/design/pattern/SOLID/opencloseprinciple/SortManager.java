package design.pattern.SOLID.opencloseprinciple;

/**
 *
 * @author maidul
 */
public class SortManager {
    public void sort(Sorter sorter){
        if(sorter.type==SortType.INSERTIONSORT){
            doInsertionSort(sorter);
        }else if(sorter.type==SortType.MERGESORT){
            doMergeSort(sorter);
        }
    }

    private void doInsertionSort(Sorter sorter) {
        sorter.sort();
    }

    private void doMergeSort(Sorter sorter) {
        sorter.sort();
    }
}
