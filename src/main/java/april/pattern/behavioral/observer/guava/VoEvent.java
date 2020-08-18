package april.pattern.behavioral.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author yanzx
 */
public class VoEvent {

    @Subscribe
    public void observer(Object arg) {
        if (arg instanceof Vo) {
            System.out.println("执行VoEvent方法，传参为：" + arg);
        }
    }
}
