package design.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maidul
 */
public class Switcher {
    private List<Command> commandList;

    public Switcher() {
        this.commandList=new ArrayList<>();
    }
    
    public void addCommand(Command command){
        commandList.add(command);
    }
    
    public void executeCommands(){
        for (Command command : commandList) {
            command.execute();
        }
    }
}
