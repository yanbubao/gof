package april.pattern.flyweight.general;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 享元工厂
 *
 * @author yanzx
 */
public class FlyweightFactory {

    private static final Map<String, IFlyweight> pool = new ConcurrentHashMap<>();

    /**
     * 因为内部状态具有不变性，所以作为缓存的key
     *
     * @param intrinsicState
     * @return
     */
    public static IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
