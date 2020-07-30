package april.pattern.structural.proxy.general;

import april.pattern.structural.proxy.James;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) {
        MkProxy proxy = new MkProxy(new James());
        proxy.makeLove("after insert");
    }
}
