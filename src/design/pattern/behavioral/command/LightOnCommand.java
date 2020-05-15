package design.pattern.behavioral.command;

/**
 *
 * @author maidul
 * 
 * Invoker
 */
public class LightOnCommand implements Command{
    
    private Light light;
    
    public LightOnCommand(Light light){
        this.light=light;
    }
    

    @Override
    public void execute() {
        this.light.lightOn();
    }
    
}
