package april.pattern.behavioral.observer.mouse.handler;

import april.pattern.behavioral.observer.mouse.core.Event;
import april.pattern.behavioral.observer.mouse.core.EventListener;

/**
 * 观察者的具体实现
 *
 * @author yanzx
 */
public class MouseEventListener implements EventListener {

    public void onClick(Event e) {
        System.out.println("==========触发鼠标单击事件========\n" + e);
    }

    public void onMove(Event e) {
        System.out.println("==========触发鼠标移动事件========\n" + e);
    }
}
