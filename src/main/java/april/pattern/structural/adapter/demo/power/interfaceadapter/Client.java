package april.pattern.structural.adapter.demo.power.interfaceadapter;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        DC adapter = new AbstractPowerAdapter(new AC220()) {
            @Override
            public int output11V() {
                int adapterInput = this.ac220.outputAC220V();
                int adapterOutput = adapterInput / 20;
                System.out.println("使用Adapter输入AC" + adapterInput + "V,输出DC" + adapterOutput + "V");
                return adapterOutput;
            }
        };

        adapter.output5V();

        adapter.output11V();
    }
}
