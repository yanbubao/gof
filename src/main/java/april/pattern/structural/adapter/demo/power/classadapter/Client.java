package april.pattern.structural.adapter.demo.power.classadapter;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter();
        adapter.output5V();

        System.out.println("**********************");
        // 适配器会兼容原有功能
        adapter.outputAC220V();
    }
}
