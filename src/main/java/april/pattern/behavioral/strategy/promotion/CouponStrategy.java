package april.pattern.behavioral.strategy.promotion;

/**
 * @author yanzx
 */
public class CouponStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("使用优惠券抵扣");
    }
}
