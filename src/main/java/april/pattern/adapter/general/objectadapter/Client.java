package april.pattern.adapter.general.objectadapter;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        System.out.println(adapter.request());
    }
}
