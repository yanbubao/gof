package april.pattern.proxy.staticproxy;

/**
 * @author yanzx
 */
public class James extends Customer {
    @Override
    public void makeLove(String mode) {
        System.out.println("James use " + mode + " mk!");
    }
}
