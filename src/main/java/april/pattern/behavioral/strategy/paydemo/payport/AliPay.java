package april.pattern.behavioral.strategy.paydemo.payport;

/**
 * @author yanzx
 */
public class AliPay extends Payment {
    @Override
    protected String getPaymentName() {
        return "支付宝";
    }

    @Override
    protected Double queryAmount(String uid) {
        return 900d;
    }
}
