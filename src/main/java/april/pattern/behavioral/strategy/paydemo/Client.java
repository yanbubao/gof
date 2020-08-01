package april.pattern.behavioral.strategy.paydemo;

import april.pattern.behavioral.strategy.paydemo.payport.PayContext;
import april.pattern.behavioral.strategy.paydemo.payport.PayStrategyFactory;
import april.pattern.behavioral.strategy.paydemo.payport.Payment;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        Payment payment = PayStrategyFactory.get(PayStrategyFactory.PayStrategyKey.DEFAULT_PAY);
        PayContext payContext = new PayContext(payment);
        MsgResult result = payContext.pay("123", 200d);
        System.out.println(result);
    }
}
