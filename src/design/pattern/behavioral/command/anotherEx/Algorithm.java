package design.pattern.behavioral.command.anotherEx;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;


/**
 *
 * @author maidul
 */
public class Algorithm {
    private BlockingDeque<Command> commandList;

    public Algorithm() {
        this.commandList=new LinkedBlockingDeque<Command>(10);
    }
    
    public void produce(){
        try{
            for (int i = 0; i < 10; i++) {
                commandList.put(new TaskSolver(new Task(i+1)));
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    public void consume(){
        try{
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                commandList.take().execute();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
