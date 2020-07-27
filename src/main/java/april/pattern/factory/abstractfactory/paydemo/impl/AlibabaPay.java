package april.pattern.factory.abstractfactory.paydemo.impl;

import april.pattern.factory.abstractfactory.paydemo.PayAbility;

/**
 * @author yanzx
 * @date 2020/05/31 22:53
 */
public class AlibabaPay implements PayAbility {
    public void pay() {
        System.out.println("使用支付宝支付！");
    }
}
