package april.pattern.proxy;

/**
 * @author yanzx
 */
public class James extends Customer implements IPerson {
    @Override
    public void makeLove(String mode) {
        System.out.println("James use " + mode + " mk!");
    }
}
