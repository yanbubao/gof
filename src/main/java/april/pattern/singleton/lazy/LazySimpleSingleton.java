package april.pattern.singleton.lazy;

/**
 * 懒汉式单例：
 * 优点：节省了内存（lazy）
 * 缺点：性能低
 *
 * @author yanzx
 * @date 2020/06/01 22:49
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
