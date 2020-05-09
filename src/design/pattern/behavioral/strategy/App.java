package design.pattern.behavioral.strategy;

/**
 *
 * @author maidul
 * 
 * Strategy Design pattern
 * 
 * Very important principle #1: in design -> take what varies and encapsulated it ... and it will not affect the rest of our code.
 *              The code will be much more flexible ... later you can alter or extend the parts that very without affecting those that does not !!!
 *                  code that change <----------> code that stays the same
 * Very Important principle #2: in design -> program to an interface/supertype not and implementation !!!
 *              Abstract supclass would be perfect too......
 *              -- the actual runtime object is not locked into the code
 *              -- the type of variable should be a supertype/interface: can be of any concrete implementation
 *              Dog dog=new Dog() not so good "programming to an implementation"
 *              Animal dog=new Dog() GOOD     "programming to an interface"
 *          Sometimes it is good to separate behaviors from implementation: easier to reuse it
 *          + we can add new behavior without modifying any of our existing behavior classes !!
 *              SOLID PRINCIPLE!!!
 * Very important Principle #3: in design: Favor composition over inheritance !!!
 *              Composition: HAS-A relationship -> it gives you a lot more flexibility
 *              1. you can encapsulate stuffs into their own set of classes
 *              2. YOU CAN CHANGE BEHAVIOR  AT RUNTIME with interfaces
 *              So composition is used in several design patterns
 * 
 */
public class App {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.setStrategy(new Multiply());
        manager.operation(2, 4);
    }
}
