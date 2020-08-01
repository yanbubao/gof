package april.pattern.behavioral.strategy.promotion;

import java.util.Set;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        // client先获取所有策略
        Set<String> promotionKeys = PromotionStrategyFactory.getPromotionKeys();

        // 根据策略key获取策略类
        IPromotionStrategy strategy = PromotionStrategyFactory.get(PromotionStrategyFactory.PromotionKey.COUPON);
        PromotionActivityContext promotionActivityContext = new PromotionActivityContext(strategy);
        promotionActivityContext.execute();
    }
}
