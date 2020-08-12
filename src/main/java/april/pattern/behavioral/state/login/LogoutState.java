package april.pattern.behavioral.state.login;

/**
 * @author yanzx
 */
public class LogoutState extends UserState {
    @Override
    protected void favorite() {
        this.switch2Login();
        this.context.favorite();
    }

    @Override
    protected void comment(String comment) {
        this.switch2Login();
        this.context.comment(comment);
    }

    public void switch2Login() {
        System.out.println("跳转到登录页！");
        this.context.setUserState(AppContext.STATE_LOGIN);
    }
}
