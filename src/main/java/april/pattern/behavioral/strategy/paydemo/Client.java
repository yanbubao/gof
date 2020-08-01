package april.pattern.behavioral.strategy.paydemo;

import april.pattern.behavioral.strategy.paydemo.payport.PayContext;
import april.pattern.behavioral.strategy.paydemo.payport.PayStrategyFactory;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        PayContext payContext = new PayContext();
        payContext.setOrder(new Order("123", "12431213124123", 200d));
        MsgResult result = new PayService(payContext).pay(PayStrategyFactory.PayStrategyKey.DEFAULT_PAY);

        System.out.println(result);
    }
}
