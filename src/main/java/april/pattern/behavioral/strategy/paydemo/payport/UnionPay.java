package april.pattern.behavioral.strategy.paydemo.payport;

/**
 * @author yanzx
 */
public class UnionPay extends Payment {
    @Override
    protected String getPaymentName() {
        return "银联支付";
    }

    @Override
    protected Double queryAmount(String uid) {
        return 120d;
    }
}
