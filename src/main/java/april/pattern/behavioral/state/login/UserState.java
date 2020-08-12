package april.pattern.behavioral.state.login;

/**
 * @author yanzx
 */
public abstract class UserState {

    protected AppContext context;

    public void setContext(AppContext context) {
        this.context = context;
    }

    protected abstract void favorite();

    protected abstract void comment(String comment);
}
