package april.pattern.creational.singleton.test;

import april.pattern.creational.singleton.register.ContainerSingleton;

/**
 * @author yanzx
 * @date 2020/06/04 23:43
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {

        Object instance1 = ContainerSingleton.getInstance("april.pattern.creational.singleton.test.Pojo");

        Object instance2 = ContainerSingleton.getInstance("april.pattern.creational.singleton.test.Pojo");

        System.out.println(instance1 == instance2);
    }
}
