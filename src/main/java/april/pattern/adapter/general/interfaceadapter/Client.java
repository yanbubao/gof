package april.pattern.adapter.general.interfaceadapter;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee()) {
            @Override
            public int request1() {
                return this.adaptee.specificRequest() / 10;
            }
        };
        System.out.println(target.request1());
    }
}
