package april.pattern.behavioral.strategy.paydemo.payport;

import april.pattern.behavioral.strategy.paydemo.MsgResult;

/**
 * @author yanzx
 */
public abstract class Payment {

    protected abstract String getPaymentName();

    protected abstract Double queryAmount(String uid);

    public MsgResult pay(String uid, Double amount) {
        if (queryAmount(uid) < amount) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额" + amount);
    }
}
