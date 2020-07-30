package april.pattern.creational.singleton.test;

import april.pattern.creational.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author yanzx
 * @date 2020/06/03 23:55
 */
public class ExecutorThread implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {

        // LazySimpleSingleton instance = LazySimpleSingleton.getInstance();
       // LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        //LazyStaticInnerClassSingleton instance = LazyStaticInnerClassSingleton.getInstance();

        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();

        System.out.println(Thread.currentThread().getName() + ":" + instance);
    }
}
