package april.pattern.bridge.general;

/**
 * 修正抽象
 *
 * @author yanzx
 */
public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(IImplementor mImplementor) {
        super(mImplementor);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("refined operation");
    }
}
