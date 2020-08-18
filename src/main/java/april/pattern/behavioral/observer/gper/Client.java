package april.pattern.behavioral.observer.gper;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        // 被观察者
        GPer observable = GPer.getInstance();
        // 观察者
        Teacher tom = new Teacher("Tom");
        Teacher jerry = new Teacher("Jerry");

        observable.addObserver(tom);
        observable.addObserver(jerry);

        observable.publishQuestion(new Question("yanzx","观察者模式适用于哪些场景？"));
    }
}
