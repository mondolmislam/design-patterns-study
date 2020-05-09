package design.pattern.behavioral.strategy;

/**
 *
 * @author maidul
 */
public class Manager implements Strategy{
    
    private Strategy strategy;
    
    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }

    @Override
    public void operation(int num1, int num2) {
        this.strategy.operation(num1, num2);
    }
    
}
