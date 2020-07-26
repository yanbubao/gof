package april.pattern.adapter.general.classadapter;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        System.out.println(adapter.request());
    }
}
