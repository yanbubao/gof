package april.pattern.factory.abstractfactory.paydemo.impl;

import april.pattern.factory.abstractfactory.paydemo.Payability;

/**
 * @author yanzx
 * @date 2020/05/31 22:54
 */
public class ApplePay implements Payability {
    public void pay() {
        System.out.println("使用苹果支付！");
    }
}
