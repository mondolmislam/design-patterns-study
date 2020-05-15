package design.pattern.behavioral.command.anotherEx;

/**
 *
 * @author maidul
 * 
 * Command package a piece of computation ... this computation
 * may be invoked long after the command objects are created
 * 
 * - it can be invoked by different threads
 * - schedules, thread pools, job queues
 */
public class App {
    public static void main(String[] args) {
        final Algorithm a=new Algorithm();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                a.produce();
            }
        });
        
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                a.consume();
            }
        });
        
        t1.start();
        t2.start();
    }
    
}
