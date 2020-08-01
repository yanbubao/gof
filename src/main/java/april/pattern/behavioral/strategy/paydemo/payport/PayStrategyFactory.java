package april.pattern.behavioral.strategy.paydemo.payport;

import java.util.HashMap;
import java.util.Map;


/**
 * @author yanzx
 */
public class PayStrategyFactory {
    private PayStrategyFactory() {
    }

    private static final Map<String, Payment> PAYMENT_MAP = new HashMap<>();

    static {
        PAYMENT_MAP.put(PayStrategyKey.ALI_PAY, new AliPay());
        PAYMENT_MAP.put(PayStrategyKey.JD_PAY, new JDPay());
        PAYMENT_MAP.put(PayStrategyKey.WECHAT_PAY, new WeChatPay());
        PAYMENT_MAP.put(PayStrategyKey.UNION_PAY, new UnionPay());
    }

    public static Payment get(String payStrategyKey) {
        return PAYMENT_MAP.getOrDefault(payStrategyKey, PAYMENT_MAP.get(PayStrategyKey.DEFAULT_PAY));
    }

    public interface PayStrategyKey {
        String ALI_PAY = "AliPay";
        String JD_PAY = "JdPay";
        String WECHAT_PAY = "WeChatPay";
        String UNION_PAY = "UnionPay";
        String DEFAULT_PAY = ALI_PAY;
    }

}
