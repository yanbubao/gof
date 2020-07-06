package april.pattern.proxy.general;

import april.pattern.proxy.James;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) {
        MkProxy proxy = new MkProxy(new James());
        proxy.makeLove("after insert");
    }
}
