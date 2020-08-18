package april.pattern.behavioral.observer.mouse.core;

import lombok.*;

import java.lang.reflect.Method;

/**
 * @author yanzx
 */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Event {
    /**
     * 事件源，动作是谁发出的
     */
    private Object source;

    /**
     * 事件触发（观察者），要通知谁
     */
    private EventListener target;

    /**
     * 回调，观察者给出的回应
     */
    private Method callback;

    /**
     * 事件名称
     */
    private String eventName;

    /**
     * 事件触发事件
     */
    private Long time;

    public Event(EventListener target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Event setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }
}
