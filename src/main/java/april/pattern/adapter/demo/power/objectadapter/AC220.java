package april.pattern.adapter.demo.power.objectadapter;

/**
 * Adaptee 被适配的角色
 *
 * @author yanzx
 */
public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出电压" + output + "V");
        return output;
    }
}
