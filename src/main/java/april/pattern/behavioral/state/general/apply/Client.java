package april.pattern.behavioral.state.general.apply;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteStateA());
        context.handler();
    }
}
