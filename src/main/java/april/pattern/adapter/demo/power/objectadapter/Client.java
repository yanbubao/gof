package april.pattern.adapter.demo.power.objectadapter;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter(new AC220());
        // 跟classAdapter相比，解决了适配器仍具有原Adaptee的问题
        adapter.output5V();
    }
}
