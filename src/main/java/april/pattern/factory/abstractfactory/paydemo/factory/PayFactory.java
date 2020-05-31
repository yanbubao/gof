package april.pattern.factory.abstractfactory.paydemo.factory;

import april.pattern.factory.abstractfactory.paydemo.Payability;

/**
 * @author: yanzx
 * @date: 2020/05/31 22:50
 */
public abstract class PayFactory {

    abstract Payability chinaPay();

    abstract Payability abroadPay();

}
