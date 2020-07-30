package april.pattern.structural.proxy.dynamicproxy.jdkproxy;

import april.pattern.structural.proxy.IPerson;
import april.pattern.structural.proxy.James;

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
