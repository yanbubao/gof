package april.pattern.structural.bridge.general;

/**
 * @author yanzx
 */
public class Client {
    public static void main(String[] args) {
        // 实例化一个具体实现
        IImplementor implA = new ConcreteImplementorA();

        // 创建抽象角色（桥梁），聚合实现
        Abstraction abstraction = new RefinedAbstraction(implA);

        // execute
        abstraction.operation();

    }
}
