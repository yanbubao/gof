package april.pattern.proxy.staticproxy;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) {

        MkProxy mkProxy = new MkProxy(new James());
        mkProxy.makeLove("after insert");
    }
}
