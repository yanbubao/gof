package april.pattern.behavioral.state.general.apply;

/**
 * @author yanzx
 */
public class ConcreteStateB extends State {
    @Override
    protected void handle() {
        System.out.println("StateB do action");
    }
}
