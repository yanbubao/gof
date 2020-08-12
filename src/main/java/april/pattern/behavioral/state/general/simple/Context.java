package april.pattern.behavioral.state.general.simple;

/**
 * 上下文持有状态
 *
 * @author yanzx
 */
public class Context {

    private static final IState STATE_A = new ConcreteStateA();
    private static final IState STATE_B = new ConcreteStateB();

    private static final IState DEFAULT_STATE = STATE_A;

    private IState currentState = DEFAULT_STATE;

    public void setCurrentState(IState state) {
        this.currentState = state;
    }

    public void handle() {
        this.currentState.handle();
    }
}
