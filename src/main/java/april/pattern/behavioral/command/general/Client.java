package april.pattern.behavioral.command.general;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        Invoke invoke = new Invoke(new ConcreteCommand());
        invoke.action();
    }
}
