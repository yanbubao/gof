package april.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author yanzx
 */
public class PojoEvent {
    @Subscribe
    public void observer(Object arg) {
        if (arg instanceof Pojo) {
            System.out.println("执行PojoEvent方法，传参为：" + arg);
        }
    }
}
