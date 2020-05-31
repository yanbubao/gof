package april.pattern.factory.abstractfactory.paydemo.factory;

import april.pattern.factory.abstractfactory.paydemo.Payability;
import april.pattern.factory.abstractfactory.paydemo.impl.AlibabaPay;

/**
 * @author yanzx
 * @date 2020/05/31 22:55
 */
public class ChinaPayFactory extends PayFactory {

    @Override
    Payability chinaPay() {
        return new AlibabaPay();
    }

    @Override
    Payability abroadPay() {
        return null;
    }

}
