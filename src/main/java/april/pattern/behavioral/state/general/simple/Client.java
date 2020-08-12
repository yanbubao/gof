package april.pattern.behavioral.state.general.simple;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        // 不设置状态，执行默认状态A绑定的行为
        context.handle();

        // 设置状态
        context.setCurrentState(new ConcreteStateB());
        context.handle();
    }
}
