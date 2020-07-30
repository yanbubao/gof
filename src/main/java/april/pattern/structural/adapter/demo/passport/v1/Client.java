package april.pattern.structural.adapter.demo.passport.v1;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) {
        PassportForThirdAdapter adapter = new PassportForThirdAdapter();
        adapter.login4QQ("openId123456");
        adapter.login("userName", "password");
    }
}
