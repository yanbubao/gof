package april.pattern.behavioral.delegate.simple;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        new Boss().command("编程", new LeaderDelegate());
        new Boss().command("平面设计", new LeaderDelegate());

        new Boss().command("端茶送水", new LeaderDelegate());
    }
}
