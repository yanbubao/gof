package april.pattern.factory.abstractfactory.paydemo.factory;

import april.pattern.factory.abstractfactory.paydemo.PayAbility;
import april.pattern.factory.abstractfactory.paydemo.impl.AlibabaPay;

/**
 * @author yanzx
 * @date 2020/05/31 22:55
 */
public class ChinaPayFactory extends PayFactory {

    @Override
    PayAbility chinaPay() {
        return new AlibabaPay();
    }

    @Override
    PayAbility abroadPay() {
        return null;
    }

}
