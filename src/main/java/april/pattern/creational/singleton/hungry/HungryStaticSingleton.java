package april.pattern.creational.singleton.hungry;

/**
 * 饿汉式单例：
 * 优点：执行效率高，性能高，没有任何锁！
 * 缺点：某些情况（大量的Class）造成内存浪费！
 *
 * @author yanzx
 */
public class HungryStaticSingleton {

    private HungryStaticSingleton() {
    }

    private static final HungryStaticSingleton hungryStaticSingleton;

    static {
        hungryStaticSingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance() {
        return hungryStaticSingleton;
    }
}
