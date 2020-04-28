package design.pattern.SOLID.InterfaceSegregation;

/**
 *
 * @author maidul
 */
public class BalancedTree implements Tree,IBalanceTree{
     @Override
    public int getMax() {
         System.out.println("Balance tree");
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

    @Override
    public void rotatedLeft() {
        System.out.println("Rotating left method will be implement here...");
    }

    @Override
    public void rotatedRight() {
        System.out.println("Rotating right method will be implement here...");
    }
}
