package april.pattern.behavioral.strategy.paydemo.payport;

import april.pattern.behavioral.strategy.paydemo.MsgResult;
import april.pattern.behavioral.strategy.paydemo.Order;

/**
 * @author yanzx
 */
public class PayContext {

    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public MsgResult pay(String paymentStrategy) {
        Payment payment = PayStrategyFactory.get(paymentStrategy);
        System.out.println("欢迎使用" + payment.getPaymentName());
        System.out.println("本次交易金额为" + order.getAmount() + "，开始扣款");
        return payment.pay(order.getUid(), order.getAmount());
    }
}
