package april.pattern.flyweight.general;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        IFlyweight flyweight1 = FlyweightFactory.getFlyweight("aa");
        IFlyweight flyweight2 = FlyweightFactory.getFlyweight("bb");

        flyweight1.operation("123");// hashcode 929338653
        flyweight2.operation("456");

        System.out.println("from pool");
        // 从缓存中获取
        IFlyweight flyweight3 = FlyweightFactory.getFlyweight("aa");
        flyweight3.operation("789");// hashcode 929338653
    }
}
