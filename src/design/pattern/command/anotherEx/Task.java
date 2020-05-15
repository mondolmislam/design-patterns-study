package design.pattern.command.anotherEx;

/**
 *
 * @author maidul
 */
public class Task {

    private int id;

    public Task(int id) {
        this.id = id;
    }

    public void solveProblem() {
        System.out.println("Solve the problem with id " + id);
    }
}
