package design.pattern.SOLID.opencloseprinciple;

/**
 *
 * @author maidul
 * 
 * OPEN/CLOSE PRINCIPLE
 * 
 * What is the motivation behind the principle?
 * An application should take care of the frequent changes that are done during 
 * the development and maintaining phase of an application.
 * Example: new functionalities have to be added...
 * 
 * Those change in the existing code should be minimized.
 * WHY?
 * It's assumed that the existing code is already unit tested and change in already 
 * written might affect the existing functionality in an unwanted manner.
 * 
 * 
 * Open closed principle states that the design and writing of the code should be done in way
 * that new functionality should be added with minimum changes in the existing code.
 * WE SHOULD KEEP AS MUSH EXISTING CODE UNCHANGE AS POSSIBLE!!!
 * 
 * --Software entities should be open for extension, but closed for modification.
 * We have to design every new module if we add a new behavior, we do not have to change the existing modules
 * -- closely related to the single responsibility principle!!
 * -- a class should not extend an other class explicitly
 * we should have a common interface
 * WHY?  because we can change the classes at runtime due to the common interface!!!
 * 
 * Example: We want to show a progress dialog but it can due to some download or loading of some music etc....
 * We want to decide at runtime why we want to show the dialog
 * 
 * -- We can make sure the principle is not violated
 * 1. Strategy pattern
 * 2. template pattern
 * 
 *                  Sorter
 *                  /    \
 *                 /      \
 *            MerseSort   InsertionSort
 *            In SortManager Has a relation Sorter
 * 
 */
public class App {
    public static void main(String[] args) {
        SortManager sortManger=new SortManager();
        sortManger.sort(new InsertionSort());
    }
}
