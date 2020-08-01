package april.pattern.behavioral.strategy.paydemo.payport;

/**
 * @author yanzx
 */
public class WeChatPay extends Payment {
    @Override
    protected String getPaymentName() {
        return "微信支付";
    }

    @Override
    protected Double queryAmount(String uid) {
        return 263.2d;
    }
}
