package april.pattern.singleton.test;


/**
 * Test.
 *
 * @author yanzx
 * @date 2020/06/03 23:53
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println("main-thread.");

    }
}
