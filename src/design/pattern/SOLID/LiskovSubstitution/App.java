package design.pattern.SOLID.LiskovSubstitution;

/**
 *
 * @author maidul
 * 
 * LISKOV SUBSTITUTION PRINCIPLE
 * What is the motivation of Liskov principle?
 * 
 *    We usually create class hierarchies during the application development
 * For example: we extend some classes creating some derived classes !!!
 * It would be great if the new derived classed would work as well without
 * replacing the functionality of the classes.
 * Otherwise the new classes can produce undesired effects when the are
 * used in existing program modules.
 * 
 * --Child classes should never break the parent class type definition
 * --Let q(x) be a property provable about objects x of the type T. then q(y) should be provable for objects
 *   y of type S where S is a sbutype of T.
 * --Subtype must be substitutable for their base types ( derived types must be completely substitutable for their base type)
 *   We have to make sure there will be no problems using the subtype or the original class
 *   Do not break functionality !!! we can call the methods anyway
 * --We can solve it with the help of Template Pattern.
 * --It is not independent from open close Principle + interface segregation principle
 *   The violation of Liskov principle is a latent violation of open closed principle !!!
 */
public class App {
    public static void main(String[] args) {
        NormalVehicle v=new Car();
        v.speed();
    }
}
