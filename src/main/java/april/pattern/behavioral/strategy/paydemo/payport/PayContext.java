package april.pattern.behavioral.strategy.paydemo.payport;

import april.pattern.behavioral.strategy.paydemo.MsgResult;

/**
 * @author yanzx
 */
public class PayContext {
    private Payment payment;

    public PayContext(Payment payment) {
        this.payment = payment;
    }

    public MsgResult pay(String uid, Double amount) {
        return this.payment.pay(uid, amount);
    }
}
