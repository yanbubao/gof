package april.pattern.delegate.general;

/**
 * @author yanzx
 */
public class ConcreteA implements Task {
    @Override
    public void doAction() {
        System.out.println("执行 , 由A实现");
    }
}
