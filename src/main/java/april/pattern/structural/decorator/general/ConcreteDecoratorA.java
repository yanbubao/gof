package april.pattern.structural.decorator.general;

/**
 * @author yanzx
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        operationBefore();
        super.operation();
        operationAfter();
    }

    /**
     * 调用父类的operation方法之前需要执行的操作
     */
    private void operationAfter(){
        System.out.println("after");
    }

    /**
     * 在调用父类的operation方法之后需要执行的操作
     */
    private void operationBefore(){
        System.out.println("before");
    }
}
