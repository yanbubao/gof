package april.pattern.singleton.lazy;

/**
 * 双重检查锁懒汉单例
 *
 * @author yanzx
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance;

    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){

        // 检查是否要阻塞
        if(instance == null) {
            synchronized (LazyDoubleCheckSingleton.class){

                // 重新检查实例是否被创建
                if(instance == null){
                    instance = new LazyDoubleCheckSingleton();
                    // 指令重新排序的问题，定义instance时使用volatile解决该问题？ TODO
                }
            }
        }

        return instance;
    }
}
