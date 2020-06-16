package april.pattern.singleton.threadlocal;

/**
 * ThreadLocal单例
 * 保证线程内部全局唯一，且天生线程安全！
 *
 * @author yanzx
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton(){}

    private static final ThreadLocal<ThreadLocalSingleton> THREAD_LOCAL_INSTANCE =

            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    public static ThreadLocalSingleton getInstance(){
        return THREAD_LOCAL_INSTANCE.get();
    }
}
