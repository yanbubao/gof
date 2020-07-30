package april.pattern.structural.proxy.dynamicproxy;

/**
 * @author yanzx
 */
public interface IMkProxy {

    default void after() {
        System.out.println("mk after！");
    }

    default void before() {
        System.out.println("mk before！");
    }
}
