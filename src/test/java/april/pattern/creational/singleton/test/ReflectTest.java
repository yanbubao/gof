package april.pattern.creational.singleton.test;

import april.pattern.creational.singleton.lazy.LazyStaticInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * 测试单例被反射破坏
 *
 * @author yanzx
 * @date 2020/06/04 00:09
 */
public class ReflectTest {

    public static void main(String[] args) {

        try {
            Class<?> clazz = LazyStaticInnerClassSingleton.class;
            Constructor<?> c = clazz.getDeclaredConstructor();

            c.setAccessible(true);

            Object o1 = c.newInstance();
            Object o2 = c.newInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
