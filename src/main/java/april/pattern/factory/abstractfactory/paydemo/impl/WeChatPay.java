package april.pattern.factory.abstractfactory.paydemo.impl;

import april.pattern.factory.abstractfactory.paydemo.Payability;

/**
 * @author yanzx
 * @date 2020/05/31 22:52
 */
public class WeChatPay implements Payability {
    public void pay() {
        System.out.println("使用微支付！");
    }
}
