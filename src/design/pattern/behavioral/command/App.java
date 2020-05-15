package design.pattern.behavioral.command;

/**
 *
 * @author maidul
 *
 * Command Pattern --> we can encapsulate method invocation, it encapsulates a
 * request as an object Good --> the object invoking the computation know
 * nothing about the implementation Four components::: command, receiver,invoker
 * and client
 *
 * Command: knows about receiver and invokes a method of the receiver values for
 * parameters of the receiver method are stored in the command!!!
 *
 * Receiver: does the work itself
 *
 * Invoker: knows how to execute a command, and optionally does bookkeeping
 * about the command execution the invoker does not anything about a concrete
 * command, it knows only about command interface !!!
 *
 * Client: The client decides which command to execute at which points to
 * execute a command, it passes the command object to the invoker object.
 *
 */
public class App {

    public static void main(String[] args) {
        Light light = new Light();
        LightOffCommand off = new LightOffCommand(light);
        LightOnCommand on = new LightOnCommand(light);
        Switcher sw = new Switcher();
        sw.addCommand(on);
        sw.addCommand(off);
        sw.executeCommands();
    }
}
