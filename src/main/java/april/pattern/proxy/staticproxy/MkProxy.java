package april.pattern.proxy.staticproxy;

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
        System.out.println("从技术人员手里收取代理费用！");
    }

    private void before() {
        System.out.println("安排技术人员就位！");
    }
}
