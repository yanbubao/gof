package april.pattern.behavioral.observer.mouse.handler;

import april.pattern.behavioral.observer.mouse.core.EventContext;

/**
 * 具体被观察者
 *
 * @author yanzx
 */
public class Mouse extends EventContext {
    public void click() {
        System.out.println("调用单击方法");
        this.trigger(MouseEventType.ON_CLICK);
    }

    public void move() {
        System.out.println("调用移动方法");
        this.trigger(MouseEventType.ON_MOVE);
    }
}
