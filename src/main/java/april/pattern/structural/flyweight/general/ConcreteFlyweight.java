package april.pattern.structural.flyweight.general;

/**
 * @author yanzx
 */
public class ConcreteFlyweight implements IFlyweight {

    /**
     * 例如连接池中数据库url等信息
     */
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("hash address: " + System.identityHashCode(this));
        System.out.println("intrinsicState: " + this.intrinsicState);
        System.out.println("extrinsicState: " + extrinsicState);
    }
}
