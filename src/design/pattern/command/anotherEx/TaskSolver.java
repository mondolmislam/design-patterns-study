package design.pattern.command.anotherEx;

/**
 *
 * @author maidul
 */
public class TaskSolver implements Command{
    private Task task;

    public TaskSolver(Task task) {
        this.task=task;
    }

    @Override
    public void execute() {
        this.task.solveProblem();
    }    
    
}
