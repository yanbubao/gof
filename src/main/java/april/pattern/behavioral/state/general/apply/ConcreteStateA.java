package april.pattern.behavioral.state.general.apply;

/**
 * @author yanzx
 */
public class ConcreteStateA extends State {

    @Override
    protected void handle() {
        System.out.println("StateA do action");
        // A中包含设置新状态和执行状态A的行为
        this.context.setState(Context.STATE_B);
        this.context.getState().handle();
    }
}
