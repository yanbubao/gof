package april.pattern.behavioral.delegate.general;

/**
 * @author yanzx
 */
public class ConcreteB implements Task {
    @Override
    public void doAction() {
        System.out.println("执行 , 由B实现");
    }
}
