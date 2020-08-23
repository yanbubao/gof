package april.pattern.behavioral.observer.mouse;

import april.pattern.behavioral.observer.mouse.core.EventListener;
import april.pattern.behavioral.observer.mouse.handler.Mouse;
import april.pattern.behavioral.observer.mouse.handler.MouseEventListener;
import april.pattern.behavioral.observer.mouse.handler.MouseEventType;

/**
 * 鼠标事件demo
 *
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        // 创建观察者
        EventListener listener = new MouseEventListener();

        // 创建被观察者
        Mouse mouse = new Mouse();
        mouse.addListener(MouseEventType.ON_CLICK, listener);
        mouse.addListener(MouseEventType.ON_MOVE, listener);

        mouse.click();

    }
}
