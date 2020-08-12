package april.pattern.behavioral.state.login;

/**
 * @author yanzx
 */
public class LoginState extends UserState {

    @Override
    protected void favorite() {
        System.out.println("收藏成功！");
    }

    @Override
    protected void comment(String comment) {
        System.out.println(comment);
    }
}
