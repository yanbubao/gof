package april.pattern.bridge.general;

/**
 * 具体实现A
 *
 * @author yanzx
 */
public class ConcreteImplementorA implements IImplementor {
    @Override
    public void operationImpl() {
        System.out.println("I'm ConcreteImplementor A");
    }
}
