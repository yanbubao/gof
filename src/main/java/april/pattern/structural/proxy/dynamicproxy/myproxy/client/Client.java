package april.pattern.structural.proxy.dynamicproxy.myproxy.client;

import april.pattern.structural.proxy.IPerson;
import april.pattern.structural.proxy.James;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        IPerson proxy = new MkProxy().getInstance(new James());
        proxy.makeLove("after insert");
    }
}
