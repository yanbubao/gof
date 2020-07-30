package april.pattern.structural.decorator.general;

/**
 * @author yanzx
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        // 转发请求给组件对象，可以在转发前后执行一些附加动作
        this.component.operation();
    }
}
