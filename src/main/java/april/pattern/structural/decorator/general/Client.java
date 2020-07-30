package april.pattern.structural.decorator.general;

/**
 * @author yanzx
 */
public class Client {

    public static void main(String[] args) {
        Component component;

        // 首先创建需要被装饰的原始对象(即要被装饰的对象)
        component = new ConcreteComponent();

        component = new ConcreteDecoratorA(component);

        component = new ConcreteDecoratorB(component);

        component.operation();
    }
}
