package april.pattern.proxy.staticproxy;

import april.pattern.proxy.Customer;
import april.pattern.proxy.IPerson;

/**
 * @author yanzx
 */
public class MkProxy implements IPerson {

    private Customer customer;

    public MkProxy(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void makeLove(String mode) {
        before();
        this.customer.makeLove(mode);
        after();
    }

    private void after() {
        System.out.println("mk after！");
    }

    private void before() {
        System.out.println("mk before！");
    }
}