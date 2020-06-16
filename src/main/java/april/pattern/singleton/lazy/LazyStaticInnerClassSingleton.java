package april.pattern.singleton.lazy;

/**
 * 静态内部类实现懒汉单例
 *
 * @author yanzx
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton() {
        // 防止反射破坏单例特性
        if (LazyHolder.INSTANCE != null) {
            throw new RuntimeException("非法创建单例类 LazyStaticInnerClassSingleton！");
        }
    }

    public static LazyStaticInnerClassSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }

}
