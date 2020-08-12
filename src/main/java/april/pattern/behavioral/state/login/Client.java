package april.pattern.behavioral.state.login;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        AppContext appContext = new AppContext();
        appContext.favorite();

        appContext.comment("评论：调用comment函数时状态已经切换为LoginState了！");
    }
}
