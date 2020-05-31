package april.pattern.factory.abstractfactory.paydemo.factory;

import april.pattern.factory.abstractfactory.paydemo.Payability;
import april.pattern.factory.abstractfactory.paydemo.impl.ApplePay;

/**
 * @author yanzx
 * @date 2020/05/31 23:01
 */
public class AbroadPayFactory extends PayFactory {

    @Override
    Payability chinaPay() {
        return null;
    }

    @Override
    Payability abroadPay() {
        return new ApplePay();
    }
}
