package april.pattern.adapter.demo.passport.v2;

import april.pattern.adapter.demo.passport.IPassportForThird;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        System.out.println(adapter.login4Token("token"));
    }
}
