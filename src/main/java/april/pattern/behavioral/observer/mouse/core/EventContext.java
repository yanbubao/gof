package april.pattern.behavioral.observer.mouse.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 被观察者抽象
 *
 * @author yanzx
 */
public abstract class EventContext {
    protected final Map<String, Event> events = new HashMap<>();

    public void addListener(String eventType, EventListener target, Method callback) {
        events.put(eventType, new Event(target, callback));
    }

    public void addListener(String eventType, EventListener target) {
        try {
            this.addListener(eventType, target,
                    target.getClass().getMethod("on" + this.toUpperFirstCase(eventType), Event.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private String toUpperFirstCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
