package april.pattern.decorator.general;

/**
 * base包装器组件
 *
 * @author yanzx
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent 处理业务逻辑");
    }
}
