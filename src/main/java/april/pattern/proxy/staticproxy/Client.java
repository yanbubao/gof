package april.pattern.proxy.staticproxy;

import april.pattern.proxy.James;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) {

        MkProxy mkProxy = new MkProxy(new James());
        mkProxy.makeLove("after insert");
    }
}
