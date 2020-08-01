package april.pattern.behavioral.strategy.general;

/**
 * @author yanzx
 */
public class ConcreteStrategyA implements IStrategy {
    @Override
    public void algorithm() {
        System.out.println("Strategy A");
    }
}
