package april.pattern.behavioral.chain.auth.optimiaze;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        new MemberService().login("yanzx", "123");
    }
}
