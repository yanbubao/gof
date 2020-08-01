package april.pattern.behavioral.strategy.promotion;

/**
 * @author yanzx
 */
public class EmptyStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无优惠");
    }
}
