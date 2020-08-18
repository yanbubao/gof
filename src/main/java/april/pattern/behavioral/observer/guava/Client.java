package april.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * 基于com.google.guava使用注解实现观察者模式demo
 *
 * @see EventBus
 * @see Subscribe
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        PojoEvent pojoEvent = new PojoEvent();
        VoEvent voEvent = new VoEvent();

        eventBus.register(pojoEvent);
        eventBus.register(voEvent);

        eventBus.post(new Vo("vo event"));
    }
}
