package april.pattern.proxy.dynamicproxy.myproxy.client;

import april.pattern.proxy.IPerson;
import april.pattern.proxy.James;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        IPerson proxy = new MkProxy().getInstance(new James());
        proxy.makeLove("after insert");
    }
}
