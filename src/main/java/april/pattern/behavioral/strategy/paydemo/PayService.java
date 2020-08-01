package april.pattern.behavioral.strategy.paydemo;

import april.pattern.behavioral.strategy.paydemo.payport.PayContext;

/**
 * @author yanzx
 */
public class PayService {

    // DI
    private PayContext payContext;

    public PayService(PayContext payContext) {
        this.payContext = payContext;
    }

    public MsgResult pay(String paymentStrategy) {
        return payContext.pay(paymentStrategy);
    }
}
