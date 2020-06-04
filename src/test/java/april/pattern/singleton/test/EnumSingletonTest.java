package april.pattern.singleton.test;

import april.pattern.singleton.register.EnumSingleton;

import java.lang.reflect.Constructor;

/**
 * 枚举单例
 * 不会被反射破坏！
 *
 * @author yanzx
 * @date 2020/06/04 23:49
 */
public class EnumSingletonTest {

    public static void main(String[] args) {

        // EnumSingleton instance = EnumSingleton.INSTANCE;

        try {

            Class<?> clazz = EnumSingleton.class;

            /**
             * Enum没有无参构造!
             * protected Enum(String name, int ordinal) {
             *         this.name = name;
             *         this.ordinal = ordinal;
             *     }
             */
            // 下面会抛出java.lang.NoSuchMethodException: april.pattern.singleton.register.EnumSingleton.<init>()
            // Constructor<?> c = clazz.getDeclaredConstructor();

            Constructor<?> c = clazz.getDeclaredConstructor(String.class, int.class);

            c.setAccessible(true);

            /**
             * jdk中规定不能使用反射创建Enum实例！
             * java.lang.reflect.Constructor.newInstance(Constructor.java:417)
             *
             * if ((clazz.getModifiers() & Modifier.ENUM) != 0)
             *             throw new IllegalArgumentException("Cannot reflectively create enum objects");
             */
            Object instance = c.newInstance(); // Cannot reflectively create enum objects .

            System.out.println(instance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
