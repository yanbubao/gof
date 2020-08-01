package april.pattern.behavioral.strategy.promotion;

/**
 * @author yanzx
 */
public class PromotionActivityContext {
    private IPromotionStrategy promotionStrategy;

    public PromotionActivityContext(IPromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute() {
        this.promotionStrategy.doPromotion();
    }
}
