package april.pattern.behavioral.state.login;

/**
 * @author yanzx
 */
public class AppContext {
    public static final UserState STATE_LOGIN = new LoginState();
    public static final UserState STATE_LOGOUT = new LogoutState();

    private static final UserState DEFAULT_STATE = STATE_LOGOUT;

    private UserState currentState = DEFAULT_STATE;

    {
        AppContext.STATE_LOGIN.setContext(this);
        AppContext.STATE_LOGOUT.setContext(this);
    }

    public void setUserState(UserState userState) {
        this.currentState = userState;
    }

    public UserState getUserState() {
        return this.currentState;
    }

    public void favorite() {
        this.currentState.favorite();
    }

    public void comment(String comment) {
        this.currentState.comment(comment);
    }
}
