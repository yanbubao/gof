package april.pattern.proxy.dynamicproxy.jdkproxy;

import april.pattern.proxy.IPerson;
import april.pattern.proxy.James;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) {
        JdkMkProxy mkProxy = new JdkMkProxy();
        IPerson james = mkProxy.getInstance(new James());
        james.makeLove("after insert");


    }
}
