package april.pattern.factory.abstractfactory.paydemo.factory;

import april.pattern.factory.abstractfactory.paydemo.PayAbility;

/**
 * @author: yanzx
 * @date: 2020/05/31 22:50
 */
public abstract class PayFactory {

    abstract PayAbility chinaPay();

    abstract PayAbility abroadPay();

}
