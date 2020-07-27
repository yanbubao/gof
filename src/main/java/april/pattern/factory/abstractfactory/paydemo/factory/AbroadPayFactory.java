package april.pattern.factory.abstractfactory.paydemo.factory;

import april.pattern.factory.abstractfactory.paydemo.PayAbility;
import april.pattern.factory.abstractfactory.paydemo.impl.ApplePay;

/**
 * @author yanzx
 * @date 2020/05/31 23:01
 */
public class AbroadPayFactory extends PayFactory {

    @Override
    PayAbility chinaPay() {
        return null;
    }

    @Override
    PayAbility abroadPay() {
        return new ApplePay();
    }
}
