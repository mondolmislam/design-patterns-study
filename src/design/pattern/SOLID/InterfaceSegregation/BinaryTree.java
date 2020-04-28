package design.pattern.SOLID.InterfaceSegregation;

/**
 *
 * @author maidul
 */
public class BinaryTree implements Tree{

    @Override
    public int getMax() {
        System.out.println("After implementing. You will get max value, example: 10 here");
        return 10;
    }

    @Override
    public int getMin() {
        System.out.println("After implementing. you will get actual min value. Example 5 here");
        return 5;
    }

    @Override
    public void traverse() {
        System.out.println("Traversal methodology implemented here...");
    }
    
}
