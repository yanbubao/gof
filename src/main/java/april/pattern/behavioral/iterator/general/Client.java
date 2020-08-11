package april.pattern.behavioral.iterator.general;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个容器对象
        IAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        // 获取迭代器
        Iterator<String> iterator = aggregate.iterator();
        // 遍历
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
