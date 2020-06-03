package april.pattern.singleton.hungry;

/**
 * 饿汉式单例：
 * 优点：执行效率高，性能高，没有任何锁！
 * 缺点：某些情况（大量的Class）造成内存浪费！
 *
 * @author yanzx
 * @date 2020/06/01 22:30
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
