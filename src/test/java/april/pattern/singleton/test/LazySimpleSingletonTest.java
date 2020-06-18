package april.pattern.singleton.test;


/**
 * Test.
 *
 * @author yanzx
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
