package april.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例（枚举式单例，最优雅的写法）
 * 将每一个实例都缓存到一个容器中，使用唯一标识获取实例！
 *
 * @author yanzx
 * @date 2020/06/04 23:38
 */
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    public static Object getInstance(String className) {

        Object instance = null;

        if (!ioc.containsKey(className)) {

            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className, instance);
                return instance;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return ioc.get(className);
    }
}
