package april.pattern.bridge.general;

/**
 * 抽象，桥梁
 * 中通过组合带有 具体实现的抽象
 *
 * @author yanzx
 */
public abstract class Abstraction {
    protected IImplementor mImplementor;

    public Abstraction(IImplementor mImplementor) {
        this.mImplementor = mImplementor;
    }

    public void operation() {
        this.mImplementor.operationImpl();
    }
}
