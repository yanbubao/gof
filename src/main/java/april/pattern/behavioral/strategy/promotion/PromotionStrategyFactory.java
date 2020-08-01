package april.pattern.behavioral.strategy.promotion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author yanzx
 */
public class PromotionStrategyFactory {

    private PromotionStrategyFactory() {
    }

    private static final Map<String, IPromotionStrategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put(PromotionKey.COUPON, new CouponStrategy());
        strategyMap.put(PromotionKey.CASHBACK, new CashBackStrategy());
        strategyMap.put(PromotionKey.GROUP_BUY, new GroupBuyStrategy());
    }

    private static final IPromotionStrategy EMPTY = new EmptyStrategy();

    public static IPromotionStrategy get(String promotionKey) {
        return strategyMap.getOrDefault(promotionKey, EMPTY);
    }

    public static Set<String> getPromotionKeys() {
        return strategyMap.keySet();
    }

    interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUP_BUY = "GROUP_BUY";
    }
}
