package april.pattern.behavioral.state.general.apply;

/**
 * @author yanzx
 */
public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    protected abstract void handle();
}
