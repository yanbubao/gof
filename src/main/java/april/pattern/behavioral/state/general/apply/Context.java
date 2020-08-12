package april.pattern.behavioral.state.general.apply;


/**
 * Context和State相互组合
 *
 * @author yanzx
 */
public class Context {
    public static final State STATE_A = new ConcreteStateA();
    public static final State STATE_B = new ConcreteStateB();
    private static final State DEFAULT_STATE = STATE_A;

    private State currentState = DEFAULT_STATE;

    {
        Context.STATE_A.setContext(this);
        Context.STATE_B.setContext(this);
    }

    public void setState(State state) {
        this.currentState = state;
        this.currentState.setContext(this);
    }

    public State getState() {
        return this.currentState;
    }

    public void handler() {
        this.currentState.handle();
    }

}
