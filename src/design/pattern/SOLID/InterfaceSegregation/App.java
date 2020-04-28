package design.pattern.SOLID.InterfaceSegregation;

/**
 *
 * @author maidul
 * 
 * INTERFACE SEGREGATION PRINCIPLE
 * 
 * What is the motivation?
 * We can have an abstraction of the system using interfaces
 * 
 * Sometime -> we want to implement that interface but just for the sake
 * of some methods defined in by that interface
 * But we have to implement all the methods "fat interfaces"
 * 
 * 
 * --it is about business logic to clients communication -it is not a good if an interface contains lot of methods
 * we should separate then accordingly
 * 
 *--The interface segregation principle states that no client should be forced to depend on method it does not use !!
 * -- when we can we should break our interfaces in many smaller ones, so they better
 * satisfy the exact needs of our clients
 */
public class App {
    public static void main(String[] args) {
        Tree t=new BinaryTree();
        t.getMax();
        Tree tt=new BalancedTree();
        tt.getMax();
    }
}
