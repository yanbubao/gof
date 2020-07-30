package april.pattern.structural.proxy.general;

import april.pattern.structural.proxy.Customer;
import april.pattern.structural.proxy.IPerson;

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
        System.out.println("mk after!");
    }

    private void before() {
        System.out.println("mk before!");
    }
}
