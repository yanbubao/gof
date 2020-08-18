package april.pattern.behavioral.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * 基于com.google.guava使用注解实现观察者模式demo
 *
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
