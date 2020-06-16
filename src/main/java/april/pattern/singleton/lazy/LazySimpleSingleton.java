package april.pattern.singleton.lazy;

/**
 * 懒汉式单例：
 * 优点：节省了内存（lazy）
 * 缺点：性能低
 *
 * @author yanzx
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton instance;

    public static LazySimpleSingleton getInstance() {

        if (instance == null) {
            instance = new LazySimpleSingleton();
        }

        return instance;
    }
}
