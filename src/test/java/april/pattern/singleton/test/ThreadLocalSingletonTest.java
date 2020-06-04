package april.pattern.singleton.test;

import april.pattern.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author yanzx
 * @date 2020/06/05 00:14
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        // 保证线程内部全局唯一
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());


        Thread thread1 = new Thread(new ExecutorThread());
        Thread thread2 = new Thread(new ExecutorThread());

        thread1.start();
        thread2.start();




    }
}
