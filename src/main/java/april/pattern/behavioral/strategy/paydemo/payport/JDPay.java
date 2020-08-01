package april.pattern.behavioral.strategy.paydemo.payport;

/**
 * @author yanzx
 */
public class JDPay extends Payment {
    @Override
    protected String getPaymentName() {
        return "京东白条";
    }

    @Override
    protected Double queryAmount(String uid) {
        return 500d;
    }
}
